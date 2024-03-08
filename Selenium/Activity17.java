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

class Activity17 {
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
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows : " + rows.size());
        // print the no of columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Number of columns : " + cols.size());


        // Find the cell value at the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Value of the 2nd row 2nd column is : " + cellValue.getText());

        //sort by clicking the header of the first column
        WebElement col1 = driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th"));
        col1.click();

        //check the value again in the second row second column
        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Value of the 2nd row 2nd column after sorting is : " + cellValue.getText());

        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("footer cell values: ");
        for (WebElement cell : footer) {
            System.out.println(cell.getText());
        }
            // Close the browser
            driver.close();
        }
    }



/////////////////////////////////////////////////////////////////////////////////////
///ANSWER
//////////////////////////////////////////////////////////////////////////////


//public class Activity14 {
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
//        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
//        System.out.println("Number of columns: " + cols.size());
//        // Print the number of rows
//        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
//        System.out.println("Number of rows: " + rows.size());
//
//        // Print the cell value of the second row and second column
//        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());
//
//        // Sort the table
//        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();
//
//        // Print the cell value of the second row and second column again
//        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());
//
//        // Print the cell values of the footer
//        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
//        System.out.println("Cell values of the footer: ");
//        for(WebElement cell : footer) {
//            System.out.println(cell.getText());
//        }
//
//        // Close the browser
//        driver.quit();
//    }
//}