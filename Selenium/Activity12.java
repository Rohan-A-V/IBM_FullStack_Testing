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

class Activity12 {
    public static <JavascriptExecutor> void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.amazon.in");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 15" + Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")));
//        driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).sendKeys(Keys.CONTROL,Keys.END);

        WebElement name = driver.findElement(By.xpath("(//span[contains(@Class,'a-size-medium a-color-base a-text-normal')])[3]"));
        System.out.println(name.getText());
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
        System.out.println(price.getText());
        // Close the browser
        driver.close();
    }
}


