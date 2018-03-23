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
import com.merilytics.bo.StaticBottomriseBO;

@Configuration
public class StaticBottomriseDAO {

	// StaticBottomriseBo

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;
	


	@SuppressWarnings("unchecked")
	public List<StaticBottomriseBO> getStaticBottomriseDetails() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticBottomriseBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticBottomriseBO>) authenticationTemplete.findByCriteria(dc);
	}

	@Transactional
	public Boolean insertStaticBottomriseDetails(StaticBottomriseBO staticBottomriseBO) {
		try {
			staticBottomriseBO.setStatus(true);
			authenticationTemplete.save(staticBottomriseBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean updateStaticBottomriseDetails(StaticBottomriseBO staticBottomriseBO) {
		try {
			staticBottomriseBO.setStatus(true);
			authenticationTemplete.update(staticBottomriseBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Transactional
	public Boolean deleteStaticBottomriseDetails(StaticBottomriseBO staticBottomriseBO) {
		try {
			authenticationTemplete.delete(staticBottomriseBO);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
