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
import com.merilytics.bo.StaticNocategoryCodeBO;

@Configuration
public class StaticNocategoryCodeDAO {

	// StaticNocategoryBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticNocategoryCodeBO> getStaticNocategoryCodeDetails(Integer nOCategoryID) {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticNocategoryCodeBO.class);
		dc.add(Restrictions.eq("pknOCategoryID", nOCategoryID));
		dc.add(Restrictions.eq("status", true));
		return (List<StaticNocategoryCodeBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticNocategoryCodeDetails(StaticNocategoryCodeBO staticNocategoryCodeBO) {
		try {
			staticNocategoryCodeBO.setStatus(true);
			authenticationTemplete.save(staticNocategoryCodeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticNocategoryCodeDetails(StaticNocategoryCodeBO staticNocategoryCodeBO) {
		try {
			staticNocategoryCodeBO.setStatus(true);
			authenticationTemplete.update(staticNocategoryCodeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticNocategoryCodeDetails(StaticNocategoryCodeBO staticNocategoryCodeBO) {
		try {
			authenticationTemplete.delete(staticNocategoryCodeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List<Map<String, Object>> getNocategoryCode() {

		return databaseDAO.executeStoredProc("CALL getNocategoryCode();");

	}

}
