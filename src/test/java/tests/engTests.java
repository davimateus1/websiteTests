package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class engTests {
    @Test
    public void testSignInUOL(){
        System.setProperty("webdriver.chrome.driver", "B:\\webDriver\\chromedriver.exe");
        WebDriver navigator = new ChromeDriver();
        navigator.get("https://davimateusga.vercel.app/");

        navigator.findElement(By.linkText("Contate-me")).click();

        navigator.findElement(By.name("name")).sendKeys("Davi Mateus Gomes de Almeida");
        navigator.findElement(By.name("email")).sendKeys("tutoriaisdavi5@gmail.com");
        navigator.findElement(By.name("message")).sendKeys("Testes de engenharia de software");

        String result = navigator.findElement(By.tagName("p")).getText();

        assertEquals("Se gostou do meu trabalho e está interessado em algum projeto ou tem alguma dúvida, me manda uma mensagem!", result);

        navigator.quit();
    }
}
