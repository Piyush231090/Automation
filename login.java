package com.automation.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class login {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\drivers_automation\\Drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        try {
            // Navigate to the login page
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();

            // Use WebDriverWait to ensure elements are present and interactable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate the username field and enter the username
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
            usernameField.sendKeys("Admin");

            // Locate the password field and enter the password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
            passwordField.sendKeys("admin123");

            // Locate the login button and click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
            loginButton.click();

            // Optionally, wait for a post-login element to verify successful login
            WebElement postLoginElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("POST_LOGIN_ELEMENT_XPATH")));
            if (postLoginElement.isDisplayed()) {
                System.out.println("Login successful!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            
        }
    }
    
}
