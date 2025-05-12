package steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComprarPassagemBDD {

    WebDriver driver; // Objeto do Selenium WebDriver 

    @Before
    public void iniciar(){
        WebDriverManager.chromedriver().setup(); // Gerenciador dos drivers do Chrome 
        driver = new ChromeDriver(); // Instancia o driver como ChromeDriver
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)); // Define o tempo de espera implicita de 3000 milissegundos 
        driver.manage().window().maximize(); // Exibe a tela maximizada
    }

    @After
    public void finalizar(){
        driver.quit(); // Destruir o Objeto do Selenium 
    }

    @Dado("que acesso o site {string}")
    public void que_acesso_o_site(String string) {
     
}
    @Quando("seleciono a origem {string} e destino {string}")
    public void seleciono_a_origem_e_destino(String string, String string2) {
     
}
    @E("clico no botao {string}")
    public void clico_no_botao(String string) {
    
}
    @Entao("vizualizo a lista de voos")
    public void vizualizo_a_lista_de_voos() {
    
}
}
