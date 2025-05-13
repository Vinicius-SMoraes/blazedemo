package pages;

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

    @FindBy(css = "input[value]")
    WebElement btnFindFlights;

    // Ações com os elementos mapeados 
}
