package ReadFromExcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInteExcel {

	

	public static String[][] getexcelData() {
	
		String fileLocation = "./Test-Data/Login-data.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet Sheet = wbook.getSheetAt(0);
		// To include the hearder also the we need to get this below
		int includeheader = Sheet.getPhysicalNumberOfRows();
		// To print 
		System.out.println("Inclusive of Header:" +includeheader);
		//To find the last row
		int lastRowNum = Sheet.getLastRowNum();
		//print
		System.out.println("No of Rows:"+lastRowNum);
		//To find last cell
		Short lastcell = Sheet.getRow(0).getLastCellNum();
		System.out.println("No of Cells:" +lastcell);
		for (int i = 0; i <= lastRowNum; i++) {
		XSSFRow	row = Sheet.getRow(i);
		for (int j = 0; j <= lastcell; j++) {
			XSSFCell cell = row.getCell(j);
			String[][] data = new String[lastRowNum][lastcell];
			// If i call string but in the data it is a number then we go to this function to convert all the data into string
			DataFormatter dft = new DataFormatter();
			String value = dft.formatCellValue(cell);
			//String value = cell.getStringCellValue();
			//System.out.println(value);
			data[i-1][j] = value;
			return data;
		}
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		

	

	}
}


    
