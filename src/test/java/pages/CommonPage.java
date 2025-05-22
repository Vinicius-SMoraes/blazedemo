package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {
    public WebDriver driver; // Esse selenium esta aqui apenas para o controle dessa parte do código quando for necessário 

    // Construtor que conecta o exterior e o interior da classe
    public CommonPage(WebDriver driver) {
        this.driver = driver;
    } 

     public String lerNomeDaGuia(){
        return driver.getTitle();
    }

}
