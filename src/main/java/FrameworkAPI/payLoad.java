package FrameworkAPI;

public class payLoad {

	public static String createBug(){
		
	String Bug = "{"+
			   "\"fields\":   {"+
		       "\"project\":{ "+
					"\"key\":\"CRED\""+
			   "},"+
				"\"summary\": \"Credit card defect\","+
				"\"description\":\"ISSUE WITH CARD NUMBER\","+
				"\"issuetype\": {"+
				  "\"name\":\"Bug\""+
			   "}"+
		    "}} ";
	return Bug;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}