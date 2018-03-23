package com.merilytics.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

public class JasonDataFormat {
	public static Map<String, String> getJasonData(Boolean b, HttpServletResponse response) {
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			if (b.equals(true)) {
				map.put("message", "success");
			} else {
				response.sendError(500, "Internal Server Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;
	}
}
