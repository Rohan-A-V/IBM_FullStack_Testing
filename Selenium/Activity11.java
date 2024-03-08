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

class Activity11 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.google.com");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        //type cheese and click ENTER
        driver.findElement(By.name("q")).sendKeys("cheese"+ Keys.ENTER);
        //Waiting Until Result Stat is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
        //  Printing Result Stat
        System.out.println(driver.findElement(By.id("result-stats")).getText());

        // Close the browser
        driver.close();
    }
}


