package cn.ekgc.dms.controoler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.ekgc.dms.pojo.entity.Role;
import cn.ekgc.dms.pojo.entity.User;
import cn.ekgc.dms.pojo.vo.Page;
import cn.ekgc.dms.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String getLoginForm() throws Exception{
		return "user/user_login_form";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String loginUser(User user) throws Exception{
		//判断电话号码和密码不为空或者空格
		if (user.getCellphone() != null && !"".equals(user.getCellphone().trim()) &&
				user.getPassword() != null && !"".equals(user.getPassword().trim())) {
			//判断数据库中是否有user
			user = userService.loginUser(user);
			if (user != null) {
				session.setAttribute("user", user);
				return "redirect:list";
			}
		}
		return "redirect:login";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getUserListByPage(Long pageNum, Long pageSize)throws Exception{
		Page<User> page = new Page<User>(pageNum, pageSize);
		//使用业务层进行翻页查询
		page = userService.getUserListByPage(page);
		return new ModelAndView("user/user_list", "page", page);
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateUserr() throws Exception{
		//获取主键
		Long userId =Long.parseLong(request.getParameter("userId"));
		User user = userService.findUserById(userId);
		return new ModelAndView("user/update_form","user",user);
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser() throws Exception{
		Long userId = Long.parseLong(request.getParameter("userId"));
		String username = request.getParameter("username");
		String gender = request.getParameter("gender");
		String cellphone = request.getParameter("cellphone");
		String idCard = request.getParameter("idCard");
		String password = request.getParameter("password");
		User user = new User(userId, username, cellphone, password, gender, idCard);
		int flag = userService.updateUser(user);
		if (flag > 0) {
			return "redirect:login";
		}
		return "update_form";
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String adduser() {
		return "user/add_user_form";
	}
	@RequestMapping(value = "/add_user", method = RequestMethod.POST)
	public String addUser() throws Exception{
		Long roleId = Long.parseLong(request.getParameter("roleId"));
		Role role = new Role(roleId);
		String username = request.getParameter("username");
		String cellphone = request.getParameter("cellphone");
		String gender = request.getParameter("gender");
		String password = request.getParameter("password");
		String idCard = request.getParameter("idCard");
		User user = new User(username, cellphone, password, gender, role, idCard);
		int count = userService.addUser(user);
		if (count > 0) {
			return "redirect:login";
		}
		return "user/add_user_form";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteUser() {
		Long userId = Long.parseLong(request.getParameter("userId"));
		int count = userService.deleteUser(userId);
		return "redirect:list";
	}
}