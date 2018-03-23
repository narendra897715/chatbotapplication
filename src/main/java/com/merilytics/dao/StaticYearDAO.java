package com.merilytics.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.merilytics.bo.StaticYearBO;



@Configuration
public class StaticYearDAO {
	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@SuppressWarnings("unchecked")
	public List<StaticYearBO> getStaticYear() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticYearBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticYearBO>) authenticationTemplete.findByCriteria(dc);
	}

}
