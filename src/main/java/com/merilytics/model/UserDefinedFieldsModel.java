package com.merilytics.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.merilytics.bo.UserDefinedFieldsBO;
import com.merilytics.dao.UserDefinedFieldsDAO;
import com.merilytics.util.ExcellCreation;

@Configuration
public class UserDefinedFieldsModel {

	@Autowired
	private UserDefinedFieldsDAO uDFdao;

	public List<UserDefinedFieldsBO> displayUserDefinedFields() {
		boolean status = true;

		List<UserDefinedFieldsBO> listOfUserDefinedFields = uDFdao.displayUserDefinedFields(status);

		int count = 1;
		for (UserDefinedFieldsBO bo : listOfUserDefinedFields) {

			bo.setsNo(count);

			count++;
		}

		return listOfUserDefinedFields;

	}

	public boolean updateUserDefinedFields(List<Map<String, Object>> listOfDetails) {
		return uDFdao.updateUserDefinedFields(listOfDetails);
	}

	public boolean deleteUserDefinedFields(UserDefinedFieldsBO listOfDetails) {
		return uDFdao.deleteUserDefinedFields(listOfDetails);
	}

	public void excellCreation(String path) {

		List<String> stringList = new ArrayList<String>();

		stringList.add("SKU Code");
		stringList.add("Base UPC");
		stringList.add("UPC + Check Digit");
		stringList.add("NRF Size");
		stringList.add("NRF Color");
		stringList.add("Direct Allocation");
		stringList.add("Style");
		stringList.add("Style Name");
		stringList.add("Short Description");
		stringList.add("Long Description");
		stringList.add("Size");
		stringList.add("Shopify Size");
		stringList.add("NO Size");
		stringList.add("Fashion Pyramid");
		stringList.add("Occasion");
		stringList.add("Category");
		stringList.add("Sub-Category");
		stringList.add("NO Categoy Code");
		stringList.add("NO Category");
		stringList.add("Fabric Type");
		stringList.add("Product Type");
		stringList.add("Fabrication");
		stringList.add("Product Style");
		stringList.add("Color Family");
		stringList.add("Color Variant");
		stringList.add("Shade");
		stringList.add("Pattern");
		stringList.add("Scale");
		stringList.add("Fit");
		stringList.add("NO Season");
		stringList.add("Season");
		stringList.add("Collection");
		stringList.add("Delivery Month");
		stringList.add("Year");
		stringList.add("Collar");
		stringList.add("Bottom Rise");
		stringList.add("RM Cost");
		stringList.add("RM Yield");
		stringList.add("Cut & Sew Cost");
		stringList.add("Standard Cost (RM $ x Yield + C&S $)");
		stringList.add("Inbound Freight Estimate PER UNIT");
		stringList.add("Line Haul Estimate PER UNIT");
		stringList.add("Fully Loaded Standard Cost");
		stringList.add("Retail Price");
		stringList.add("WS Price");

		List<UserDefinedFieldsBO> listOfUserDefinedFields = uDFdao.displayUserDefinedFields(true);

		listOfUserDefinedFields.forEach(userDefinedFieldsBO -> {
			stringList.add(userDefinedFieldsBO.getColumnName());
		});

		try {
			ExcellCreation.excelReport(stringList, path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
