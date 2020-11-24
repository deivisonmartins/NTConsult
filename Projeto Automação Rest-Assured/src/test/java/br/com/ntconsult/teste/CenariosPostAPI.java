package br.com.ntconsult.teste;

import org.json.simple.JSONObject;
import org.junit.Test;

import br.com.ntconsult.teste.massa.Massa;
import io.restassured.response.Response;

public class CenariosPostAPI extends Massa{
	
	@Test
	public void insertNewJunit(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId);
		requestParam.put("title", title);
		requestParam.put("body", body);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
			
		System.out.println("Retorno => " + response.body().asString()); 
	}
	
	@Test
	public void insertNewRestAssured(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId0);
		requestParam.put("title", title0);
		requestParam.put("body", body0);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
			
		System.out.println("Retorno => " + response.body().asString()); 
	}
	
	@Test
	public void insertNewCucumber(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId1);
		requestParam.put("title", title1);
		requestParam.put("body", body1);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
			
		System.out.println("Retorno => " + response.body().asString()); 
	}
	
	@Test
	public void insertNewMaven(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId2);
		requestParam.put("title", title2);
		requestParam.put("body", body2);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
			
		System.out.println("Retorno => " + response.body().asString()); 
	}
}