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

class Activity20 {
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

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select select = new Select(dropdown);

        // select second option using visible text
        select.selectByVisibleText("Option 2");
//        select.deselectByVisibleText("Option 2");

        // Select third option using index
        select.selectByIndex(3);
//        select.deselectByIndex(2);

        // select 4th option using value
        select.selectByValue("4");
//        select.deselectByValue("4");


        //get all options and print them
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}




//////////////////////////////////////////////////////////////////////////////////////////////////
/////////ANSWER
/////////////////////////////////////////////////////////////////////////////

//
//public class Activity17 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/selects");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the dropdown
//        WebElement dropdown = driver.findElement(By.id("single-select"));
//
//        // Pass the WebElement to the Select object
//        Select singleSelect = new Select(dropdown);
//
//        // Select the second option using visible text
//        singleSelect.selectByVisibleText("Option 2");
//        // Print the selected option
//        System.out.println("Second option: " + singleSelect.getFirstSelectedOption().getText());
//
//        // Select the third option using index
//        singleSelect.selectByIndex(3);
//        // Print the selected option
//        System.out.println("Third option: " + singleSelect.getFirstSelectedOption().getText());
//
//        // Select the fourth option using value attribute
//        singleSelect.selectByValue("4");
//        // Print the selected option
//        System.out.println("Fourth option: " + singleSelect.getFirstSelectedOption().getText());
//
//        // Print all the options
//        List<WebElement> allOptions = singleSelect.getOptions();
//        System.out.println("Options in the dropdown: ");
//        for(WebElement option : allOptions) {
//            System.out.println(option.getText());
//        }
//
//        // Close the browser
//        driver.quit();
//    }
//}