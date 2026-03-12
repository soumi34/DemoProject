package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

//Utilities means so many utility are created
//needed dependency for excel is POI and POI.Xml
public class ExcelUtility {
		static FileInputStream f;//to read input details from a file & inbuilt class
		static XSSFWorkbook wb;//to read details from the workbook
		static XSSFSheet   sh;//to read details from the sheet
		
		public static String getStringData(int a,int b,String sheet) throws IOException
		{
			String filepath=Constant.TESTDATAFILE;
			f=new FileInputStream(filepath);//file path stored in variable  f
			wb= new XSSFWorkbook(f);
			sh=wb.getSheet(sheet);//getSheet is a method used to get details from the sheet
			XSSFRow r =sh.getRow(a);//XSSRow is a class-TO READ DETAILS FROM the row
			XSSFCell c = r.getCell(b);//XSSFCell is a class-TO READ DETAILS FROM the cell
			//getRow-to get details from row
			//getCell-to get details from cell
			//getStringCellValue-is a method to get the string value from the cell
			return c.getStringCellValue();
		}
		//getNumericCellValue-to get numbers from the cell,always cell values are double
		public static String getIntData(int a,int b,String sheet) throws IOException
		{
			String filepath=Constant.TESTDATAFILE;
			f=new FileInputStream(filepath);
			wb=new XSSFWorkbook(f);
			sh=wb.getSheet(sheet);
			XSSFRow r =sh.getRow(a);
			XSSFCell c=r.getCell(b);
			int value=(int)c.getNumericCellValue();//type casting to int
			return String.valueOf(value);		//type conversion to string
		}

}
