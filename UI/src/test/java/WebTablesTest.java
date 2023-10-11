import com.digital.models.Student;
import com.digital.pages.WebTablesPage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTablesTest extends BaseTest {
    WebTablesTest webTablesTest;
    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        Student student = fakeDataProvider.createFakeStudentForWebtables();
        webTablesPage.addBtnClick();
        webTablesPage.fillAppTheForm(student);
        webTablesPage.testForm();
        Thread.sleep(7000);

    }

}

