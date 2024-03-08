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

class Activity14 {
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


        // Find the toggle button and click it
        WebElement chkboxbt = driver.findElement(By.id("toggleCheckbox"));
        WebElement chkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));

        System.out.println("Check Selected ? " + chkbox.isSelected());
        chkbox.click();
        System.out.println("Check Selected after click ? " + chkbox.isSelected());


        // Close the browser
        driver.close();
    }
}
