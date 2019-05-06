package cn.ekgc.dms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ekgc.dms.dao.UserDao;
import cn.ekgc.dms.pojo.entity.User;
import cn.ekgc.dms.pojo.vo.Page;
import cn.ekgc.dms.service.UserService;
@Service(value="userService")
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private UserDao userDao;
	/**
	 * 使用联系电话和登录密码登录
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	public User loginUser(User user) throws Exception {
		user = userDao.findUserByQuery(user);
		return user;
	}
	/**
	 * 分页查询
	 * @param page
	 * @return Page<User>
	 */
	public Page<User> getUserListByPage(Page<User> page) throws Exception{
		//根据分页对象，封装分页信息
		Map<String, Object> paraMap = new HashMap<>();
		//计算开始下标
		Long begin = (page.getPageNum()-1) * page.getPageSize();
		//获得连续查询的条数
		Long size = page.getPageSize();
		paraMap.put("begin", begin);
		paraMap.put("size", size);
		//开始分页查询
		List<User> list = userDao.findUserByPage(paraMap);
		//查询总数量
		Long totalCount = (long) userDao.findUserByPage(null).size();
		//计算总页数
		Long totalPage = (totalCount % page.getPageSize() == 0) ? (totalCount / page.getPageSize()):(totalCount / page.getPageSize()) + 1;
		page.setList(list);
		page.setTotalCount(totalCount);
		page.setTotalPage(totalPage);
		return page;
	}
	/**
	 * 根据用户主键查询用户信息
	 * @param userId
	 * @return User
	 */
	public User findUserById(Long userId) {
		return userDao.findUserById(userId);
	}
	/**
	 * 修改信息
	 * @param user
	 * @return int
	 */
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}
	/**
	 * 添加用户
	 * @param user
	 * @return int
	 */
	public int addUser(User user) {
		return userDao.insertUser(user);
	}
	/**
	 * 删除用户
	 * @param userId
	 * @return int 
	 */
	public int deleteUser(Long userId) {
		return userDao.deleteUser(userId);
	}
	

}
