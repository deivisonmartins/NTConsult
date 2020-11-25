package br.com.ntconsult.teste;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import br.com.ntconsult.teste.massa.Massa;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;

public class CenariosGetAPI extends Massa{
	
	@Dado("que informo a api de comunicacao")
	public Response que_informo_a_api_de_comunicacao() {
		Response response = given().contentType("application/json").when().get(api + "posts");
		response.then().statusCode(200);
		return response;
	}

	@Entao("deve validar o codigo de retorno")
	public void deve_validar_o_codigo_de_retorno() {
		
		Assert.assertEquals(que_informo_a_api_de_comunicacao().getStatusCode(), 200);
	}
	
	// cenario 2
	@Dado("que devo informar a api com id")
	public Response que_devo_informar_a_api_com_id() {

		Response response = given().contentType("application/json").when().get(api + "posts/" + bodyGet1);
		response.then().statusCode(200);
		
		return response;
	}
	
	@Entao("deve validar o retorno")
	public void deve_validar_o_retorno() {

		Assert.assertEquals(que_devo_informar_a_api_com_id().getStatusCode(), 200);
	}
	
	// cenario 3
	@Dado("que devo informar a api com id comentario")
	public Response que_devo_informar_a_api_com_id_comentario() {

		Response response = given().contentType("application/json").when().param("postId" + bodyGet2).
		get(api + "comments?/");
		response.then().statusCode(200);
		
		return response;
	}
	
	@Entao("deve validar o retorno da consulta")
	public void deve_validar_o_retorno_da_consulta() {

		Assert.assertEquals(que_devo_informar_a_api_com_id_comentario().getStatusCode(), 200);
	}
	
	// cenario 4
	@Dado("que devo informar a api com id comentario2")
	public Response que_devo_informar_a_api_com_id_comentario2() {

		Response response = given().contentType("application/json").when().get(api + "posts/" + bodyGet3 + "/comments");
		response.then().statusCode(200);
		
		return response;
	}
	
	@Entao("deve validar o retorno2")
	public void deve_validar_o_retorno2() {

		Assert.assertEquals(que_devo_informar_a_api_com_id_comentario2().getStatusCode(), 200);
	}
}
