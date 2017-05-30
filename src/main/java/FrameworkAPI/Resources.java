package FrameworkAPI;

public class Resources {
	
	public static String sessionID(){
		
		String ID="/rest/auth/1/session";
		return ID;
		
	}
	
	public static String createIssue(){
		
		String issue = "/rest/api/2/issue";
		return issue;
		
	}

}
