package com.merilytics.util;

public class Conversion {

	public static Integer toInteger(Object obj) {
		try {
			return new Integer(obj.toString());
		} catch (Exception e) {

			return null;
		}

	}

	public static String toString(Object obj) {
		try {
			return obj.toString();
		} catch (Exception e) {

			return null;
		}

	}

	public static Double toDouble(Object obj) {
		try {
			return new Double(obj.toString());
		} catch (Exception e) {
			return null;
		}

	}

	public static Boolean toBoolean(Object obj) {
		try {
			return Boolean.valueOf(obj.toString());
		} catch (Exception e) {
			return null;
		}

	}

	public static String toDatabaseString(Object obj) {
		try {
			return "'" + obj.toString() + "'";
		} catch (Exception e) {
			return null;
		}

	}

}
