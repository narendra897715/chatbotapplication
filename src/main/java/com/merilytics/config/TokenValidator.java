/*package com.merilytics.config;

import java.util.List;

import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.merilytics.bo.EmployeeBO;
import com.merilytics.controller.EmployeeController;

@Named
public class TokenValidator {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Autowired
	private EmployeeController employeeController;

	@SuppressWarnings("unchecked")
	public String isToken(String token, HttpServletRequest request, HttpServletResponse response) {
		DetachedCriteria dc = DetachedCriteria.forClass(EmployeeBO.class);
		dc.add(Restrictions.eq("userToken", token));
		List<EmployeeBO> listofemployee = (List<EmployeeBO>) hibernateTemplate.findByCriteria(dc);

		if (listofemployee.size() == 0) {
			employeeController.onLoginFailure(request, response);

			return null;
		}

		String name = listofemployee.get(0).getFirstName() + " " + listofemployee.get(0).getLastName();

		return name;
	}

}
*/