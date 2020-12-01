package com.collabera.letsgo.quickshop.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileController {
	
	//@Autowired
	//StorageService storageService;

	String fileDirectory = "C:\\Users\\Stefan\\Pictures\\ServerFIles";
	
	@GetMapping(
			value="/{filename}",
			produces=MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		return ResponseEntity.ok(new FileSystemResource(fileDirectory+"\\"+filename));
	}
	
	@PostMapping("/")
	public String uploadFile(@RequestParam("file") MultipartFile file){
		try {
			new FileOutputStream(new File(fileDirectory,file.getName())).write(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
			return "There was an error uploading this file";
		}
		return getFilePage();
	}
	
	@GetMapping("/")
	public String getFilePage() {
		return "<form action='./' method='post' enctype=\"multipart/form-data\">"
				+ "<input type='file' name='file'/>"
				+ "<input type='submit'/>"
				+ "</form>";
	}
}
