package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver; //1 passo page object

    public HomePage(WebDriver driver) { // 3 passo page object (2 passo em DescontosStep)
        this.driver = driver;

    }

    public void acessarAplicacao(){
        driver.manage().window().maximize();
        driver.get("https://qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"), 10);
        Assert.assertEquals(true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());  //queremos que o que pesquisarmos seja verdadeiro (true)

    }

    public void scrollDown() throws InterruptedException {
        //comando scroll
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,11000)");
        Thread.sleep(2000); //o sleep nem sempre é uma melhor solução

    }

    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("finotti@qazando.com.br");

    }

    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();

    }

    public void verificarCupomDesconto(){
        String textoCupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("QAZANDO15OFF", textoCupom);

    }



}
