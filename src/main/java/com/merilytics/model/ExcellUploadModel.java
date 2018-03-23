package com.merilytics.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.dao.ExcellUploadDAO;
import com.merilytics.util.Conversion;
import com.merilytics.util.ExcellReading;
import com.merilytics.util.Upload;

@Configuration
public class ExcellUploadModel {

	@Autowired
	private ExcellUploadDAO excellUploadDAO;

	private final String csvName = "uploadingCSV";

	public Map<String, Object> uploadExcell(String input, String finishedGood) throws Exception {

		try {
			String output = Upload.getfilepath() + csvName + (new Date().getTime()) + ".csv";

			List<Map<String, Object>> finalexcel = ExcellReading.excelToCsv(input, output);

			List<List<Map<String, Object>>> errorlist = excellUploadDAO.uploadDAO(output,
					finishedGood);

			Map<String, Object> finalmap = new HashMap<String, Object>();

			finalmap.put("TotalCount", finalexcel.size());
			finalmap.put("errorCount", errorlist.get(1).size());
			finalmap.put("errorData", getExcellDownload(errorlist.get(1)));

			return finalmap;
		} catch (Exception e) {
			throw e;

		}

	}

	public Map<String, Object> getExcellDownload(List<Map<String, Object>> databasevalue) {

		Map<String, Object> finalMap = new LinkedHashMap<String, Object>();

		List<String> keySet = null;

		List<Map<String, Object>> finallist = new LinkedList<Map<String, Object>>();

		for (Map<String, Object> internalmap : databasevalue) {

			Map<String, Object> finalmap = new LinkedHashMap<>();

			
			finalmap.put("SKU_Code", internalmap.get("skuCode"));
			finalmap.put("Base UPC", internalmap.get("baseUPC"));
			finalmap.put("UPC + Check Digit", internalmap.get("uPCCheckDigit"));
			finalmap.put("NRF Size", internalmap.get("nRFSize"));
			finalmap.put("NRF Color", internalmap.get("nRFColor"));
			finalmap.put("Direct Allocation", internalmap.get("directAllocation"));
			finalmap.put("Style", internalmap.get("style"));
			finalmap.put("Style Name", internalmap.get("styleName"));
			finalmap.put("Short Description", internalmap.get("shortDescription"));
			finalmap.put("Long Description", internalmap.get("longDescription"));
			finalmap.put("Size", internalmap.get("size"));
			finalmap.put("Shopify Size", internalmap.get("shopifySize"));
			finalmap.put("NO Size", internalmap.get("nOSize"));
			finalmap.put("Fashion Pyramid", internalmap.get("fashionPyramid"));
			finalmap.put("Occasion", internalmap.get("occasion"));
			finalmap.put("Category", internalmap.get("category"));
			finalmap.put("Sub-Category", internalmap.get("subCategory"));
			finalmap.put("NO Categoy Code", internalmap.get("nOCategoyCode"));
			finalmap.put("NO Category", internalmap.get("nOCategory"));
			finalmap.put("Fabric Type", internalmap.get("fabricType"));
			finalmap.put("Product Type", internalmap.get("productType"));
			finalmap.put("Fabrication", internalmap.get("fabrication"));
			finalmap.put("Product Style", internalmap.get("productStyle"));
			finalmap.put("Color Family", internalmap.get("colorFamily"));
			finalmap.put("Color Variant", internalmap.get("colorVariant"));
			finalmap.put("Shade", internalmap.get("shade"));
			finalmap.put("Pattern", internalmap.get("pattern"));
			finalmap.put("Scale", internalmap.get("scale"));
			finalmap.put("Fit", internalmap.get("fit"));
			finalmap.put("NO Season", internalmap.get("nOSeason"));
			finalmap.put("Season", internalmap.get("season"));
			finalmap.put("Collection", internalmap.get("collection"));
			finalmap.put("Delivery Month", internalmap.get("month"));
			finalmap.put("Year", internalmap.get("year"));
			finalmap.put("Collar", internalmap.get("collar"));
			finalmap.put("Bottom Rise", internalmap.get("bottomRise"));
			finalmap.put("RM Cost", internalmap.get("rMCost"));
			finalmap.put("RM Yield", internalmap.get("rMYield"));
			finalmap.put("Cut & Sew Cost", internalmap.get("cutSewCost"));
			finalmap.put("Standard Cost (RM $ x Yield + C&S $)", internalmap.get("standardCost"));
			finalmap.put("Inbound Freight Estimate PER UNIT", internalmap.get("inboundFreightEstimate"));
			finalmap.put("Line Haul Estimate PER UNIT", internalmap.get("lineHaulEstimate"));
			finalmap.put("Fully Loaded Standard Cost", internalmap.get("fullyLoaded"));
			finalmap.put("Retail Price", internalmap.get("retailPrice"));
			finalmap.put("WS Price", internalmap.get("wSPrice"));
			finalmap.put("Error Message", internalmap.get("errormessage"));

			finallist.add(finalmap);

		}

		Map<String, String> dataType = new LinkedHashMap<String, String>();

		
		dataType.put("SKU_Code", "String");
		dataType.put("Base UPC", "Number");
		dataType.put("UPC + Check Digit", "Number");
		dataType.put("NRF Size", "Number");
		dataType.put("NRF Color", "Number");
		dataType.put("Direct Allocation", "Number");
		dataType.put("Style", "String");
		dataType.put("Style Name", "String");
		dataType.put("Short Description", "String");
		dataType.put("Long Description", "String");
		dataType.put("Size", "String");
		dataType.put("Shopify Size", "String");
		dataType.put("NO Size", "String");
		dataType.put("Fashion Pyramid", "String");
		dataType.put("Occasion", "String");
		dataType.put("Category", "String");
		dataType.put("Sub-Category", "String");
		dataType.put("NO Categoy Code", "String");
		dataType.put("NO Category", "String");
		dataType.put("Fabric Type", "String");
		dataType.put("Product Type", "String");
		dataType.put("Fabrication", "String");
		dataType.put("Product Style", "String");
		dataType.put("Color Family", "String");
		dataType.put("Color Variant", "String");
		dataType.put("Shade", "String");
		dataType.put("Pattern", "String");
		dataType.put("Scale", "String");
		dataType.put("Fit", "String");
		dataType.put("NO Season", "String");
		dataType.put("Season", "String");
		dataType.put("Collection", "String");
		dataType.put("Delivery Month", "String");
		dataType.put("Year", "Number");
		dataType.put("Collar", "String");
		dataType.put("Bottom Rise", "String");
		dataType.put("RM Cost", "Currency");
		dataType.put("RM Yield", "Integer");
		dataType.put("Cut & Sew Cost", "Currency");
		dataType.put("Standard Cost (RM $ x Yield + C&S $)", "Currency");
		dataType.put("Inbound Freight Estimate PER UNIT", "Currency");
		dataType.put("Line Haul Estimate PER UNIT", "Currency");
		dataType.put("Fully Loaded Standard Cost", "Currency");
		dataType.put("Retail Price", "Currency");
		dataType.put("WS Price", "Currency");
		dataType.put("Error Message", "String");

		keySet = new ArrayList<String>(finallist.get(0).keySet());

		finalMap.put("body", finallist);
		finalMap.put("header", keySet);
		finalMap.put("dataType", dataType);
		finalMap.put("name", "Item Master");

		return finalMap;

	}

}
