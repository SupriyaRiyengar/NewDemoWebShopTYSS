package com.demowebshop.genericlibrary;






import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadPropertyFile1 {

 

	public static void main(String[] args) throws IOException {
		File file= new File("./src/test/resources/propertyFile/configure.properties");
		FileInputStream fis= new FileInputStream(file);
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p.getProperty("url"));
		

	}

}
