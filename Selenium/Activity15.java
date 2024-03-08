import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

class Activity15 {
    public static <JavascriptExecutor> void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // check if the text field is enabled
        WebElement textfield = driver.findElement(By.id("input-text"));
        System.out.println("Text filed enabled? " + textfield.isEnabled());
        // click the enable button
        driver.findElement(By.id("toggleInput")).click();
        // check after clicking the enable button
        System.out.println("Text filed enabled after clicking the button? " + textfield.isEnabled());

        // Close the browser
        driver.close();
    }
}
