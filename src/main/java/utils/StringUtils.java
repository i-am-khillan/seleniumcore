package utils;

public class StringUtils {
	
	private StringUtils() {
		//no can create the object of this class
	}
	
	public static String getRadomEmail() {
		return "automation"+System.currentTimeMillis()+"@"+"opencat.com";
		//return "automation"+UUID.randomUUID()+"@opencat.com";
	
	//9999-98999-99999-988
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
	//automation1764916182114@opencat.com
		
		//delete from user where email like '%automation%';
	
	}

}
