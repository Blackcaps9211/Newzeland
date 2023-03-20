package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcelsheet {

	public static void main(String[] args) throws Exception {

		
		FileInputStream File = new FileInputStream("C:\\Hii//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File);
		
	XSSFSheet sheet = workbook.getSheet("Sheet1");
    int	rowcount = sheet.getLastRowNum();
  int cellcount = sheet.getRow(0).getLastCellNum();
  
  for(int r=0;r<rowcount;r++) {
	XSSFRow currentrow = sheet.getRow(r);
	
	for(int j=0;j<cellcount;j++) {
		String cell = currentrow.getCell(j).toString();
		System.out.println(cell);
		
	}
	System.out.println();
	if(rowcount==3 && cellcount==2) {
		
		System.out.println();
	}
  }
  
		
	}

}
