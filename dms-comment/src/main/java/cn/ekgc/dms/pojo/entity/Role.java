package cn.ekgc.dms.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long roleId;
	private String roleName;
	private Date createDate;
	private Date updateDate;
	
	public Role(Long roleId) {
		super();
		this.roleId = roleId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
