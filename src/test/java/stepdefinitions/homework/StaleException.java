package stepdefinitions.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {
    @Test
    public void logIn(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.carettahotel.com/Account/Logon");
        WebElement userName=driver.findElement(By.id("UserName"));//When locator is not correct, get NoSuchElementException
        WebElement passWord=driver.findElement(By.id("Password"));
        WebElement loginButton = driver.findElement(By.id("btnSubmit"));

        driver.navigate().refresh();

//        StaleElementReferenceException. When we refresh, the elements are no longer attached to dom
//        userName.sendKeys("manager");
//        passWord.sendKeys("Manager1!");
//        loginButton.click();

        try{
            WebElement userName2=driver.findElement(By.id("UserName"));//When locator is not correct, get NoSuchElementException
            WebElement passWord2=driver.findElement(By.id("Password"));
            WebElement loginButton2 = driver.findElement(By.id("btnSubmit"));
            userName2.sendKeys("manager");
            passWord2.sendKeys("Manager1!");
            loginButton2.click();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        driver.quit();
    }
}
