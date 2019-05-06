package cn.ekgc.dms.service;

import cn.ekgc.dms.pojo.entity.User;
import cn.ekgc.dms.pojo.vo.Page;

public interface UserService {
	/**
	 * 使用联系电话和登录密码登录
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	public User loginUser(User user) throws Exception;
	/**
	 * 分页查询
	 * @param page
	 * @return Page<User>
	 */
	public Page<User> getUserListByPage(Page<User> page) throws Exception;
	/**
	 * 根据用户主键查询用户信息
	 * @param userId
	 * @return User
	 */
	public User findUserById(Long userId);
	/**
	 * 修改信息
	 * @param user
	 * @return boolean
	 */
	public int updateUser(User user);
	/**
	 * 添加用户
	 * @param user
	 * @return int
	 */
	public int addUser(User user);
	/**
	 * 删除用户
	 * @param userId
	 * @return int 
	 */
	public int deleteUser(Long userId);
	

}
