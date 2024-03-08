import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");


        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));

        // Printing the title of the page
        System.out.println("Home page title : " + driver.getTitle());
        WebElement ele = driver.findElement(By.xpath("//*[@id='D3Cube']"));
        Actions builder = new Actions(driver);
        // Press R
        builder.sendKeys("R").perform();
        String keypressed = driver.findElement(By.xpath("//*[@id='keyPressed']")).getText();
        System.out.println("Key pressed is :" + keypressed);
        // Press Ctrl + a
        builder.keyDown(Keys.CONTROL ).sendKeys("a").perform();
        // Press ctrl + c
        builder.keyDown(Keys.CONTROL ).sendKeys("c").perform();

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}



//////////////////////////////////////////////////////////////////////////////////////
//ANSWER
/////////////////////////////////////////////////////////////////////////////

//public class Activity6 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Actions object
//        Actions builder = new Actions(driver);
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/input-events");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Press the key
//        builder.sendKeys("S").build().perform();
//        // Press CTRL+A and CTRL+C
//        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//
//        // Close the browser
//        driver.close();
//    }
//}