package com.merilytics.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcellUploadDAO {

	@Autowired
	private DatabaseDAO databaseDAO;

	private final String uploadstoredprocFG = "call uploadingItemMaster()";

	private final String uploadstoreprocRM = "call itemMasterRM()";

	private final String loadfile = "LOAD DATA LOCAL INFILE '%s' INTO TABLE  tbl_itemmaster_test FIELDS TERMINATED BY ',' ENCLOSED BY '\\\"'LINES TERMINATED BY '\\n'IGNORE 1 ROWS "
			+ "(skuCode, baseUPC, uPCCheckDigit, nRFSize, nRFColor, directAllocation, style, styleName, shortDescription, longDescription, size, shopifySize, nOSize, fashionPyramid, occasion, category, subCategory, nOCategoyCode, nOCategory, fabricType, productType, fabrication, productStyle, colorFamily, colorVariant, shade, pattern, scale, fit, nOSeason, season, collection, month, year, collar, bottomRise, rMCost, rMYield, cutSewCost, standardCost, inboundFreightEstimate, lineHaulEstimate, fullyLoaded, retailPrice, wSPrice);";

	private final String truncate = "truncate table tbl_itemmaster_test;";

	public List<List<Map<String, Object>>> uploadDAO(String csvpath, String value) {

		databaseDAO.executeStoredProc(truncate);

		databaseDAO.executeStoredProc(String.format(loadfile, csvpath.replace("\\", "\\\\")));

		List<List<Map<String, Object>>> errorlist = (value.equalsIgnoreCase("true"))
				? databaseDAO.executeJDBCcode(uploadstoredprocFG)
				: databaseDAO.executeJDBCcode(uploadstoreprocRM);

		return errorlist;

	}

}
