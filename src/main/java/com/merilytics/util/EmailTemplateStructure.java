package com.merilytics.util;

public class EmailTemplateStructure {

	// This is to inform you that the employee has selected you as one of the
	public static  String mailForTicketRaising(String ticket) {

		String emailContent = "<html><body><label style='font-family : Arial; font-size:10px;'>Hi "
				+ ",<br/><br/>" + "Your ticket has been raised with concerned department regarding the issue <b>" + ticket + "</b><br/><br/>" 

				+ "Regards,<br/>" + "Merilytics Chat Bot,<br/><br/></label></body></html>"
				
				+ "<label style='font-family : Arial; font-size:10px; '><br/><br/><br/>The information contained in this e-mail is confidential "
				+ "and proprietary to Merilytics Inc. and/or its affiliates."
				+ "The information transmitted herewith is intended only for use by the individual or entity to which it is addressed."
				+ "If the reader of this message is not the intended recipient, you are hereby notified that any review, retransmission, "
				+ "dissemination, distribution, copying or other use of, or taking of any action in reliance upon this information is strictly prohibited."
				+ "If you have received this communication in error, please contact the sender and delete the material from your computer.</label></body></html>";

		return emailContent;
	}

	
}
