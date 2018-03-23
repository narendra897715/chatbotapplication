package com.merilytics.util;

import java.math.BigDecimal;

public class Checkdigit {

	/**
	 * @Description:This Method is for finding check digit for a given UPC id 
	 * 
	 * @formulae checkdigit = (10 - (((odd * 3) + even) % 10)) % 10;
	 *
	 */
	public static String upcDigit(Object obj) {

		try {
			double d1 = Double.valueOf((Double) obj);
			String input = BigDecimal.valueOf(d1).toPlainString();
			int odd = 0;
			int even = 0;
			String[] str = input.split("");

			for (int i = 0; i < str.length; i++) {
				if (i % 2 == 0) {
					// these values are consider as odd because array start with 0
					odd += Conversion.toInteger((str[i]));
				} else {

					even += Conversion.toInteger((str[i]));
				}
			}

			int checkdigit = (10 - (((odd * 3) + even) % 10)) % 10;

			return Conversion.toString(input + checkdigit);

		} catch (Exception e) {

			return null;
		}
	}

}