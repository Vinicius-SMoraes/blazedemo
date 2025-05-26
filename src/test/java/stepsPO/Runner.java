package stepsPO;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = { "src/test/resources/featuresPO" },     // caminho para as features
    glue = { "stepsPO" },                               // caminho para a automação
    dryRun = false,                                     // Exibição do log
    monochrome = true                                   // detalhes do log

)   
public class Runner {
    
}
