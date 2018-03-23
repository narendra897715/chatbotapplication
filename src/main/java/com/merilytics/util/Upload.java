package com.merilytics.util;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Upload {

	public static String getfilepath() throws Exception {
		try {
			Context ctx = new InitialContext();
			Context env = (Context) ctx.lookup("java:comp/env");
			final String destDir = (String) env.lookup("uploadDirectory");

			return destDir;
		} catch (Exception e) {
			throw e;
		}

	}

}
