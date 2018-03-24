package com.merilytics.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.merilytics.mail.EmailTemplate;
import com.merilytics.util.EmailTemplateStructure;

@Configuration
public class ChatDao {

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired(required = true)
	@Qualifier("emailTemplete")
	private EmailTemplate emailTemplate;
	
	/*@Autowired
	private EmailTemplateStructure emailStructure;*/


	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public Map<String, Object> getChatingOutput(String outPut) {
		String networkOrNot = outPut.substring(0, Math.min(outPut.length(), 13));

		SessionFactory sf = authenticationTemplete.getSessionFactory();
		Session session = sf.openSession();

		Map<String, Object> mapOfdata = null;
		List<Map<String, Object>> listOfData = null;

		if (!networkOrNot.trim().equalsIgnoreCase("Raise ticket:")) {
			try {
				NativeQuery query = session.createNativeQuery("Exec dbo.usp_GetReply :input");
				query.setParameter("input", outPut);
				query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
				listOfData = query.getResultList();

				mapOfdata = listOfData.get(0);

				return mapOfdata;

			} catch (Exception err) {
				mapOfdata.put("status", "Please check your sentence");
				return mapOfdata;
			}

		} else {

			try {
				NativeQuery query = session.createNativeQuery("Exec dbo.usp_raiseTicket :input");
				query.setParameter("input", outPut);
				query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
				listOfData = query.getResultList();

				mapOfdata = listOfData.get(0);

				String ticket = mapOfdata.get("status").toString();
				String ticketID = ticket.split("'")[1].split("'")[0];
				String emailContent = EmailTemplateStructure.mailForTicketRaising(ticket);
				emailTemplate.sendMailtoPmCycle("hhd", "Ticket Submission -  " + ticketID, emailContent);
				return mapOfdata;

			} catch (Exception err) {
				mapOfdata.put("status", "Please check your sentence");
				return mapOfdata;
			}
		}

	}

}
