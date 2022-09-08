package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest { //o extends serve para "herdar" tudo o que tem na classe RunCucumbertEST

    HomePage homePage = new HomePage(driver); //2 passo page object: instanciação

    @Dado("que estou no site da qazando")
    public void que_estou_no_site_da_qazando() {
        homePage.acessarAplicacao();

    }

    @Quando("eu preencher o meu e-mail")
    public void eu_preencher_o_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencheEmail();

    }

    @Quando("clico no botão ganhar cupom")
    public void clico_no_botão_ganhar_cupom() {
        homePage.clickGanharDesconto();
    }

    @Então("eu vejo o código de desconto")
    public void eu_vejo_o_código_de_desconto() {
        homePage.verificarCupomDesconto();


    }

}


