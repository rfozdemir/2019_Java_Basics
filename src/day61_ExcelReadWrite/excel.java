package day61_ExcelReadWrite;

import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
	
	public static void main(String[] args) throws Exception  {
		//C:\Users\USER\Desktop\javareader.xlsx
		String filePath="C:\\Users\\USER\\eclipse-workspace\\Summer2019-Java\\Summer2019_Java\\javareader.xlsx";
		
		String sheetname="Sheet1";
		
		FileInputStream file=new FileInputStream(filePath);
	
		Workbook excelFile=WorkbookFactory.create(file);
		
		Sheet  sheet=excelFile.getSheet(sheetname);
		
		Cell cell=sheet.getRow(1).getCell(1);
		
		String cellData=cell.getStringCellValue();
		System.out.println(cellData);
		
		
	
		
	}
	

}
