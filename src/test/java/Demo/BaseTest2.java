package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class BaseTest2 {
    public WebDriver driver;// создали обьект
    @BeforeClass
    public void setUpBrowser()
    {

        WebDriverManager.chromedriver().setup();// сетап хром драйвер
        driver=new ChromeDriver();

        driver.manage().window().maximize(); //окно сделали с помощью максимайз максимально большим

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// setup the time повремени немного времени
        PageFactory.initElements(driver, this);
    }
    @AfterClass
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
