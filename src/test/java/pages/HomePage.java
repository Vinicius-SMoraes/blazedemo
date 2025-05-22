package pages;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{
    
    public HomePage(WebDriver driver){
        super(driver); // Driver herdado do CommonPage - super classe 
        PageFactory.initElements(driver, this);
    }

    // Elementos mapeados 
    // Abaixo temos o mapeamento para os combos origem e destino 
    public By byLocal(String local){
        return By.cssSelector("option[value=\"" + local + "\"]"); // essas \ seguidas de " são para excluir a " que está na frente da \ 
    }

    @FindBy(css = ".btn-primary")
    WebElement btnFindFlights;


    // Ações com os elementos mapeados 
    // Cada ação é um método diferente 
    public void selecionarOrigemDestino(String byOrigem, String byDestino){
        driver.findElement(byLocal(byOrigem)).click();
        driver.findElement(byLocal(byDestino)).click();
    }

    public void clicarBotaoFindFlights(){
        btnFindFlights.click();
    }

    public void acessarHomePage(String url){
        driver.get(url);
    }

   
}
