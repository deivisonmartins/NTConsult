package br.com.ntconsult.teste;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import br.com.ntconsult.teste.massa.Massa;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CenariosDeleteAPI extends Massa{
	
	protected RequestSpecification given = RestAssured.given();
	
	@Dado("que devo deletar o id1")
	public Response que_devo_deletar_o_id1() {

		Response response = given().contentType("application/json").when().delete(api + "posts/" + id1);
		response.then().statusCode(200);
		return response;
	}

	@Entao("deve validar o retorno1")
	public void deve_validar_o_retorno1() {

		Assert.assertEquals(que_devo_deletar_o_id1().getStatusCode(), 200);
	}

	@Dado("que devo excluir o id2")
	public Response que_devo_excluir_o_id2() {

		Response response = given().contentType("application/json").when().delete(api + "posts/" + id2);
		response.then().statusCode(200);
		return response;
	}
	
	@Entao("deve verificar o retorno2")
	public void deve_verificar_o_retorno2() {
		
		Assert.assertEquals(que_devo_excluir_o_id2().getStatusCode(), 200);
	}

	@Dado("que devo deletar o id3")
	public Response que_devo_deletar_o_id3() {
	    
		Response response = given().contentType("application/json").when().delete(api + "posts/" + id2);
		response.then().statusCode(200);
		return response;
	}

	@Entao("deve validar o retorno3")
	public void deve_validar_o_retorno3() {
		
		Assert.assertEquals(que_devo_deletar_o_id3().getStatusCode(), 200);
	}

	@Dado("que devo deletar o id4")
	public Response que_devo_deletar_o_id4() {

		Response response = given().contentType("application/json").when().delete(api + "posts/" + id2);
		response.then().statusCode(200);
		return response;
	}

	@Entao("deve validar o retorno4")
	public void deve_validar_o_retorno4() {

		Assert.assertEquals(que_devo_deletar_o_id4().getStatusCode(), 200);
	}
}