package br.com.ntconsult.teste;

import org.json.simple.JSONObject;
import org.junit.Assert;

import br.com.ntconsult.teste.massa.Massa;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class CenariosPostAPI extends Massa{
	
	@Dado("que devo preencher os campos1")
	public Response que_devo_preencher_os_campos1() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId);
		requestParam.put("title", title);
		requestParam.put("body", body);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
		
		return  response;
	}

	@Entao("devo validar o retorno1")
	public void devo_validar_o_retorno1() {
		
		Assert.assertEquals(que_devo_preencher_os_campos1().getStatusCode(), 201);
	}

	@Dado("que devo preencher os campos2")
	public Response que_devo_preencher_os_campos2() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId0);
		requestParam.put("title", title0);
		requestParam.put("body", body0);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
		
		return  response;
	}

	@Entao("devo validar o retorno2")
	public void devo_validar_o_retorno2() {

		Assert.assertEquals(que_devo_preencher_os_campos2().getStatusCode(), 201);
	}

	@Dado("que devo preencher os campos3")
	public Response que_devo_preencher_os_campos3() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId1);
		requestParam.put("title", title1);
		requestParam.put("body", body1);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
		
		return  response;
	}

	@Entao("devo validar o retorno3")
	public void devo_validar_o_retorno3() {

		Assert.assertEquals(que_devo_preencher_os_campos3().getStatusCode(), 201);
	}

	@Dado("que devo preencher os campos4")
	public Response que_devo_preencher_os_campos4() {
		
		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userId2);
		requestParam.put("title", title2);
		requestParam.put("body", body2);
		
		request.body(requestParam.toJSONString());
		Response response = request.post(api + "posts");
		response.then().statusCode(201);
		
		return  response;
	}

	@Entao("devo validar o retorno4")
	public void devo_validar_o_retorno4() {
	    	
		Assert.assertEquals(que_devo_preencher_os_campos4().getStatusCode(), 201);
	}
}