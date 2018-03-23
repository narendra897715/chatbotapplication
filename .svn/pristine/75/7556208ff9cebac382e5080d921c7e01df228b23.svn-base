package com.merilytics.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ResultSetConverter {
	public static List<Map<String, Object>> convert(ResultSet rs) throws SQLException {

		List<Map<String, Object>> jArray = new ArrayList<>();

		ResultSetMetaData rsmd = rs.getMetaData();

		while (rs.next()) {
			int numColumns = rsmd.getColumnCount();

			Map<String, Object> jsObject = new LinkedHashMap<>();

			for (int i = 1; i < numColumns + 1; i++) {

				jsObject.put(rsmd.getColumnName(i), rs.getObject(rsmd.getColumnName(i)));
			}

			jArray.add(jsObject);
		}

		return jArray;
	}
}