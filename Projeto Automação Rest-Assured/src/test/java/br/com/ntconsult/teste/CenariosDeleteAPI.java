package br.com.ntconsult.teste;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.ntconsult.teste.massa.Massa;
import io.restassured.response.Response;

public class CenariosDeleteAPI extends Massa{
	
	@Test
	public void deletePost1(){
		
		Response response =
				given().
					contentType("application/json").
				when().
					delete(api + "posts/" + id1);
		response.then().statusCode(200);
	}
	
	@Test
	public void deletePost2(){
				
		Response response =
				given().
					contentType("application/json").
				when().
					delete(api + "posts/" + id2);
		response.then().statusCode(200);
	}
	
	@Test
	public void deletePost3(){
				
		Response response =
				given().
					contentType("application/json").
				when().
					delete(api + "posts/" + id3);
		response.then().statusCode(200);
	}
	
	@Test
	public void deletePost4(){
		
		Response response =
				given().
					contentType("application/json").
				when().
					delete(api + "posts/" + id4);		
		response.then().statusCode(200);
	}
}