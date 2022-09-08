package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//para dizer que a classe é uma executora de teste, precisamos de 2 anotações:

// primeira
@RunWith(Cucumber.class)
//segunda
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/report.html"}, //colocaremos algumas configurações do relatório do cucumber
        features = "src/test/resources/features", // caminho da pasta onde o BDD está
        glue = {"steps"} //colocar qual a pasta steps
)
public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void iniciar(){
        driver = new ChromeDriver(); //inicia o driver

    }

    @AfterClass
    public static void finalizar(){
        driver.quit(); //finaliza o driver
    }



}
