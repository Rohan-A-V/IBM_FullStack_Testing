import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class Activity21 {
    public static <JavascriptExecutor> void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select select = new Select(dropdown);

        // select javascript using visible text
        select.selectByVisibleText("Javascript");
//        select.deselectByVisibleText("Option 2");

        // Select 4th,5th,6th option using index
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);


        // select node option using value
        select.selectByValue("node");

        //deselect the 5th option
        select.deselectByIndex(4);


        //get all options and print them
        List<WebElement> options = select.getAllSelectedOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}
