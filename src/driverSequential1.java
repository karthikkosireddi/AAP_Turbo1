import java.util.ArrayList;

public class driverSequential1 {
	/* Purpose : 
	1. Read UTC and RS
2. Identify the Run to execute
	3. Go to each browser as chosen. 
	4. Execute all UTC for each browser 
	
	
	*/
	
	// Unique Test Cases and RunSettings
	static String[][] xUTC, xSettings;
	
	// Run Setting Parameters
	static int setTurboSpeed;
	static String[] setBrowser;
	
	// Array of threads to run in parallel ** TURBO **
	static ArrayList<Thread> threadListTC = new ArrayList<Thread>(50);
	
	// Inbuilt libraries
	static XLLibrary xlObject = new XLLibrary();
	static openSourceKeywords obj = new openSourceKeywords();
	
	long startTime, endTime, totalTime;
	static int xUTC_Rows, xSet_Rows;

	
	public static void main(String[] args) throws Exception{
		System.out.println("Hi AnyAUT!");
		// obj.searchGoogle("Chrome", "IteLearn");

		// Read UTC and RunSettings
		xUTC = xlObject.readXL("‪C:\\AnyAUT_Peach\\UTCFile.xlsx", "UTC");
		xSettings = xlObject.readXL("‪C:\\AnyAUT_Peach\\UTCFile.xlsx", "RunSettings");

		xUTC_Rows = xUTC.length;
		System.out.println("Number of Unique Test Cases are : " + xUTC_Rows);
		
		
		// 1. Read the test settings
		// setTurboSpeed = 3;
		// setBrowser[3] = {"Chrome", "Firefox", "IE"};
		
		}
	}
}
