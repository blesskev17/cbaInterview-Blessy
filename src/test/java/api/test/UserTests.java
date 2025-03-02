package api.test;


import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoint;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests {

	Faker faker;
	User userPayload;

	@BeforeClass
	public void setupData() {
		faker = new Faker();
		userPayload = new User();

		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
		
		userPayload.print();
	}
	
	@Test(priority = 1)
	public void testPostUser() {
		JSONObject jsonObj = new JSONObject( userPayload );
        System.out.println( jsonObj );
		Response response= UserEndPoint.CreateUser(userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2)
	public void testGetUserbyName() throws InterruptedException {
		Response response;
		Thread.sleep(600);
		response = UserEndPoint.getUser(userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 3)
	public void testUpdateUser() throws InterruptedException {
//		String oldEmail =userPayload.getEmail();
		Thread.sleep(600);
		String newEMail = faker.internet().safeEmailAddress();
		System.out.println("newEMail: "+newEMail);
		userPayload.setEmail(newEMail);
		Response response= UserEndPoint.putUser(userPayload.getUsername(),userPayload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		this.testGetUserbyName();
		//Assert.assertEquals(newEmail.equals(oldEmail), true);
	}
	
	@Test(priority = 4)
	public void testDeleteUser() throws InterruptedException {
		Thread.sleep(600);
		Response response= UserEndPoint.deleteUser(userPayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
