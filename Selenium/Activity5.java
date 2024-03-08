import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");

        //printing text of 3rd header
        System.out.println(driver.findElement(By.xpath("//*[@id='third-header']")).getText());
        //printing the color of the 5th header
        System.out.println(driver.findElement(By.xpath("//h5")).getCssValue("color"));

        //printing all the classes of the violet button
        System.out.println(driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class"));
        //printing the text in Grey button
        System.out.println(driver.findElement(By.xpath("//button[text()='Grey']")).getText());


        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}