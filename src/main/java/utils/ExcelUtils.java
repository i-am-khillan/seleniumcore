package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			Object[][] data=getTestData("register");
			System.out.println(data);
			
		 } catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	}

		public static String TEST_DATA_SHEET_PATH = "./src/test/resources/testdata/opencartTestDAta.xlsx";

		public static Workbook book;
		public static Sheet sheet;

		public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
			System.out.println("Reading test data from sheet : " + sheetName);
			Object data[][] = null;

			try {
				FileInputStream ip = new FileInputStream(TEST_DATA_SHEET_PATH);
				book = WorkbookFactory.create(ip);
				sheet = book.getSheet(sheetName);
				data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
				for (int i = 0; i < sheet.getLastRowNum(); i++) {
					for (int j = 0; j < sheet.getRow(0).getFirstCellNum(); j++) {
						data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}

}
