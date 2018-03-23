package com.merilytics.util;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellCreation {

	public static void excelReport(List<String> stringList, String outputpath) throws Exception {

		Integer totalvalues = stringList.size();

		XSSFWorkbook book = new XSSFWorkbook();

		XSSFSheet sheet = book.createSheet("Excell Templete");

		XSSFRow heading = sheet.createRow(0);

		for (int i = 1; i <= totalvalues; i++) {
			heading.createCell(i).setCellValue(stringList.get(i - 1));
		}

		// setting font size and style
		for (int rowNumber = 1; rowNumber <= totalvalues; rowNumber++) {

			XSSFFont font = book.createFont();
			CellStyle cellStyle = book.createCellStyle();

			font.setBold(true);
			font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
			font.setFontHeightInPoints((short) 11);
			font.setColor(IndexedColors.WHITE.getIndex());

			cellStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
			cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cellStyle.setFont(font);

			heading.getCell(rowNumber).setCellStyle(cellStyle);

		}

		// creating auto fix
		for (int i = 1; i < totalvalues; i++) {
			sheet.autoSizeColumn(i);
		}

		try {
			System.out.println(outputpath);
			FileOutputStream outputStream = new FileOutputStream(outputpath);
			book.write(outputStream);
			outputStream.close();
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
