package br.com.ntconsult.teste;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:target/cucumber.json", 
		"html:target/cucumber-html-report", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json", 
		"junit:target/cucumber-results.xml"},
			features = "src/test/resources",
			glue = {"br.com.ntconsult.teste"}
)
public class CucumberIntegrationTest {
	
}