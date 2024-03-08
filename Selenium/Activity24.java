import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Activity24 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        String parenthandle = driver.getWindowHandle();
        //clicking the new tab button
        WebElement newtabbtn = driver.findElement(By.id("launcher"));
        newtabbtn.click();
        //waiting until page contains 2 tabs
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        // changing to the 2nd tab using for loop
        Set<String> handles = driver.getWindowHandles();
        for (String handle: handles){
            if(handle != parenthandle){
                driver.switchTo().window(handle);
            }
        }
        //click button to create new tab
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("actionButton")));
        driver.findElement(By.id("actionButton")).click();

        System.out.println("Second page title: " + driver.getTitle());


        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        // Switch to new tab
        driver.switchTo().window(windowHandlesList.get(2));

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        System.out.println("Last page title: " + driver.getTitle());

        System.out.println("Total tabs opened is : " + windowHandlesList.size());

        // Close the browser
        driver.quit();
    }
}

////////////////////////////////////////////////////////////////////////////////////

//public class Activity24 {
//
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/tab-opener");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Print the handle of the parent window
//        System.out.println("Current tab: " + driver.getWindowHandle());
//        // Find button to open new tab
//        driver.findElement(By.id("launcher")).click();
//
//        // Wait for the second tab to open
//        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//        // Print all window handles
//        System.out.println("Currently open windows: " + driver.getWindowHandles());
//
//        // Switch focus
//        for(String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//        }
//
//        // Wait for the new page to load
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
//        // Print the handle of the current tab
//        System.out.println("Current tab: " + driver.getWindowHandle());
//        // Print the title and heading of the new page
//        System.out.println("Page title: " + driver.getTitle());
//        String pageHeading = driver.findElement(By.className("content")).getText();
//        System.out.println("Page Heading: " + pageHeading);
//        // Find and click the button on page to open another tab
//        driver.findElement(By.id("actionButton")).click();
//
//        // Wait for new tab to open
//        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
//        // Switch focus
//        for(String handle : driver.getWindowHandles()) {
//            driver.switchTo().window(handle);
//        }
//
//        // Wait for the new page to load
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
//        // Print the handle of the current tab
//        System.out.println("Current tab: " + driver.getWindowHandle());
//        // Print the title and heading of the new page
//        System.out.println("Page title: " + driver.getTitle());
//        pageHeading = driver.findElement(By.className("content")).getText();
//        System.out.println("Page Heading: " + pageHeading);
//
//        // Close the browser
//        driver.quit();
//    }
//}