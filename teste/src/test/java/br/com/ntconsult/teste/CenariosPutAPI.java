package br.com.ntconsult.teste;

import org.json.simple.JSONObject;
import org.junit.Assert;

import br.com.ntconsult.teste.massa.Massa;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;

public class CenariosPutAPI extends Massa{
		
	@Dado("que devo alterar os posts1")
	public Response que_devo_alterar_os_posts1() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate);
		requestParam.put("title", title1);
		requestParam.put("body", body1);
		requestParam.put("id", id1);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id1);
		response.then().statusCode(200);
			
		return response;
	}

	@Entao("deve validar retorno do post1")
	public void deve_validar_retorno_do_post1() {

		Assert.assertEquals(que_devo_alterar_os_posts1().getStatusCode(), 200);
	}

	@Dado("que devo alterar os posts2")
	public Response que_devo_alterar_os_posts2() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate1);
		requestParam.put("title", title0);
		requestParam.put("body", body0);
		requestParam.put("id", id2);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id2);
		response.then().statusCode(200);
			
		return response;
	}

	@Entao("deve validar o retorno do posts2")
	public void deve_validar_o_retorno_do_posts2() {

		Assert.assertEquals(que_devo_alterar_os_posts2().getStatusCode(), 200);
	}

	@Dado("que devo alterar os posts3")
	public Response que_devo_alterar_os_posts3() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate2);
		requestParam.put("title", title1);
		requestParam.put("body", body1);
		requestParam.put("id", id3);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id3);
		response.then().statusCode(200);
			
		return response;
	}

	@Entao("deve validar o retorno do posts3")
	public void deve_validar_o_retorno_do_posts3() {

		Assert.assertEquals(que_devo_alterar_os_posts3().getStatusCode(), 200);
	}

	@Dado("que devo alterar os posts4")
	public Response que_devo_alterar_os_posts4() {

		JSONObject requestParam = new JSONObject();
		requestParam.put("userId", userIdUpdate3);
		requestParam.put("title", title2);
		requestParam.put("body", body2);
		requestParam.put("id", id4);
		
		request.body(requestParam.toJSONString());
		Response response = request.put(api + "posts/" + id4);
		response.then().statusCode(200);
			
		return response;
	}

	@Entao("deve validar o retorno do posts4")
	public void deve_validar_o_retorno_do_posts4() {

		Assert.assertEquals(que_devo_alterar_os_posts4().getStatusCode(), 200);
	}
}