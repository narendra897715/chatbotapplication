package com.merilytics.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.merilytics.bo.StaticMonthBO;

@Configuration
public class StaticMonthDAO {

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@SuppressWarnings("unchecked")
	public List<StaticMonthBO> getStaticMonth() {
		DetachedCriteria dc = DetachedCriteria.forClass(StaticMonthBO.class);
		dc.add(Restrictions.eq("status", true));
		return (List<StaticMonthBO>) authenticationTemplete.findByCriteria(dc);
	}

}
