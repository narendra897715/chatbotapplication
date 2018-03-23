package com.merilytics.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaticColorfamilyBO;

@Configuration
public class StaticColorfamilyDAO {

	// StaticColorfamilyBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticColorfamilyBO> getStaticColorfamilyDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticColorfamilyBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticColorfamilyBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticColorfamilyDetails(StaticColorfamilyBO staticColorfamilyBO) {
		try {
			staticColorfamilyBO.setStatus(true);
			authenticationTemplete.save(staticColorfamilyBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean updateStaticColorfamilyDetails(StaticColorfamilyBO staticColorfamilyBO) {
		try {
			staticColorfamilyBO.setStatus(true);
			authenticationTemplete.update(staticColorfamilyBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Transactional
	public Boolean deleteStaticColorfamilyDetails(StaticColorfamilyBO staticColorfamilyBO) {
		try {
			authenticationTemplete.delete(staticColorfamilyBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
