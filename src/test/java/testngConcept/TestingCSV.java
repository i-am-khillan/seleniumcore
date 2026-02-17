package testngConcept;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class TestingCSV {
	

	
	@DataProvider(name="csvData")
	public Object[][] cvsData(){
		String csvFile="C:\\Users\\kverma\\eclipse-workspace\\seleniumcore\\src\\test\\resources\\TestData\\TestData.csv"
				+ "";
		Object[][] data=null;
		try {
			CSVReader reader=new CSVReader(new FileReader(csvFile));
			try {
				List<String[]>rows=reader.readAll();
				reader.close();
				 data=new Object[rows.size()][];
				for(int i=0;i<rows.size();i++) {
					data[i]=rows.get(i);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CsvException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	@Test(dataProvider="csvData")
	public void testData(String param1,String param2,String param3) {
	
		System.out.println(param1 +"---"+param2+"---"+param3);
	}
}
