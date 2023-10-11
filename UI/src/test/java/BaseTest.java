import com.digital.driver.Driver;
import com.digital.pages.*;
import com.digital.utils.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormPages practiceFormPages;
    public FakeDataProvider fakeDataProvider;

    public RegistrationPage registrationPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;
    public DinamicProportiesPage dinamicProportiesPage;
    public AlertsPage alertsPage;
    public FramesPage framesPage;
    public WebTablesPage webTablesPage;



    @BeforeClass(alwaysRun = true)
    public void setUpBrowser(){
        driver= Driver.getDriver();
        textBoxPage= new TextBoxPage();
        practiceFormPages= new PracticeFormPages();
        fakeDataProvider= new FakeDataProvider();
        registrationPage= new RegistrationPage();
        radioButtonPage= new RadioButtonPage();
        buttonsPage= new ButtonsPage();
        dinamicProportiesPage= new DinamicProportiesPage();
        alertsPage= new AlertsPage();
        framesPage= new FramesPage();
        webTablesPage= new WebTablesPage();


    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        Driver.closeDriver();
    }

}
