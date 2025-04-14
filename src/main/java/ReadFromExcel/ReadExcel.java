package ReadFromExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// To find the location of the Excel file
		String fileLocation = "./Test-Data/Login-data.xlsx";
		// call constructor
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		//workbook has multiple page we need to declare page number 1st one is 0
		XSSFSheet sheet =  wbook.getSheetAt(0);
		//To get the row
		XSSFRow row = sheet.getRow(1);
		//To get the cell from that row
		XSSFCell cell = row.getCell(0);
		// To get the value from that cell
		String value = cell.getStringCellValue();
		// To print
		System.out.println(value);
		wbook.close();
	}

}
    

// If we want to execute all the row and cell

//for (int i = 0; i < 2; i++) {
	//row = sheet.getRow(i);
//}
//for (int j = 0; j < 1; i++) {
	//To get the cell from that row
	//XSSFCell cell = row.getCell(j);
	// To get the value from that cell
	//String value = cell.getStringCellValue();
	// To print
	//System.out.println(value);    
//}