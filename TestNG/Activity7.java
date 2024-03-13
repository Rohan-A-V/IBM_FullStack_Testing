import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {
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
    @Test(dataProvider = "Authentication")
    public void test1(String Username,String password){

        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class=\"ui button\"]")).click();
        String c=driver.findElement(By.xpath("//div[@id=\"action-confirmation\"]")).getText();
        Assert.assertEquals(c,"Welcome Back, admin");
    }

    @DataProvider(name = "Authentication")
    public Object[][] LoginData() {

        return new Object[][]{

                {"admin", "password"}
        };

    }
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}