package com.merilytics.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.merilytics.bo.UserDefinedFieldsBO;
import com.merilytics.config.TokenValidator;
import com.merilytics.model.UserDefinedFieldsModel;
import com.merilytics.util.ExcellCreation;

@Controller
public class UserDefinedFieldsController {

	@Autowired
	private UserDefinedFieldsModel uDFModel;
	@Resource
	private TokenValidator tokenValidator;

	@RequestMapping(value = "/displayUserDefinedFields", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> displayUserDefinedFields(HttpServletRequest request,
			HttpServletResponse response) {
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		// Loggers.INFO_lOGGER.info(name + " Enter into item Master Screen");

		if (name == null) {

			return new ResponseEntity<>("{\"status\":\"Error in Current Project\"}", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(uDFModel.displayUserDefinedFields(), HttpStatus.OK);
	}

	@RequestMapping(value = "/updateUserDefinedFields", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> updateUserDefinedFields(@RequestBody List<Map<String, Object>> listOfDetails,
			HttpServletRequest request, HttpServletResponse response) {

	
		// return uDFModel.updateUserDefinedFields();
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		// Loggers.INFO_lOGGER.info(name + " Enter into item Master Screen");

		if (name == null) {

			return new ResponseEntity<>("{\"status\":\"Error in Current Project\"}", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(uDFModel.updateUserDefinedFields(listOfDetails), HttpStatus.OK);
	}

	@RequestMapping(value = "/deleteUserDefinedFields", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> deleteUserDefinedFields(@RequestBody UserDefinedFieldsBO listOfDetails,
			HttpServletRequest request, HttpServletResponse response) {
		// return uDFModel.updateUserDefinedFields();
		String name = tokenValidator.isToken(request.getHeader("token"), request, response);

		// Loggers.INFO_lOGGER.info(name + " Enter into item Master Screen");

		if (name == null) {

			return new ResponseEntity<>("{\"status\":\"Error in Current Project\"}", HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(uDFModel.deleteUserDefinedFields(listOfDetails), HttpStatus.OK);
	}

	@RequestMapping(value = "/excellCreation", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> excellCreation(HttpServletRequest request, HttpServletResponse response) {

		String outputPath = request.getServletContext().getRealPath("/WEB-INF");

		outputPath = outputPath.replace("\\WEB-INF",
				"\\Authentication\\Assets\\Excel_Template\\ItemMasterTemplete.xlsx");
		uDFModel.excellCreation(outputPath);
		return new ResponseEntity<>("{\"status\":\"Error in Current Project\"}", HttpStatus.OK);

	}

}
