package utils;

public class TimeUtil {
	private final static int DEFAULT_TIME = 500;
	private final static int DEFAULT_SHORT_TIME = 2000;
	private final static int DEFAULT_Medium_TIME = 5000;
	private final static int DEFAULT_Long_TIME = 10000;
	private final static int Max_TIME = 15000;

	public static void applyWait(int waitTime) {
		try {
			Thread.sleep(waitTime *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void defaultTime() {
		try {
			Thread.sleep( DEFAULT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void shortTime() {
		try {
			Thread.sleep( DEFAULT_SHORT_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void mediumTime() {
		try {
			Thread.sleep( DEFAULT_Medium_TIME);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		//return DEFAULT_Medium_TIME;
	}
	public static void longTime() {
		try {
			Thread.sleep( DEFAULT_Long_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return DEFAULT_Long_TIME;
	}
	public static void maxTime() {
		try {
			Thread.sleep( Max_TIME);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	return Max_Long_TIME;
	}
	
}
