import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{
    @Test
    public void testButtonsPage(){
        driver.get("https://demoqa.com/buttons");
        buttonsPage.clickDoubleBtn()
                .clickRightBtn()
                .clickMe();
    }
}
