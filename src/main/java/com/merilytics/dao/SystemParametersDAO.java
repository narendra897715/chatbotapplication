package com.merilytics.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.SystemParametersBO;

@Configuration
public class SystemParametersDAO {
	@Autowired(required=true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;


	@Transactional
	public Boolean storeSystemParameters(SystemParametersBO dto){
	Boolean isStored = false;
	try{
		 dto.setStatus("active");
		 dto.setCreationDate(new Timestamp(new Date().getTime()));
		 authenticationTemplete.save(dto);
		 isStored = true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return isStored;
	}
	
	@Transactional
	public Boolean updateSystemParameters(SystemParametersBO dto){
	Boolean isupdated = false;
	try{
		 SystemParametersBO pdto = authenticationTemplete.get(dto.getClass(),dto.getCompanyCode());
		 pdto.setAdminEmail(dto.getAdminEmail());
		 pdto.setItSupportEmail(dto.getItSupportEmail());
		 pdto.setSMTPPort(dto.getSMTPPort());
		 pdto.setSMTPServerIp(dto.getSMTPServerIp());
		 pdto.setItSupportPassword(dto.getItSupportPassword());
		 pdto.setUpdationDate(new Timestamp(new Date().getTime()));
		 authenticationTemplete.save(dto);
		 isupdated = true;
	}catch(Exception e){
		e.printStackTrace();
	}
	return isupdated;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<SystemParametersBO> getSystemParameters() {
		return (ArrayList<SystemParametersBO>) authenticationTemplete.findByCriteria(DetachedCriteria.forClass(SystemParametersBO.class).add(Restrictions.eq("status","active")));
	}
	
	
	
}
