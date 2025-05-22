package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends HomePage {
    // cria o construtor
    public ReservePage(WebDriver driver){ 
        super(driver);  // Driver herdado do CommonPage - super classe 
        PageFactory.initElements(driver, this);
    }

    // Elementos mapeados 
    @FindBy(css = "h3")
    WebElement flightsHeader;

    // Ações com os elementos mapeados 
    public String lerCabecalhoVoos(){
        return flightsHeader.getText();
    }
}
