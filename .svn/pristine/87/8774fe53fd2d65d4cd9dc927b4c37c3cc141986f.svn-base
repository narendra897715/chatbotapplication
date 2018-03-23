package com.merilytics.util;

public class EmailTemplateStructure {

	// This is to inform you that the employee has selected you as one of the
	public static String emailforFeedbackSelection(String employeeName, String feedbackProvider, String pmcycle,
			String managerName, String cycleEndDate, String projectName) {

		String emailContent = "<html><body><label style='font-family : Arial; font-size:10px;'>Hi " + employeeName
				+ ",<br/><br/>" + "This is to inform you that the employee - <b>" + feedbackProvider
				+ "</b> has selected you as one of " + "the feedback provider for the project <b>" + projectName
				+ " </b>for the " + pmcycle
				+ " appraisal cycle. <br>If you believe you should not be a feedback provider for "
				+ "this employee, please connect with the employee and the employee’s reporting manager – <b>"
				+ managerName + " </b>to explain your " + "rationale at your earliest as " + cycleEndDate
				+ " is the deadline for feedback provider approval by CEO."
				+ " If you are one of the feedback providers in the list approved for the employee by the CEO, "
				+ "it will be binding on you to fill the appraisal for the employee.<br/><br/>"

				+ "Regards,<br/>" + "Performance Management Team,<br/>"
				+ "pmsupport@merilytics.com<br/><br/></label></body></html>"
				+ "<label style='font-family : Arial; font-size:10px; '><br/><br/><br/>The information contained in this e-mail is confidential "
				+ "and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, "
				+ "dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;
	}

	// This is to inform you that the Manager has approved you as one of the
	public static String emailforFeedbackSelectionApproval(String feedbackproviderName, String employeeName,
			String cycle, String managerName, String cycleEndDate, String projectName) {

		String emailContent = "<html><body><label style='font-family : Calibri; font-size:18px;'>Hi "
				+ feedbackproviderName + ",<br/>" + "This is to inform you that the <b>" + managerName
				+ " </b>has approved you as one of the feedback provider for the employee - <b>" + employeeName
				+ "</b> for " + "the project <b>" + projectName + "</b> for " + cycle + " appraisal cycle. "
				+ "If you believe you should not be a feedback provider, please connect with <b>" + managerName
				+ "</b> to explain your rationale " + "at your earliest as <b>" + cycleEndDate
				+ "</b>  is the deadline for feedback provider approval."
				+ "If you are one of the feedback providers in the list approved for the employee by the CEO, it will be binding on you to fill the appraisal for the employee.<br/><br/>"

				+ "Regards,<br/>" + "Performance Management Team,<br/>"
				+ "pmsupport@merilytics.com<br/><br/></label></body></html>"
				+ "<label style='font-family : Arial; font-size:10px; '><br/><br/><br/>The information contained in this e-mail is confidential "
				+ "and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ " If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, "
				+ "dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// self feedback email those are not selected by anyone
	public static String emailforStage2self(String name, String statDate, String pmCycleName) {

		String emailcontent = "<html><body><label  style='font-family : Arial; font-size:10px;'> Hi " + name + "\r\n"
				+ "<br/><br/>We have opened the <a href=\\http://pmapp.merilytics.com:8080/PMApp\\> Performance Management Application </a>  "
				+ "for you to fill your self-appraisal. Please ensure that you complete filling this by   <b>"
				+ statDate + "</b>. Else, " + "we will not be able to consider you for the   <b>   " + pmCycleName
				+ "</b> cycle and may affect the decisions on promotions, salary changes etc.\r\n"

				+ "<br/><br/>Regards,  <br/>Performance Management Team,\r\n"
				+ "<br/>pmsupport@merilytics.com </label>\r\n"
				+ "<label style='font-family : Arial; font-size:10px;'><br/><br/><br/>The information "
				+ "contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates.\r\n"
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed.\r\n"
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, "
				+ "dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is "
				+ "strictly prohibited.\r\n"
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailcontent;
	}

	// The appraisal review for employeeName is ready for your
	// consolidation/validation.

	public static String emailL2ManagersToValidateConsolidated(String name, String employeeName, String statDate) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi " + name + ","
				+ "<br/><br/>The appraisal review for <b>" + employeeName + "</b>"
				+ " is ready for your consolidation/validation."
				+ "<br/><br/>Please sign in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> "
				+ "to consolidate/validate "
				+ "the appraisal review from the previous level and to forward it to the next level."
				+ "<br/><br/>As <b>" + statDate + "</b>"
				+ " is the deadline for consolidation of all employee's reviews, "
				+ "it would be great if you could finish this task at your earliest.<br/>"

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px; color:grey'><br/><br/><br/>The information contained in this e-mail is confidential"
				+ " and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, "
				+ "dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, "
				+ "please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// emailWhenCEORejected or COO reject

	public static String emailWhenCEORejectedTemplete(String name, String employeeName, String reason,
			String statDate) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi " + name + ","
				+ "<br/><br/>The appraisal for  <b>" + employeeName
				+ "</b> has been sent back with the following comments/reasons." + "<br/><br/>&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "\"<i>" + reason + "\"</i>"
				+ "<br/><br/>Please sign in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> to "
				+ "incorporate necessary changes and submit the review for approval at the next level."
				+ "<br/><br/>As <b>" + statDate
				+ "</b> is the deadline for approval of all employees’ appraisal, it would be great if you could finish this task at your earliest."

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px; '><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted here with is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, dissemination, distribution, "
				+ "copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// kick off email
	public static String kichOffemail(String name) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi All,"
				+ "<br/><br/>The Performance Management process for the " + name
				+ " cycle has been <b>initiated</b>. The process would be managed online through the Merilytics <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a>."
				+ "<br/><br/>We have posted the timelines for the process on the Performance Management Application. Please sign in using your credentials to view the same."
				+ "<br/><br/>The User ID is your work Email ID and the password is <i>Merilytics@123</i>. "
				+ "Upon your first log-in, you will be forced to change this password."
				+ "<br/><br/>Please <b>ensure that you meet the deadlines mentioned</b> on the Performance Management Application.<br/>"

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px;'><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// Selection of Feedback Providers after kickoff mail

	public static String SelectionofFeedbackProviders(String pmCycleName, String startDate) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi All,"
				+ "<br/><br/>As per our earlier email regarding Performance Management Cycle " + pmCycleName
				+ ", we have kick-started the process today. As first step in the process, please select the feedback providers for yourself by signing in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> before <b>"
				+ startDate + "</b>."
				+ "<br/><br/>Please note the following points regarding selection of the feedback providers:<br/>"
				+ "<br/>1. Select your name in the <i>'Feedback provider'</i> dropdown & the relevant internal project from the <i>'Projects'</i> dropdown to include your internal project in the appraisal."
				+ "<br/>2. Maximum number of unique feedback providers that can be selected is <b>5</b>."
				+ "<br/>3. Maximum number of entries that can be selected is <b>8</b>."
				+ "<br/>4. <i>Start date</i> and <i>End date</i> should be based on the duration of the association with the selected feedback provider and project in this cycle."
				+ "<br/>5. Duration of association on the selected project should be atleast <b>3 weeks</b>."
				+ "<br/><br/>In case you fail to select the feedback providers for yourself by <b>" + startDate
				+ "</b>, we will not be able to consider you for the Performance Management Cycle (" + pmCycleName
				+ ") and may affect the decisions on your promotions, salary changes etc.<br/>"

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px;'><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;
	}

	// employeeName , who is reporting to you, has selected the feedback
	// providers
	// for him/her for the Performance Management Cycle ( pmCycleName ).

	public static String feedbackApproval(String name, String pmCycleName, String employeeName, String startDate) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi " + name + ","
				+ "<br/><br/>" + "<b>" + employeeName + "</b>" + ", who is reporting to you, has selected the "
				+ "feedback providers for him/her for the Performance Management Cycle (" + pmCycleName + ").<br/>"
				+ "&nbsp;&nbsp;&nbsp;&nbsp;"
				+ "<br/>Please sign in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> and validate the list of feedback providers for the above-mentioned employee before <b>"
				+ startDate + "</b> to initiate the appraisal process for him/her."

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px; '><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, dissemination, distribution, copying or other use of, "
				+ "or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// The feedback provider list for employeeName is ready for your validation

	public static String feedbackApprovalCEO(String name, String employeeName, String startDate) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;;'>Hi " + name + ","
				+ "<br/><br/>The feedback provider list for <b>" + employeeName + "</b> is ready for your validation."
				+ "<br/><br/>Please sign in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> to validate the list of feedback providers and to forward it to the next level."
				+ "<br/><br/>As <b>" + startDate
				+ "</b> is the deadline for approval of all employees’ feedback providers, it would be great if you could finish this task at your earliest."

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px; '><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;
	}

	// provide your feedback for the following employees including Feedback List

	public static String feedbackAndSelf(String name, String startDate, String feedbacklist, String pmCycleName) {

		if (feedbacklist == null) {
			return null;
		}

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi " + name + ","
				+ "<br/><br/>We have opened the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> "
				+ "for you to provide your feedback for the following employees who have selected you "
				+ "as their feedback provider. It would be great if you could provide the feedback by <b>" + startDate
				+ "</b>.<br/>" + "<br/>" + "&nbsp;&nbsp;&nbsp;&nbsp;<b>" + feedbacklist + "</b>"
				+ "<br/><br/>Please note <b>that you can fill in your self-appraisal only after providing feedback to all the employees listed above.</b>"
				+ "<br/><br/>Please ensure that you complete filling all appraisals (<i>including self-appraisal</i>) by <b>"
				+ startDate + "</b>. Else, we will not be able to consider you for the Performance Management Cycle ("
				+ pmCycleName + ") and may affect the decisions on promotions, salary changes etc.<br/>"

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px;'><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, "
				+ "dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// The appraisal review for employeename is ready for your
	// consolidation/validation.

	public static String consolidateManager(String name, String employeename, String startDate) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi " + name + ","
				+ "<br/><br/>The appraisal review for <b>" + employeename
				+ "</b> is ready for your consolidation/validation."
				+ "<br/><br/>Please sign in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> to consolidate/validate the "
				+ "appraisal review from the previous level and to forward it to the next level.</b>"
				+ "<br/><br/>As <b>" + startDate + "</b>"
				+ " is the deadline for consolidation of all employees’ reviews, it would be great if you could finish this task at your earliest."

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px; color:#A9A9A9;'><br/><br/><br/>The information contained"
				+ " in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, "
				+ "you are hereby notified that any review, retransmission, dissemination, distribution, "
				+ "copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

	// Release of appraisals for discussion

	public static String appraisalRelease(String name, String pmCycleName) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi " + name + ","
				+ "<br/><br/>We have released the final appraisal for the Performance Management Cycle (" + pmCycleName
				+ ") for the employees reporting to you."
				+ "<br/><br/>As next steps, please sign in to the <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> to take a print-out of the appraisal and schedule appraisal discussion with your reporting employees."
				+ "<br/><br/>After the appraisal discussion, please enter the summary of the appraisal discussion in the <b>‘Discuss Appraisals’</b> section and click <b>‘Submit’</b> for enabling the employees to have a detailed look at their appraisals.<br/>"

				+ "<br/><br/>Regards," + "<br/>Performance Management Team," + "<br/>pmsupport@merilytics.com </label>"
				+ "<label style='font-family : Arial; font-size:10px; color:grey'><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;
	}

	// forgotPassword
	public static String forgetPassword(String password) {

		String emailContent = "<html><body><label  style='font-family : Arial; font-size:10px;'>Hi,<br/><br/>Your request for regeneration of <b>new password</b> has been processed successfully.<br/>"
				+ "<br/>Your new password is: " + "<b>" + password + "</b>"
				+ "<br/><br/>Please use your existing user id and the new password to log into the application. You will be forced to change your password on login.<br/>"

				+ "<br/>The link to the Performance Management Application is: <a href=\"http://pmapp.merilytics.com:8080/PMApp\"> Performance Management Application </a> <br/>"
				+ "<br/>For any support required regarding the application, please send an email to pmsupport@merilytics.com "
				+ "<br/><br/>Thanks." + "<br/><br/>Regards," + "<br/>Performance Management Team  </label>"
				+ "<label style='font-family : Arial; font-size:10px;'><br/><br/><br/><br/><br/>The information contained in this e-mail is confidential and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, "
				+ "you are hereby notified that any review, retransmission, dissemination, "
				+ "distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;

	}

}
