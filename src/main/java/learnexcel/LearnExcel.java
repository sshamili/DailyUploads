package learnexcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {

	
	public  String[][] readExcel(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");	
		XSSFSheet sheet = wb.getSheetAt(0);
		// To Get Row Count 
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		// To Get Column Count
		short columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		
		System.out.println(columnCount);
		for (int j = 1; j <= rowCount; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < columnCount; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				data[j-1][i] = value;
				System.out.println(value);
			} 
		}
			return data;
	}

}
