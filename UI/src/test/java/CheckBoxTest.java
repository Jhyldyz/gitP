import com.digital.pages.CheckBoxPage;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxTest extends BaseTest {
    @Test
    void fillUpTheCheckBox() {
        driver.get("https://demoqa.com/checkbox");
        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.clickCheckHome()
                .chooseElement()
                .testAssert();

    }
}
