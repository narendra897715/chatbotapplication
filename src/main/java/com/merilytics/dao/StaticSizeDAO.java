package com.merilytics.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.StaticSizeBO;

@Configuration
public class StaticSizeDAO {

	// StaticSizeBO
	
	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;
	
	@SuppressWarnings("unchecked")
	public List<StaticSizeBO> getStaticSizeDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticSizeBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticSizeBO>) authenticationTemplete.findByCriteria(dc);
	}
	
	@Transactional
	public Boolean insertStaticSizeBODetails(StaticSizeBO staiticCategoryBO) {
		try {
			staiticCategoryBO.setStatus(true);
			authenticationTemplete.save(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticSizeBODetails(StaticSizeBO staiticCategoryBO) {
		try {
			staiticCategoryBO.setStatus(true);
			authenticationTemplete.update(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	@Transactional
	public Boolean deleteStaticSizeBODetails(StaticSizeBO staiticCategoryBO) {
		try {
			authenticationTemplete.delete(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
}
