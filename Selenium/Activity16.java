import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class Activity16 {
    public static <JavascriptExecutor> void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tables");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());
        // print the no of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println("Number of rows : " + rows.size());
        // print the no of columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        System.out.println("Number of columns : " + cols.size());

        //print the values in the 3rd row
        WebElement thirdRow = rows.get(2); // Index 2 for the 3rd row
        List<WebElement> cells = thirdRow.findElements(By.tagName("td"));
        for (WebElement cell : cells) {
            System.out.println(cell.getText());
        }

        // Find the cell value at the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("Value of the 2nd row 2nd column is : " + cellValue.getText());



        // Close the browser
        driver.close();
    }
}


/////////////////////////////////////////////////////////////////////////////////////
///ANSWER
//////////////////////////////////////////////////////////////////////////////


//public class Activity13 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/tables");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Print the number of columns
//        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
//        System.out.println("Number of columns: " + cols.size());
//        // Print the number of rows
//        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
//        System.out.println("Number of rows: " + rows.size());
//
//        // Print the cells values of the third row
//        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
//        System.out.println("Third row cell values: ");
//        for(WebElement cell : thirdRow) {
//            System.out.println(cell.getText());
//        }
//
//        // Print the cell value of the second row and second column
//        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());
//
//        // Close the browser
//        driver.close();
//    }
//}
