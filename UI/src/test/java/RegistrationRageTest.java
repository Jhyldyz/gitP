import com.digital.models.Student;
import org.testng.annotations.Test;

import java.awt.*;

public class RegistrationRageTest extends BaseTest{
    @Test
    void fillUpTheRegistrationFornm() throws InterruptedException, AWTException {
        driver.get("https://demoqa.com/login");
        Student student= new Student();
        registrationPage.registerNewUser();
        Thread.sleep(5000);
        registrationPage.fillUpTheFormRegistrationPages(student);
        Thread.sleep(20000);
    }
}
