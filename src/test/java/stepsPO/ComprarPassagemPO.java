package stepsPO;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ReservePage;
import pages.Base;

public class ComprarPassagemPO {
    // Atributos da classe - Ponto final 

    final WebDriver driver;             // Selenium que só pode usar e devolver 
    private HomePage homePage;          // Só eu posso usar a home 
    private ReservePage reservePage;    // só eu posso usar a reserve 

    public String origem;
    public String destino;

    public ComprarPassagemPO(Base base){
        this.driver = base.driver;
    }

    // As anotações before e after vão ficar no arquivo "hooks.java"

    @Dado("que acesso o site {string} PO")
    public void que_acesso_o_site_po(String url) {
        homePage = new HomePage(driver);
        homePage.acessarHomePage(url);

        // Validar se abriu a guia correta pelo nome da guia 
        assertEquals("BlazeDemo", homePage.lerNomeDaGuia());
    }

    @Quando("seleciono a {string} e {string} PO")
    public void seleciono_a_e_po(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        homePage.selecionarOrigemDestino(origem, destino);

     
    }

    @E("clico no botao {string} PO")
    public void clico_no_botao_po(String string) {
       homePage.clicarBotaoFindFlights();
       // Chama a página seguinte --> reserve 
       reservePage = new ReservePage(driver);
    }

    @Entao("vizualizo a lista de voos PO")
    public void vizualizo_a_lista_de_voos_po() {
        assertEquals("BlazeDemo - reserve", reservePage.lerNomeDaGuia());
        assertEquals("Flights from " + this.origem + " to " + this.destino + ":", reservePage.lerCabecalhoVoos());
        
    }

}
