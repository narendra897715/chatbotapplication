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
import com.merilytics.bo.StaticCollectionBO;

@Configuration
public class StaticCollectionDAO {

	// StaticCollectionBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticCollectionBO> getStaticCollectionDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticCollectionBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticCollectionBO>) authenticationTemplete.findByCriteria(dc);
	}
	@Transactional
	public Boolean insertStaticCollectionDetails(StaticCollectionBO staticCollectionBO) {
		try {
			staticCollectionBO.setStatus(true);
			authenticationTemplete.save(staticCollectionBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticCollectionDetails(StaticCollectionBO staticCollectionBO) {
		try {
			staticCollectionBO.setStatus(true);
			authenticationTemplete.update(staticCollectionBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean deleteStaticCollectionDetails(StaticCollectionBO staticCollectionBO) {
		try {
			authenticationTemplete.delete(staticCollectionBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
