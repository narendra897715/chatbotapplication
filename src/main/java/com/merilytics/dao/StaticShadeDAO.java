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
import com.merilytics.bo.StaticShadeBO;

@Configuration
public class StaticShadeDAO {

	// StaticShadeBO

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	
	

	@SuppressWarnings("unchecked")
	public List<StaticShadeBO> getStaticShadeDetails(Integer variant) {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticShadeBO.class);
		dc.add(Restrictions.eq("pkColorVariantID", variant));
		dc.add(Restrictions.eq("status", true));

		return (List<StaticShadeBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Autowired
	private DatabaseDAO databaseDAO;

	public List<Map<String, Object>> getShadeDetailsDatabase() {

		return databaseDAO.executeStoredProc(
				"SELECT sub.pkSubCategoryID, sub.subCategory, cat.pkCategoryID,cat.category from tbl_static_subcategory sub LEFT JOIN tbl_staitic_category cat ON sub.pkCategoryID = cat.pkCategoryID;");

	}
	
	@Transactional
	public Boolean insertStaticShadeDetails(StaticShadeBO staticShadeBO) {
		try {
			staticShadeBO.setStatus(true);
			authenticationTemplete.save(staticShadeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Transactional
	public Boolean updateStaticShadeDetails(StaticShadeBO staticShadeBO) {
		try {
			staticShadeBO.setStatus(true);
			authenticationTemplete.update(staticShadeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	@Transactional
	public Boolean deleteStaticShadeDetails(StaticShadeBO staticShadeBO) {
		try {
			authenticationTemplete.delete(staticShadeBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
