package cn.ekgc.dms.dao;

import java.util.List;
import java.util.Map;

import cn.ekgc.dms.pojo.entity.User;

public interface UserDao {
	/**
	 * 根据查询条件查询user
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	public User findUserByQuery(User user) throws Exception;
	/**
	 * 分页查询
	 * @param paraMap
	 * @return List<User>
	 */
	public List<User> findUserByPage(Map<String, Object> paraMap);
	/**
	 * 根据用户主键查询用户信息
	 * @param userId
	 * @return User
	 */
	public User findUserById(Long userId);
	/**
	 * 修改信息
	 * @param user
	 * @return int
	 */
	public int updateUser(User user);
	/**
	 * 添加用户
	 * @param user
	 * @return int
	 */
	public int insertUser(User user);
	/**
	 * 删除用户
	 * @param userId
	 * @return int 
	 */
	public int deleteUser(Long userId);

}
