package br.com.ntconsult.teste;

import org.json.simple.JSONObject;
import org.junit.Test;

import br.com.ntconsult.teste.massa.Massa;
import io.restassured.response.Response;

public class CenariosPutAPI extends Massa{
		
	@Test
	public void updatePost1(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate);
		requestParam.put("title", title1);
		requestParam.put("body", body1);
		requestParam.put("id", id1);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id1);
		response.then().statusCode(200);
			
		System.out.println("Retorno => " + response.body().asString());
	}
	
	@Test
	public void updatePost2(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate1);
		requestParam.put("title", title0);
		requestParam.put("body", body0);
		requestParam.put("id", id2);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id2);
		response.then().statusCode(200);
			
		System.out.println("Retorno => " + response.body().asString());
	}
	
	@Test
	public void updatePost3(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate2);
		requestParam.put("title", title1);
		requestParam.put("body", body1);
		requestParam.put("id", id3);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id3);
		response.then().statusCode(200);
			
		System.out.println("Retorno => " + response.body().asString());
	}
	
	@Test
	public void updatePost4(){
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate3);
		requestParam.put("title", title2);
		requestParam.put("body", body2);
		requestParam.put("id", id4);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id4);
		response.then().statusCode(200);
			
		System.out.println("Retorno => " + response.body().asString());
	}
}