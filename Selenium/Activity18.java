import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class Activity18 {
    public static <JavascriptExecutor> void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());


        //Enter username
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
        username.sendKeys("admin");
        //Enter password
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
        password.sendKeys("password");
        //Click the login button
        WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginbtn.isEnabled();
        loginbtn.click();
        //  Print the Welcome message
        WebElement msg = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        System.out.println(msg.getText());


        // Close the browser
        driver.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////
///ANSWER
/////////////////////////////////////////////////////////////////////////////


//public class Activity15 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the username and password fields
//        WebElement username = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
//        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
//        // Enter the credentials
//        username.sendKeys("admin");
//        password.sendKeys("password");
//        // Find and click the submit button
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//        // Print the login message
//        String message = driver.findElement(By.id("action-confirmation")).getText();
//        System.out.println("Login message: " + message);
//
//        // Close the browser
//        driver.quit();
//    }
//}