package com.merilytics.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaiticCategoryBO;
import com.merilytics.bo.StaticCollarBO;

@Configuration
public class StaticCollarDAO {
	// StaticCollarBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticCollarBO> getStaticCollarDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticCollarBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticCollarBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticCollarDetails(StaticCollarBO staticCollarBO) {
		try {
			staticCollarBO.setStatus(true);
			authenticationTemplete.save(staticCollarBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticCollarDetails(StaticCollarBO staticCollarBO) {
		try {
			staticCollarBO.setStatus(true);
			authenticationTemplete.update(staticCollarBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean deleteStaticCollarDetails(StaticCollarBO staticCollarBO) {
		try {
			authenticationTemplete.delete(staticCollarBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
