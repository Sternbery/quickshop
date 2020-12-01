package com.collabera.letsgo.quickshop.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public class StorageService {

	public void init() {}

	public void store(MultipartFile file) throws IOException {
		File sysFile = new File("testfile");
		FileOutputStream fos = new FileOutputStream(sysFile);
		InputStream is = file.getInputStream();
		
		int b;
		while((b=is.read())!=-1) {
			fos.write(b);
		}
		fos.close();
		is.close();
	}

	public Stream<Path> loadAll(){
		return null;
	}

	public Path load(String filename) {
		return null;
	}

	public Resource loadAsResource(String filename) {
		return null;
	}


}
