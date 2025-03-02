package api.endpoints;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import api.payload.User;

public class UserEndPoint {
	
	public static Response CreateUser(User payload) {
		Response response = given()
								.contentType(ContentType.JSON)
								.accept(ContentType.JSON)
								.body(payload)
							.when()
								.post(Routes.postUserURL);
		return response;
	}
	
	public static Response getUser(String userName) {
		Response response = given()
								.pathParam("username", userName)
							.when()
								.get(Routes.getUserURL);
		return response;
	}
	
	public static Response putUser(String userName, User payload) {
		Response response = given()
								.contentType(ContentType.JSON)
								.accept(ContentType.JSON)
								.pathParam("username", userName)
								.body(payload)
							.when()
								.put(Routes.putUserURL);
		
		return response;
	}
	
	public static Response deleteUser(String userName) {
		Response response = given()
								.pathParam("username", userName)
							.when()
								.delete(Routes.deleteUserURL);
		
		
		return response;
	}

}
