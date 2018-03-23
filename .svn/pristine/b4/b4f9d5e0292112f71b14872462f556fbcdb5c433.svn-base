package com.merilytics.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReading {

	public static List<Map<String, Object>> excelToCsv(String inputPath, String outputPath) throws Exception {

		List<Map<String, Object>> finallist = new LinkedList<Map<String, Object>>();
		List<String> header = new ArrayList<String>();
		List<Integer> columnNumber = new ArrayList<Integer>();
		Workbook workbook = null;
		FileInputStream excelFile = null;
		Map<String, Object> internalmap = null;

		try {

			excelFile = new FileInputStream(new File(inputPath));
			workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);

			int firstRow = 0;

			for (Row row : datatypeSheet) {

				if (firstRow == 0) {

					int count = 0;

					while (count < 100) {

						String value = Conversion.toString(row.getCell(count));

						if (value != null) {

							header.add(value);
							columnNumber.add(count);

						}
						count++;
					}

				} else {
					internalmap = new LinkedHashMap<String, Object>();

					int count = columnNumber.get(0);
					int array = 0;

					while (count <= columnNumber.size()) {

						String value = Conversion.toString(row.getCell(count));

						internalmap.put(header.get(array), value);

						count++;
						array++;
					}

					finallist.add(internalmap);

				}

				firstRow++;

			}

		} catch (Exception e) {
			throw e;

		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				throw e;

			}
		}

		try {

			CSVWriting.generatecsv(finallist, header, outputPath);

		} catch (Exception e) {

			throw e;
		}

		return finallist;

	}

}