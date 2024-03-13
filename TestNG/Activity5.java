import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity5 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups = {"HeaderTests","ButtonTests"})
    public void testcase1(){
        // Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        //Assertion for page title
        Assert.assertEquals("Target Practice", title);

        //


    }
    @Test(dependsOnMethods = {"testcase1"},groups = {"HeaderTests"})
    public void testcase2(){
        // check the value in header 3
        WebElement h3 = driver.findElement(By.id("third-header"));
        Assert.assertEquals(h3.getText(),"Third header");
    }

    @Test(groups = {"HeaderTests"})
    public void testcase3(){
        String h5 = driver.findElement(By.xpath("//h5")).getCssValue("color");
        Assert.assertEquals("rgb(33, 186, 69)",h5);
        System.out.println(h5);
    }

    @Test(groups = {"ButtonTests"})
    public void testcase4(){
        WebElement olive = driver.findElement(By.xpath("//button[text()=\"Olive\"]"));
        Assert.assertEquals("Olive",olive.getText());
    }

    @Test(groups = {"ButtonTests"})
    public void testcase5(){
        WebElement brown = driver.findElement(By.xpath("//button[text()=\"Brown\"]"));
        Assert.assertEquals("Brown",brown.getText());
        Assert.assertEquals(brown.getCssValue("color"),"rgb(255, 255, 255)");
    }


    @AfterClass(alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}



/////////////////////////////////////////////////////////////////////////////////////////////////


//public class Activity5 {
//    WebDriver driver;
//    //Include alwaysRun property on the @BeforeTest
//    //to make sure the page opens
//    @BeforeTest(alwaysRun = true)
//    public void beforeMethod() {
//        // Set up the Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        //Create a new instance of the Firefox driver
//        driver = new FirefoxDriver();
//
//        //Open the browser
//        driver.get("https://v1.training-support.net/selenium/target-practice");
//    }
//
//    @Test (groups = {"HeaderTests", "ButtonTests"})
//    public void pageTitleTest() {
//        String title = driver.getTitle();
//        System.out.println("Title is: " + title);
//        Assert.assertEquals(title, "Target Practice");
//    }
//
//    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
//    public void HeaderTest1() {
//        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
//        Assert.assertEquals(header3.getText(), "Third header");
//    }
//
//    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
//    public void HeaderTest2() {
//        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
//        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
//    }
//
//    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
//    public void ButtonTest1() {
//        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
//        Assert.assertEquals(button1.getText(), "Olive");
//    }
//
//    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
//    public void ButtonTest2() {
//        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
//        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
//    }
//
//    //Include alwaysRun property on the @AfterTest
//    //to make sure the page closes
//    @AfterTest(alwaysRun = true)
//    public void afterMethod() {
//        //Close the browser
//        driver.close();
//    }
//
//}