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

import com.merilytics.bo.StaticNOSizeBO;

@Configuration
public class StaticNoSizeDAO {

	// StaticSizeBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired
	private DatabaseDAO databaseDAO;

	@SuppressWarnings("unchecked")
	public List<StaticNOSizeBO> getStaticNoSizeDetails(Integer pkSizeID) {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticNOSizeBO.class);
		dc.add(Restrictions.eq("pkSizeID", pkSizeID));
		dc.add(Restrictions.eq("status", true));
		return (List<StaticNOSizeBO>) authenticationTemplete.findByCriteria(dc);
	}

	public List<Map<String, Object>> getStaticNoSizeDetailsDatabase() {
		return databaseDAO.executeStoredProc(" call getstaticNoSize()");

	}

	@Transactional
	public Boolean insertStaticSizeBODetails(StaticNOSizeBO staiticCategoryBO) {
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
	public Boolean updateStaticSizeBODetails(StaticNOSizeBO staiticCategoryBO) {
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
	public Boolean deleteStaticSizeBODetails(StaticNOSizeBO staiticCategoryBO) {
		try {
			authenticationTemplete.delete(staiticCategoryBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
