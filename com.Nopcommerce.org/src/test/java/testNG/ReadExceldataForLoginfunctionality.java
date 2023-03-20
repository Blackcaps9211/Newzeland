package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExceldataForLoginfunctionality {
	
	@Test
	public static List<HashMap<String,String>> readExcelData() throws IOException{
		FileInputStream File = new FileInputStream("./ExcelData/LoginFuctionality.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(File);
	//	XSSFSheet sheet = new XSSFSheet(workbook);
		
		//XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("./ExcelData/LoginFuctionality.xlsx"));
		XSSFSheet sheet = workbook.getSheetAt(0);
		List<HashMap<String,String>> ExcelData = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> credintials = null;
		for(int rowIndex=1;rowIndex<=sheet.getLastRowNum();rowIndex++) {
			credintials = new HashMap<String, String>();
		String email = sheet.getRow(rowIndex).getCell(0).toString();
	String	password = sheet.getRow(rowIndex).getCell(1).toString();
	credintials.put("EmailId", email);
	credintials.put("Password", password);
	ExcelData.add(credintials);
		}
		//System.out.println(ExcelData);
		return ExcelData;
	}

}
