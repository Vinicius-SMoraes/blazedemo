// 1 - Bibliotecas / imports
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


// 2- Classe 
public class PassagemTest {
    // 2.1 - Atributos / caracteristicas 
    private WebDriver driver; // aqui o "driver" é um objeto
    // 2.2 - Funções e metodos

    // Antes do testes 
    @BeforeEach
    public void iniciar() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Instanciar o objeto do Selenium como ChromeDriver
        driver.manage().window().maximize();
    }

    // Depois do teste 
    @AfterEach
    public void finalizar() {
        driver.quit();
    }   

    //Teste 
    @Test
    public void comprarPassagem() {
        driver.get("https://www.blazedemo.com"); // abre o site 
        // Seleciona origem, destino e aperta o botão "find Flights"
        driver.findElement(By.name("fromPort")).click(); // clica no combo 
        {
            WebElement dropdown = driver.findElement(By.name("fromPort"));
            dropdown.findElement(By.xpath("//option[. = 'São Paolo']")).click(); // clica na opção de passagem
        }

        driver.findElement(By.name("toPort")).click();
        {
            WebElement dropdown = driver.findElement(By.name("toPort"));
            dropdown.findElement(By.xpath("//option[. = 'Cairo']")).click();
        }

        driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

        // transição de página 


        // verifica se foi realizado um login e a pesquisa dos voos
        assertEquals("Flights from São Paolo to Cairo:", 
            driver.findElement(By.cssSelector("h3")).getText());

        
        
        //clica no botãp de voo desejado 
        
        driver.findElement(By.cssSelector("tr:nth-child(1) .btn")).click();

        // transição de página 

        // verica se está na página de compras 

        assertEquals("Your flight from TLV to SFO has been reserved.", 
        driver.findElement(By.cssSelector("h2")).getText());


 } // final do comprar passagem 

} // final da classe PassagemTest
