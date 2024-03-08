import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Provider;
import java.time.Duration;
import java.util.Objects;

public class Activity8 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");



        // Printing the title of the page
        System.out.println("Home page title : " + driver.getTitle());

        //Webelements used
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        Actions builder = new Actions(driver);

        // Drag the ball to Dropzone 1
        builder.dragAndDrop(ball,dropzone1).pause(3000).perform();
        //Drag the ball to Dropzone 2
        builder.dragAndDrop(ball,dropzone2).perform();

        // Checking if the ball has been dropped in Dropzone2
        String output = driver.findElement(By.xpath("//*[@id='dropzone2']/p")).getText();
        if (Objects.equals(output, "Dropped!")){
            System.out.println("Ball has been dropped in the Dropzone 2");
        }
        else {
            System.out.println("Ball has not been dropped in the Dropzone 2");
        }
        // Close the browser
        driver.quit();
    }
}



//////////////////////////////////////////////////////////////////////////////////////
//ANSWER
/////////////////////////////////////////////////////////////////////////////

//public class Activity7 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Actions object
//        Actions builder = new Actions(driver);
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/drag-drop");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Find the football
//        WebElement football = driver.findElement(By.id("draggable"));
//        // Find the dropzone1
//        WebElement dropzone1 = driver.findElement(By.id("droppable"));
//        // Find the dropzone2
//        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
//
//        // Perform drag and drop to dropzone 1
//        builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
//
//        // Perform drag and drop to dropzone 2
//        builder.dragAndDrop(football, dropzone2).build().perform();
//
//        // Close the browser
//        driver.close();
//    }
//}