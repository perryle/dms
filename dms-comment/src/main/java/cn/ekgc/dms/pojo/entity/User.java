package cn.ekgc.dms.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String username;
	private String cellphone;
	private String password;
	private String gender;
	private Role role;
	private String idCard;
	private Date createDate;
	private Date updateDate;
	
	public User() {}
	public User(String username, String cellphone, String gender, String idCard) {
		super();
		this.username = username;
		this.cellphone = cellphone;
		this.gender = gender;
		this.idCard = idCard;
	}
	
	public User(String username, String cellphone, String password, String gender, Role role, String idCard) {
		super();
		this.username = username;
		this.cellphone = cellphone;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.idCard = idCard;
	}
	public User(Long userId, String username, String cellphone, String gender, String idCard) {
		super();
		this.userId = userId;
		this.username = username;
		this.cellphone = cellphone;
		this.gender = gender;
		this.idCard = idCard;
	}
	
	public User(Long userId, String username, String cellphone, String password, String gender, String idCard) {
		super();
		this.userId = userId;
		this.username = username;
		this.cellphone = cellphone;
		this.password = password;
		this.gender = gender;
		this.idCard = idCard;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
