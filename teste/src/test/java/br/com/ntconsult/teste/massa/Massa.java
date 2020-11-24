package br.com.ntconsult.teste.massa;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Massa {
	
	protected String api = "http://jsonplaceholder.typicode.com/";
	
	protected String bodyGet1 = "4";
	protected String bodyGet2 = "45";
	protected String bodyGet3 = "65";
	
	protected static Integer userId = 104;
	protected String title = "Junit 5";
	protected String body = "JUnit 5 é a próxima geração de JUnit. "
			+ "                O objetivo é criar uma base atualizada para testes do lado do desenvolvedor na JVM. "
			+ "                Isso inclui focar em Java 8 e superior, bem como habilitar muitos estilos diferentes de teste."
			+ "                JUnit 5 é o resultado da JUnit Lambda e sua campanha de crowdfunding no Indiegogo .";
	
	protected Integer userId0 = 105;
	protected String title0 = "RestAssured";
	protected String body0 = "Testar e validar serviços REST em Java é mais difícil do que em linguagens dinâmicas como Ruby e Groovy. "
			+ "					REST Assured traz a simplicidade de usar essas linguagens para o domínio Java";
	
	protected Integer userId1 = 106;
	protected String title1 = "Cucumber";
	protected String body1 = "É uma ferramenta de software que suporta o desenvolvimento orientado pelo comportamento. "
			+ "					O ponto central da abordagem do BDD do pepino é o seu analisador de idioma comum chamado Gherkin";
	
	protected Integer userId2 = 107;
	protected String title2 = "Maven";
	protected String body2 = "Apache Maven, ou Maven, é uma ferramenta de automação de compilação utilizada primariamente em projetos Java. "
			+ "					Ela é similar à ferramenta Ant, mas é baseada em conceitos e trabalhos diferentes em um modo diferente. "
			+ "					Também é utilizada para construir e gerenciar projetos escritos em C#, Ruby, Scala e outras linguagens";
	
	protected RequestSpecification request = RestAssured.given();
	
	protected Integer id1 =  8;
	protected Integer id2 =  18;
	protected Integer id3 =  28;
	protected Integer id4 =  38;
	
	protected Integer userIdUpdate = 1;
	protected Integer userIdUpdate1 = 2;
	protected Integer userIdUpdate2 = 3;
	protected Integer userIdUpdate3 = 4;
}
