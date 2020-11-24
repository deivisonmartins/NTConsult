package br.com.ntconsult.teste;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.ntconsult.teste.massa.Massa;
import io.restassured.response.Response;

public class CenariosGetAPI extends Massa{

	@Test
	public void consulta_posts(){
		
		Response response =
				given().
					contentType("application/json").
				when().
					get(api + "posts");
		
		response.then().statusCode(200);
		System.out.println("Retorno => " + response.body().asString());
	}
	
	@Test
	public void consulta_post_id(){
		
		Response response =
				given().
					contentType("application/json").
				when().
					get(api + "posts/" + bodyGet1);
		
		response.then().statusCode(200);
		System.out.println("Retorno => " + response.body().asString());
	}
	
	@Test
	public void consulta_posts_postId(){
		
		Response response =
				given().
					contentType("application/json").
				when().
				param("postId" + bodyGet2).
					get(api + "comments?/");
		
		response.then().statusCode(200);
		System.out.println("Retorno => " + response.body().asString());
	}
	
	@Test
	public void consulta_posts_comments_id(){
		
		Response response =
				given().
					contentType("application/json").
				when().
					get(api + "posts/" + bodyGet3 + "/comments");
		
		response.then().statusCode(200);
		System.out.println("Retorno => " + response.body().asString());
	}
	
}
