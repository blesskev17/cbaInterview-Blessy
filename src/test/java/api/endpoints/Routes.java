package api.endpoints;

/***
 * swagger URI -- https://petstore.swagger.io/
 * 
 * Create User:  https://petstore.swagger.io/v2/user
 * Get User: https://petstore.swagger.io/v2/user/{username}
 * Update User: https://petstore.swagger.io/v2/user/{username}
 * Delete User: https://petstore.swagger.io/v2/user/{username}
 * 
 * **/


public class Routes {
	
	public static String baseURL = "https://petstore.swagger.io/v2";
	
	//User Module
	public static String postUserURL = "https://petstore.swagger.io/v2/user";
	public static String getUserURL = baseURL + "/user/{username}";
	public static String putUserURL = baseURL + "/user/{username}";
	public static String deleteUserURL = baseURL + "/user/{username}";
	
	// Store Module
	
	// Pet Module

}
