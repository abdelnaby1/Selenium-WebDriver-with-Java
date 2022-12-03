package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import pagesForCh4Practice.HomePage;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass //before any of the test classes
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
//        driver.get("https://formy-project.herokuapp.com/");
        homePage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterClass
    public void tearDown(){
        driver.quit();

    }

}

//    public  void setUp(){
//        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//
//        set size commands
//        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
//        driver.manage().window().setSize(new Dimension(375,812));
//
//        List<WebElement> links =  driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//        WebElement inputsLink = driver.findElement(By.cssSelector("a[href='/inputs']"));
//        inputsLink.click();
//
//
//        System.out.println(driver.getTitle());
//
//
//        driver.findElement(By.cssSelector("a[href='/shifting_content']")).click();
//
//        driver.findElement(By.cssSelector("a[href='/shifting_content/menu']")).click();
//
//        List<WebElement> items = driver.findElements(By.xpath("//*[@id='content']/div/ul/li"));
//        System.out.println(items.size());
//
//        driver.quit();
//    }

