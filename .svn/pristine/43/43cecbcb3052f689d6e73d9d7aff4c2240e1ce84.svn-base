package com.merilytics.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.merilytics.dto.FileUploadCommand;
import com.merilytics.model.ExcellUploadModel;
import com.merilytics.util.Upload;

@Controller
public class ExcellUploadController {

	@Autowired
	private ExcellUploadModel excellUploadModel;

	@RequestMapping(value = "/excellupload", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> uploadFile(
			@ModelAttribute("fileUploadCmd") FileUploadCommand fileUploadCommand,
			@ModelAttribute("finishedOrraw") String finishedOrraw, HttpServletResponse response) {

		System.out.println(finishedOrraw);

		File fileDirectory = null;
		MultipartFile uploadFile = null;
		String uploadFileName = null;
		String filePath = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {

			final String xmlDestination = Upload.getfilepath();

			// create Dest directory if not available
			fileDirectory = new File(xmlDestination);

			if (!fileDirectory.exists()) {
				fileDirectory.mkdir();
			}

			// receive uploaded file details
			uploadFile = fileUploadCommand.getFileUploadCmd();
			uploadFileName = uploadFile.getOriginalFilename();
			inputStream = uploadFile.getInputStream();

			// create OutputStream pointing to Dest file on Server machine
			outputStream = new FileOutputStream(xmlDestination + uploadFileName);

			// complete fileUploading
			IOUtils.copy(inputStream, outputStream);

			// output file path
			filePath = xmlDestination + uploadFile.getOriginalFilename();

			Map<String, Object> finalmap = excellUploadModel.uploadExcell(filePath, finishedOrraw);

			return new ResponseEntity<>(finalmap, HttpStatus.OK);

			// use service to laod excel file into database
		} catch (NullPointerException e) {
			e.printStackTrace();
			return new ResponseEntity<>("{\"status\":\"Invalid Excel file format has been uploaded. Please upload as per the template provided.\"}", HttpStatus.EXPECTATION_FAILED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("{\"status\":\"Invalid Excel file format has been uploaded. Please upload as per the template provided.\"}", HttpStatus.EXPECTATION_FAILED);
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
