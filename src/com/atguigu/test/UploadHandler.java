package com.atguigu.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadHandler {
	@RequestMapping(value="/testUpload",method=RequestMethod.POST)
		public String upload(@RequestParam(value="desc",required=false) String desc, @RequestParam("file") MultipartFile multipartFile) throws IOException{
		System.out.println("desc : "+desc);
		System.out.println("OriginalFilename : "+multipartFile.getOriginalFilename());
		InputStream inputStream = multipartFile.getInputStream();
		System.out.println("inputStream.available() : "+inputStream.available());
		System.out.println("inputStream : "+inputStream);
		multipartFile.transferTo(new File("D:\\4444\\"+multipartFile.getOriginalFilename()));
		System.out.println("--------------");
		return "uploadOK"; //增加成功页面: /views/success.jsp
	}
}
