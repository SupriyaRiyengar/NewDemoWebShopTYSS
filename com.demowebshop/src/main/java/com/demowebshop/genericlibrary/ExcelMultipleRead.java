package com.demowebshop.genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMultipleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		multipleRead();
		String[][] result = multipleRead();
		for (int i = 1; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.println(result[i][j]);
			}
		}
	}

	public static String[][] multipleRead() throws EncryptedDocumentException, IOException {
		File file = new File("./TestData/TestNGData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Login");
		int rowsize = sheet.getPhysicalNumberOfRows();
		int colsize = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowsize][colsize];

		for (int i = 1; i < rowsize; i++) {
			for (int j = 0; j < colsize; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
	

		return data;

	}
}
