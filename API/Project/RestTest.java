package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestTest {
RequestSpecification requestSpec;
String sshkey;
//String baseRURI ="https://api.github.com";
int keyid;
String Root_URI ="/user/keys";
int userid;

@BeforeClass
public void beforeClass() {
	requestSpec = new RequestSpecBuilder().setContentType(ContentType.JSON)
			.addHeader("Authorization", "token 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")
			.setBaseUri("https://api.github.com")
			.build();
}
@Test
public void PostRequest() {
	String reqBody="{\"title\" : \"TestAPIkey\", \"key\":\"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDCiAmwHB/jROLzSyLvxLwWg0V+TNi7hXBZQ/NesrmuadRbLUFyjH/iWiHQu1+9z58SMHV+LRo/9vwIpIAakQieHPSW3YetLufhAC8w/6xRbqWH/310KB78AcowEgpd8CXxU/O0/MWatTI+Orjzmp+smGLfIIXlbMReitLlw5uTQ2tCMlrXSOaEHr7JV4DCHIcufKPjcOKRQa4mNmVz5opX64DX0iEqknhF3zk02GeNxhXu80AjIKci35W2qDNLsKVojb9Shq9c8xM3Shy3xsZcGwweA+D0itwoQPVoAGBr+n3GeM8B+MTBvgy0JxJtuGBP3Q9NfKLlKrXeEeRtQILd ibmadmin@NBSP0016LK-TP\"}";
	Response response = given().spec(requestSpec)
						.body(reqBody).when().post(Root_URI).then().extract().response();
			
	userid= response.path("id");
	System.out.println(requestSpec);
	String body=response.getBody().asPrettyString();
	System.out.println(body);
	response.then().statusCode(201);
	
}

	@Test
	public void getRequest() {
		
		Response response = given().spec(requestSpec)
				.when().get(Root_URI).then().extract().response();
		System.out.println(response);
	}
	
	@Test
	public void deleteRequest() {
		
		
	}
	
}
