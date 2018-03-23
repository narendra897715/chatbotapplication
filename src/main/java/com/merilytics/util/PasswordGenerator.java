package com.merilytics.util;

public class PasswordGenerator {
	public static String generatePassword() {
		String pwd = null;
		pwd = generateNumber() + generateAlpabet() + generateNumber() + generateAlpabet() + generateNumber()
				+ generateNumber();
		return pwd;
	}

	public static String generateNumber() {
		Integer i = (int) (Math.random() * 100) + 1;
		return i.toString();
	}

	public static Character generateAlpabet() {
		char randomLetter = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		return randomLetter;
	}

}
