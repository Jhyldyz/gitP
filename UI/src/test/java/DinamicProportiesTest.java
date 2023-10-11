import org.testng.annotations.Test;

public class DinamicProportiesTest extends BaseTest{
    @Test
    public void testDinamic() {
        driver.get("https://demoqa.com/dynamic-properties");
        dinamicProportiesPage.clicklink()
                .visibleA()
                .changeColorRed();
    }
}
