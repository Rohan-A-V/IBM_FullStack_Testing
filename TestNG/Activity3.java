import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void testcase1(){
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log in']"));
        Assert.assertTrue(loginbtn.isDisplayed());
        loginbtn.click();

        Assert.assertEquals("Welcome Back, admin",driver.findElement(By.id("action-confirmation")).getText());
        System.out.println("Logged in successfully.");
    }



    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}



////////////////////////////////////////////////////////////////////////////////////////////////////
////ANSWER
////////////////////////////////////////////////////////////////////////////////////////


//public class Activity3 {
//    WebDriver driver;
//
//    @BeforeClass
//    public void beforeClass() {
//        // Set up the Firefox driver
//        WebDriverManager.firefox().setup();
//        driver = new FirefoxDriver();
//
//        //Open browser
//        driver.get("https://v1.training-support.net/selenium/login-form");
//    }
//
//    @Test
//    public void loginTest() {
//        //Find the username and password fields
//        WebElement username = driver.findElement(By.id("username"));
//        WebElement password = driver.findElement(By.id("password"));
//
//        //Enter credentials
//        username.sendKeys("admin");
//        password.sendKeys("password");
//
//        //Click login
//        driver.findElement(By.xpath("//button[text()='Log in']")).click();
//
//        //Read login message
//        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
//        Assert.assertEquals("Welcome Back, admin", loginMessage);
//    }
//
//    @AfterClass
//    public void afterClass() {
//        //Close browser
//        driver.close();
//    }
//}