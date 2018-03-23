package com.merilytics.dao;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.merilytics.bo.EmployeeBO;
import com.merilytics.bo.RoleBO;
import com.merilytics.dto.UserIdPasswordDTO;
import com.merilytics.mail.EmailTemplate;
import com.merilytics.util.DateOperations;
import com.merilytics.util.EmailTemplateStructure;
import com.merilytics.util.HibernateUtil;
import com.merilytics.util.PasswordGenerator;

@Configuration
public class EmployeeDAO {

	@Autowired(required = true)
	@Qualifier("authenticationTemplete")
	private HibernateTemplate authenticationTemplete;

	@Autowired(required = true)
	@Qualifier("emailTemplete")
	private EmailTemplate emailTemplate;

	// change this from static so that new token
	String token = null;

	@Transactional
	public EmployeeBO onLogIn(String email) {
		EmployeeBO user = findUserByEmail(email);
		EmployeeBO beforeLogin = new EmployeeBO();

		token = generateToken(user.getFirstName());

		beforeLogin.setiD(user.getiD());
		beforeLogin.setEligibility_for_appraisal(user.isEligibility_for_appraisal());
		beforeLogin.setEligibility_to_provide_feedback(user.isEligibility_to_provide_feedback());
		beforeLogin.setFirstName(user.getFirstName());
		beforeLogin.setLastName(user.getLastName());
		beforeLogin.setLast_login_datetime(user.getLast_login_datetime());
		beforeLogin.setLast_Password_Change_Date(user.getLast_Password_Change_Date());
		beforeLogin.setEmail(user.getEmail());
		beforeLogin.setRole_id(user.getRole_id());
		beforeLogin.setForcePasswordChange(user.getForcePasswordChange());
		beforeLogin.setContactNo(user.getContactNo());
		beforeLogin.setDate_of_Joining(user.getDate_of_Joining());
		beforeLogin.setJobType(user.getJobType());

		beforeLogin.setDesignationID(user.getDesignationID());
		beforeLogin.setWorkStreamID(user.getWorkStreamID());
		beforeLogin.setImmediate_Reporting_Manager_ID(user.getImmediate_Reporting_Manager_ID());
		beforeLogin.setUserToken(token);

		user.setLast_login_datetime(new Timestamp(new Date().getTime()));
		// create and store token in DB
		user.setUserToken(token);
		user.setTokenCreationDate(new Timestamp(new Date().getTime()));
		return beforeLogin;
	}

	public Boolean isAdmin(Integer roleId) {
		Boolean isAdmin = false;
		try {
			RoleBO dto = authenticationTemplete.get(RoleBO.class, roleId);
			if (dto.getRoleId().equals(1)) {
				isAdmin = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isAdmin;
	}

	@SuppressWarnings("unchecked")
	public EmployeeBO findUserByEmail(String email) {
		DetachedCriteria dc = DetachedCriteria.forClass(EmployeeBO.class);

		dc.add(Restrictions.eq("email", email));

		dc.add(Restrictions.eq("status", true));

		List<EmployeeBO> l = (List<EmployeeBO>) authenticationTemplete.findByCriteria(dc);

		EmployeeBO u = null;
		try {
			if (!l.isEmpty()) {
				u = l.get(0);
			}

			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Transactional
	public Boolean forceChangePassword(String email, String password) {
		Boolean isChanged = null;
		try {
			BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
			EmployeeBO user = findUserByEmail(email);
			String currentPassword = user.getPassword();
			String oldPassword1 = user.getPrepassword1();
			String oldPassword2 = user.getPrepassword2();
			String oldPassword3 = user.getPrepassword3();

			// System.out.println(currentPassword);

			if (bcrypt.matches(password, currentPassword) || bcrypt.matches(password, oldPassword1)
					|| bcrypt.matches(password, oldPassword2) || bcrypt.matches(password, oldPassword3)) {
				isChanged = false;
			} else {
				user.setPassword(new BCryptPasswordEncoder().encode(password));
				user.setPrepassword1(currentPassword);
				user.setPrepassword2(oldPassword1);
				user.setPrepassword3(oldPassword2);
				user.setLast_Password_Change_Date(new Timestamp(new Date().getTime()));
				user.setForcePasswordChange(false);
				isChanged = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isChanged;
	}
	// token generation snippet

	// token generation code

	protected static SecureRandom random = new SecureRandom();

	public synchronized String generateToken(String username) {

		long longToken = Math.abs(random.nextLong());
		String random = Long.toString(longToken, 16);
		return (random);
	}

	@Transactional
	public HashMap<String, Object> onloginOperation(String email, String roleName, HttpServletResponse response) {
		HashMap<String, Object> sendMap = new HashMap<String, Object>();

		EmployeeBO ddto = onLogIn(email);
		String token = ddto.getUserToken();
		// forward the token to dataBase

		/*SessionFactory sf = authenticationTemplete.getSessionFactory();
		Transaction tx= null;
		Session session = sf.openSession();
		String queryString = "EXEC spl_menu '" + email + "'";
		try {
			Query query = session.createNativeQuery(queryString);
			tx=session.beginTransaction();
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			menu = query.getResultList();
			tx.commit();
		} catch (Exception e) {
			System.out.println("in exception block");
			tx.rollback();
			e.printStackTrace();
		}finally {
			
			session.close();
		}*/

		// menu0 is the old version of menu
		/*if (ddto.isEligibility_for_appraisal() || ddto.isEligibility_to_provide_feedback()) {
			sendMap.put("menu0", model.getScreensforLogin(ddto.getRole_id(), ddto.isEligibility_for_appraisal(),
					ddto.isEligibility_to_provide_feedback()));
		} else {
			HashMap<String, Object> returnvalue = new HashMap<String, Object>();
			returnvalue.put("messageid", "not_eligible_pmcycle");
			// JasonDataFormat.getJasonData(false, response);
			return returnvalue;
		}
		
		sendMap.put("stateProvider", model.stateProvider(ddto.getRole_id()));*/

		/*sendMap.put("admin", isAdmin(ddto.getRole_id()));
		
		if (ddto.getForcePasswordChange() == true) {
			sendMap.put("forcepasswordchange", "yes");
		
		} else {
			sendMap.put("forcepasswordchange", "no");
		}*/
		/*ObjectMapper mapper = new ObjectMapper();
		
		Map<String, Object> props = null;
		
		try {
			props = mapper.convertValue(databaselist.get(0), Map.class);
			Integer i = (Integer) props.get("id");
		
			props.remove("id");
			props.remove("status");
			props.remove("createdDate");
			props.remove("createdBy");
			props.remove("modifiedDate");
			props.remove("modifiedBy");
			props.put("PMcycleID", i);
			props.put("current_date", new java.sql.Timestamp(new Date().getTime()));
		
		} catch (Exception e) {
			System.out.println("Index out of bound because no pm cycle values");
		}
		
		ObjectMapper mapper1 = new ObjectMapper();
		Map<String, Object> props1 = mapper1.convertValue(ddto, Map.class);
		if (props != null) {
			props1.putAll(props);
		}
		*/
		sendMap.put("userData", ddto);
		sendMap.put("token", token);

		return sendMap;

	}

	@Transactional
	public HashMap<String, Object> refreshSerive(String email) {

		/*HashMap<String, Object> sendMap = new HashMap<String, Object>();
		
		DetachedCriteria detached1 = DetachedCriteria.forClass(EmployeeBO.class);
		detached1.add(Restrictions.eq("status", true));
		detached1.add(Restrictions.eq("email", email));
		
		List<EmployeeBO> ddto1 = (List<EmployeeBO>) authenticationTemplete.findByCriteria(detached1);
		
		EmployeeBO ddto = null;
		if (ddto1.size() > 0) {
			ddto = ddto1.get(0);
		} else {
			return null;
		}
		
		DetachedCriteria detached = DetachedCriteria.forClass(PMCycleBO.class);
		detached.add(Restrictions.eq("status", true));
		detached.add(Restrictions.eq("status", true));
		
		List<PMCycleBO> databaselist = (List<PMCycleBO>) authenticationTemplete.findByCriteria(detached);
		
		List menu = null;
		SessionFactory sf = authenticationTemplete.getSessionFactory();
		Session session = sf.openSession();
		String queryString = "EXEC spl_menu '" + email + "'";
		try {
			Query query = session.createNativeQuery(queryString);
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			menu = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// menu0 is the old version of menu
		if (ddto.isEligibility_for_appraisal() || ddto.isEligibility_to_provide_feedback()) {
			sendMap.put("menu0", model.getScreensforLogin(ddto.getRole_id(), ddto.isEligibility_for_appraisal(),
					ddto.isEligibility_to_provide_feedback()));
		} else {
			HashMap<String, Object> returnvalue = new HashMap<String, Object>();
			returnvalue.put("messageid", "not_eligible_pmcycle");
			// JasonDataFormat.getJasonData(false, response);
			return returnvalue;
		}
		
		sendMap.put("stateProvider", model.stateProvider(ddto.getRole_id()));
		
		sendMap.put("admin", isAdmin(ddto.getRole_id()));
		
		if (ddto.getForcePasswordChange() == true) {
			sendMap.put("forcepasswordchange", "yes");
		
		} else {
			sendMap.put("forcepasswordchange", "no");
		}
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String, Object> props = null;
		
		try {
			props = mapper.convertValue(databaselist.get(0), Map.class);
			Integer i = (Integer) props.get("id");
		
			props.remove("id");
			props.remove("status");
			props.remove("createdDate");
			props.remove("createdBy");
			props.remove("modifiedDate");
			props.remove("modifiedBy");
			props.put("PMcycleID", i);
			props.put("current_date", new java.sql.Timestamp(new Date().getTime()));
		
		} catch (Exception e) {
		}
		
		ObjectMapper mapper1 = new ObjectMapper();
		Map<String, Object> props1 = mapper1.convertValue(ddto, Map.class);
		if (props != null) {
			props1.putAll(props);
		}
		sendMap.put("userData", props1);
		sendMap.put("menu", menu);
		return sendMap;*/
		return null;
	}

	@Transactional
	public Map forgotPasswordAction(String email) {
		String isSuccessfull = null;
		Map map = new LinkedHashMap();
		try {
			Date currentDate = new Timestamp(new Date().getTime());
			EmployeeBO u = findUserByEmail(email);
			String token = null;
			if (u != null) {
				token = generateToken(u.getFirstName());
				if (DateOperations.diff(u.getLast_login_datetime(), currentDate) < 180) {
					u.setForcePasswordChange(true);
					String password = PasswordGenerator.generatePassword();
					u.setOTP(new BCryptPasswordEncoder()
							.encode(Base64.getEncoder().encodeToString(password.getBytes())));
					u.setOTPModifiedDate(new Timestamp(new Date().getTime()));
					u.setUserToken(token);
					u.setTokenCreationDate(new Timestamp(new Date().getTime()));

					String content = EmailTemplateStructure.forgetPassword(password);

					authenticationTemplete.merge(u);
					emailTemplate.sendMail(email, "New Password", content);
					isSuccessfull = "success";
					map.put("isSuccessfull", "success");
					map.put("token", token);
				} else {
					map.put("isSuccessfull", "error_account_disabled");
					isSuccessfull = "error_account_disabled";
				}
			} else {
				map.put("isSuccessfull", "unregistered email address");
				isSuccessfull = "unregistered email address";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public List getUsers() {
		SessionFactory sf = authenticationTemplete.getSessionFactory();
		Session session = sf.openSession();
		NativeQuery query = session.getNamedNativeQuery("getusers");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map> l = query.getResultList();
		Timestamp currentDate = new Timestamp(new Date().getTime());
		for (Map m : l) {
			Timestamp ts = (Timestamp) m.get("accountStatus");
			if (DateOperations.diff(ts, currentDate) > 180) {
				m.replace("accountStatus", ts, "false");
			} else {
				m.replace("accountStatus", ts, "true");
			}
		}
		return l;
	}

	@Transactional
	public Boolean deleteUser(String email) {
		Boolean isDeleted = false;
		try {
			EmployeeBO dto = authenticationTemplete.load(EmployeeBO.class, email);
			dto.setStatus(false);
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	public Boolean checkEmail(String email) {
		Boolean exists = true;
		if (authenticationTemplete.get(EmployeeBO.class, email) == null) {
			exists = false;
		}
		return exists;
	}

	@Transactional
	public Boolean editUser(EmployeeBO dto) {
		Boolean isUpdated = false;
		try {
			EmployeeBO user = authenticationTemplete.load(EmployeeBO.class, dto.getEmail());
			user.setModifiedDate(new Timestamp(new Date().getTime()));
			user.setFirstName(dto.getFirstName());
			user.setLastName(dto.getLastName());
			user.setContactNo(dto.getContactNo());
			user.setRole_id(dto.getRole_id());
			// user.setUpdationDate(new Timestamp(new Date().getTime()));
			isUpdated = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdated;
	}

	@Transactional
	public Boolean chagePassword(UserIdPasswordDTO dto) {
		Boolean isChanged = false;
		try {

			DetachedCriteria detached = DetachedCriteria.forClass(EmployeeBO.class);
			detached.add(Restrictions.eq("email", dto.getEmailId()));
			List<EmployeeBO> databaselist = (List<EmployeeBO>) authenticationTemplete.findByCriteria(detached);
			EmployeeBO user = authenticationTemplete.get(EmployeeBO.class, databaselist.get(0).getiD());
			user.setPassword(new BCryptPasswordEncoder().encode(dto.getPassword()));
			user.setLast_Password_Change_Date(new Timestamp(new Date().getTime()));
			isChanged = true;
			return isChanged;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isChanged;
	}

	public List getApps() {
		List apps = authenticationTemplete.find("from UserApplicationsBO");
		return apps;
	}

	@SuppressWarnings("unchecked")
	public String getEmail(String token) {
		String emailID = null;
		try {

			DetachedCriteria detached = DetachedCriteria.forClass(EmployeeBO.class);
			detached.add(Restrictions.eq("userToken", token));
			List<EmployeeBO> databaselist = (List<EmployeeBO>) authenticationTemplete.findByCriteria(detached);

			if (databaselist != null && databaselist.size() != 0) {
				emailID = databaselist.get(0).getEmail();
			} else {
				emailID = "Invalid Token";
			}
			return emailID;
		} catch (Exception e) {
			return "Invalid emailID";
		}
	}

	public String OTPAuth(String token) {
		Session session = HibernateUtil.getSession(authenticationTemplete);
		List<String> count = null;
		try {
			Query query = session.createNativeQuery("select OTP from tbl_employee where userToken=:token");
			query.setParameter("token", token);
			count = query.getResultList();
			if (count != null) {
				return count.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public boolean updateTokenOnLogout(String email) {
		boolean flag = false;
		try {
			EmployeeBO user = findUserByEmail(email);
			user.setUserToken(null);
			flag = true;
		} catch (Exception e) {

			flag = false;
		}

		return flag;
	}

	public EmployeeBO employeeDataWithToken(String email) {

		EmployeeBO user = findUserByEmail(email);

		EmployeeBO beforeLogin = new EmployeeBO();

		beforeLogin.setiD(user.getiD());
		beforeLogin.setEligibility_for_appraisal(user.isEligibility_for_appraisal());
		beforeLogin.setEligibility_to_provide_feedback(user.isEligibility_to_provide_feedback());
		beforeLogin.setFirstName(user.getFirstName());
		beforeLogin.setLastName(user.getLastName());
		beforeLogin.setLast_login_datetime(user.getLast_login_datetime());
		beforeLogin.setLast_Password_Change_Date(user.getLast_Password_Change_Date());
		beforeLogin.setEmail(user.getEmail());
		beforeLogin.setRole_id(user.getRole_id());
		beforeLogin.setForcePasswordChange(user.getForcePasswordChange());
		beforeLogin.setContactNo(user.getContactNo());
		beforeLogin.setDate_of_Joining(user.getDate_of_Joining());
		beforeLogin.setJobType(user.getJobType());

		beforeLogin.setDesignationID(user.getDesignationID());
		beforeLogin.setWorkStreamID(user.getWorkStreamID());
		beforeLogin.setImmediate_Reporting_Manager_ID(user.getImmediate_Reporting_Manager_ID());
		beforeLogin.setUserToken(user.getUserToken());
		// create and store token in DB

		return user;
	}

}
