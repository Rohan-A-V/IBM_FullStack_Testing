import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(priority = 1)
    public void title() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Target Practice", title);
    }
    @Test(priority = 2)
    public void blackButton(){
        WebElement black = driver.findElement(By.xpath("//button[text()='Black']"));
        Assert.assertFalse(black.isDisplayed());
    }

    @Test(priority = 3, enabled = false)
    public void skipnotdisplay(){
        System.out.println("Test not skipped");
    }

    @Test(priority = 4)
    public void skipbutdisplay(){
//        String condition = "Skip Test";
        throw new SkipException("Skipping - This is not ready for testing");

    }

    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}



////////////////////////////////////////////////////////////////////////////////////////////////////////
///ANSWER
///////////////////////////////////////////////////////////////////////////


//public class Activity2 {
//    WebDriver driver;
//
//    @BeforeTest
//    public void beforeMethod() {
//        // Set up the Firefox driver
//        WebDriverManager.firefox().setup();
//        //Create a new instance of the Firefox driver
//        driver = new FirefoxDriver();
//
//        //Open the browser
//        driver.get("https://v1.training-support.net/selenium/target-practice");
//    }
//
//    @Test
//    public void testCase1() {
//        //This test case will pass
//        String title = driver.getTitle();
//        System.out.println("Title is: " + title);
//        Assert.assertEquals(title, "Target Practice");
//    }
//
//    @Test
//    public void testCase2() {
//        //This test case will Fail
//        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
//        Assert.assertTrue(blackButton.isDisplayed());
//        Assert.assertEquals(blackButton.getText(), "black");
//    }
//
//    @Test(enabled = false)
//    public void testCase3() {
//        //This test will be skipped and not counted
//        String subHeading = driver.findElement(By.className("sub")).getText();
//        Assert.assertTrue(subHeading.contains("Practice"));
//    }
//
//    @Test
//    public void testCase4() {
//        //This test will be skipped and will be be shown as skipped
//        throw new SkipException("Skipping test case");
//    }
//
//    @AfterTest
//    public void afterMethod() {
//        //Close the browser
//        driver.close();
//    }
//
//}