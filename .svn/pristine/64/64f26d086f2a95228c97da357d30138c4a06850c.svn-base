package com.merilytics.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@NamedNativeQuery(name="roles",query="select * from tbl_roles")
@Table(name = "tbl_Static_Roles")
public class RoleBO {

	@Id
	@GenericGenerator(name = "gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	
	@Column(name = "role_id")
	private Integer roleId;

	@Column(name = "role_name")
	private String roleName;

	
	@Column(name="role_description")
	private String role_description;

	
	

	public Integer getRoleId() {
		return roleId;
	}


	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}


	public String getRole_description() {
		return role_description;
	}


	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	

	

}
