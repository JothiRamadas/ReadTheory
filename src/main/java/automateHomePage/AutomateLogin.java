package automateHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateLogin{

    public void automateWithValidData()
    {
        WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://readtheory.org/");
    driver.findElement(By.id("menu-item-819")).click();
    driver.findElement(By.id("username")).sendKeys("ishankar");
    driver.findElement(By.id("password")).sendKeys("goring18");
    driver.findElement(By.id("ajaxLogin")).click();

    new Select(driver.findElement(By.id("studentAgeField"))).selectByVisibleText("8");
    driver.findElement(By.xpath("/html/body/div[16]/div[3]/div/button")).click();
        driver.get("https://readtheory.org/reading/welcomeReader");
    //driver.findElement(By.xpath("/html/body")).click()
        //System.out.println("before my progress");
        //driver.findElement(By.linkText("My Progress")).click();
        //driver.findElement(By.xpath("//a[@href ='/dashboard/index']")).click();
        //driver.findElement(By.xpath("//a[text()='My Progress']")).click();
        // System.out.println("after my progress");
        driver.findElement(By.id("logout")).click();


    }

    public static void main(String[] args) {
        AutomateLogin automateLogin=new AutomateLogin();
        System.out.println("before calling main function");
        automateLogin.automateWithValidData();
        System.out.println("after calling main function");

    }

}







