package com.merilytics.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticColorvariantBO;

@Configuration
public class StaticColorvariantDAO {

	// StaticColorvariantBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@SuppressWarnings("unchecked")
	public List<StaticColorvariantBO> getStaticColorvariantDetails(Integer family) {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticColorvariantBO.class);
		dc.add(Restrictions.eq("pkColorFamilyID", family));
		dc.add(Restrictions.eq("status", true));
		return (List<StaticColorvariantBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticColorvariantDetails(StaticColorvariantBO staticColorvariantBO) {
		try {
			staticColorvariantBO.setStatus(true);
			authenticationTemplete.save(staticColorvariantBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticColorvariantDetails(StaticColorvariantBO staticColorvariantBO) {
		try {
			staticColorvariantBO.setStatus(true);
			authenticationTemplete.update(staticColorvariantBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticColorvariantDetails(StaticColorvariantBO staticColorvariantBO) {
		try {
			authenticationTemplete.delete(staticColorvariantBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Autowired
	private DatabaseDAO databaseDAO;

	public List<Map<String, Object>> getColourVarient() {

		return databaseDAO.executeStoredProc(" call getColourVarient();");

	}

	public List<Map<String, Object>> getShade() {

		return databaseDAO.executeStoredProc(" call getShade();");

	}

}
