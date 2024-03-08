import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
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


        builder.click(ele).perform();
        // Active element
        String activeelement = driver.findElement(By.xpath("//*[@class='active']/h1")).getText();
        System.out.println("The active element after left click is : " + activeelement);


        builder.doubleClick(ele).perform();
        String activeelement2 = driver.findElement(By.xpath("//*[@class='active']/h1")).getText();
        System.out.println("The active element after double click is : " + activeelement2);

        builder.contextClick(ele).perform();
        String activeelement3 = driver.findElement(By.xpath("//*[@class='active']/h1")).getText();
        System.out.println("The active element after right click is : " + activeelement3);




        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}