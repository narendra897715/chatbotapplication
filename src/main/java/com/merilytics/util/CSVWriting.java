package com.merilytics.util;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class CSVWriting {

	public static void generatecsv(List<Map<String, Object>> totalvalues, List<String> listofkeyset, String path) {

		PrintWriter pw = null;
		StringBuilder sb = null;

		// "C:\\Users\\21216\\Desktop\\csv_test1.csv"

		try {
			
			pw = new PrintWriter(new File(path));
			sb = new StringBuilder();

			for (String header : listofkeyset) {
				sb.append("\"" + header + "\"");
				sb.append(',');

			}

			sb.append('\n');

			for (Map<String, Object> internalmap : totalvalues) {

				for (String keyset : listofkeyset) {

					if (internalmap.get(keyset) != null) {
						sb.append("\"" + internalmap.get(keyset).toString().trim() + "\"");
					}

					sb.append(',');

				}

				sb.append('\n');

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		finally {
			pw.write(sb.toString());
			pw.close();

		}

	}
}