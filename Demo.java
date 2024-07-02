package com.automation.project;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
         try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
  
            WebDriverWait wait = new WebDriverWait(driver, 10);
            //Explicit wait to ensure the element is present and visible
            //WebDriverWait wait = new WebDriverWait(driver, 10);
            // Interact with the element
            //WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            //username.sendKeys("Admin");
            //WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            //password.sendKeys("admin123");
            //WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
            //button.click();
            // Locate the username field and enter the username
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
            usernameField.sendKeys("Admin");

            // Locate the password field and enter the password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
            passwordField.sendKeys("admin123");

            // Locate the login button and click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            loginButton.click();

        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
            
        }
               
           // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
           //driver.findElement(By.xpath("username")).sendKeys("Admin");
            
        }


    }
