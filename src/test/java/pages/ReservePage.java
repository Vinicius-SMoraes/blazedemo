package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends HomePage {
    public ReservePage(WebDriver driver){
        super(driver);  // Driver herdado do CommonPage - super classe 
        PageFactory.initElements(driver, this);
    }

    // Elementos mapeados 

    // Ações com os elementos mapeados 
}
