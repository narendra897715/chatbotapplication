package com.merilytics.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.EmployeeBO;
import com.merilytics.dao.EmployeeDAO;
import com.merilytics.dto.UserIdPasswordDTO;

@Configuration
public class EmployeeModel {

	@Autowired
	private EmployeeDAO dao;

	public EmployeeDAO getDao() {
		return dao;
	}

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	public HashMap<String, Object> onLogin(String email, String roleName, HttpServletResponse response) {
		return dao.onloginOperation(email, roleName, response);
	}

	public Boolean forceChangePassword(String email, String password) {
		return dao.forceChangePassword(email, password);
	}

	public Map forgotPasswordAction(String email) {
		return dao.forgotPasswordAction(email);
	}

	public Boolean isAdmin(Integer roleId) {
		return dao.isAdmin(roleId);
	}

	public Boolean deleteUser(String email) {
		return dao.deleteUser(email);
	}

	public Boolean editUser(EmployeeBO dto) {
		return dao.editUser(dto);
	}

	public Boolean changePassword(UserIdPasswordDTO dto) {
		return dao.chagePassword(dto);
	}

	public Boolean checkEmail(String email) {
		return dao.checkEmail(email);
	}

	@SuppressWarnings("rawtypes")
	public List getUsers() {
		return dao.getUsers();
	}

	public HashMap<String, Object> refreshSerive(String email) {

		return dao.refreshSerive(email);

	}

	public List getUserApps() {
		return dao.getApps();
	}

	public String getEmailWithToken(String token) {
		return dao.getEmail(token);
	}

	public String OTPAuthCheck(String token) {
		return dao.OTPAuth(token);
	}

	public boolean updateToken(String email) {
		return dao.updateTokenOnLogout(email);
	}

	public EmployeeBO getEmployeeDetailsWithToken(String token) {


		String email = dao.getEmail(token);
		

		EmployeeBO user = dao.employeeDataWithToken(email);

		return user;

	}

}
