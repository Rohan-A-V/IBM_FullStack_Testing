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

class Activity19 {
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


        WebElement username = driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
        WebElement password = driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
        WebElement confirmpassword = driver.findElement(By.xpath("(//input[@placeholder='Password'])[3]"));
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

        //Enter credentials
        username.sendKeys("test");
        password.sendKeys("Password@123");
        confirmpassword.sendKeys("Password@123");
        email.sendKeys("xyz@gmail.com");

        //Click the login button
        WebElement submitbtn = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        submitbtn.isEnabled();
        submitbtn.click();

        //  Print the Welcome message
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));
        WebElement msg = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        System.out.println(msg.getText());


        // Close the browser
        driver.close();
    }
}



/////////////////////////////////////////////////////////////////////////

//public class Activity16 {
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
//        // Find the fields of the sign-up form
//        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
//        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
//        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
//        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
//
//        // Type credentials
//        userName.sendKeys("NewUser");
//        password.sendKeys("Password");
//        confirmPassword.sendKeys("Password");
//        email.sendKeys("real_email@xyz.com");
//        // Click Sign Up
//        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
//
//        // Print login message
//        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
//        System.out.println("Login message: " + loginMessage);
//
//        // Close the browser
//        driver.quit();
//    }
//}