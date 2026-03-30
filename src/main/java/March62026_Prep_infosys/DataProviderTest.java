package March62026_Prep_infosys;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@DataProvider(name="dataproviderLogin")
	public Object[][] getdataProvider() {
		
		return new Object[][] {
			{"khillan","23","Noida"},
			{"Prem","33","Gwalior"},
			{"Shyma","54","Gr. Noida"},
			{"PremSingh","54","delhi"},
			{"Ramzi","54","Pune"}
			
			};
	}
	
	@Test(dataProvider="dataproviderLogin")
	public void testData(String name ,String age,String cityName) {
		System.out.println(name  +"=="+age +"=="+cityName);
	}

}
