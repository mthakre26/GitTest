package com.newtours.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {

	
	public static ArrayList<String> getRowData(String sheetName,int rowNumber) throws Exception {
		
		ArrayList<String> data = new ArrayList<>();
		
		File file = new File("C:\\Users\\M1038750\\workspace\\DataDrivenFramework\\src\\com\\newtours\\testData\\TestData.xls");
		FileInputStream input = new FileInputStream(file);
		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheet(sheetName);
		HSSFRow row = sheet.getRow(rowNumber);
		int maxCells = row.getLastCellNum();
		for (int i = 0; i <maxCells; i++){
			HSSFCell cell = row.getCell(i);
		data.add(cell.getStringCellValue());
		}
	
		return data;
	}
	
	
}
