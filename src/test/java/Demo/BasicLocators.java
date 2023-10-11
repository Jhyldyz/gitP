package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasicLocators extends BaseTest {

    @Test
    void byIdTest()
    {
        WebElement userName= driver.findElement(By.id("userName"));
    }
@Test
    void byTag(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byTag=driver.findElement(By.tagName("h5"));
    System.out.println(byTag.getText());
}
@Test
    void byClassName(){
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement byClass= driver.findElement(By.className("main-header"));
    System.out.println(byClass.getText());
}
@Test
    void byLinkedText(){
        driver.get("https://demoqa.com/links");
        WebElement linkText= driver.findElement(By.linkText("Home"));
    System.out.println(linkText.getText());
}
@Test
    void partial (){
        driver.get("https://demoqa.com/links");
        WebElement byPartialLink= driver.findElement(By.partialLinkText("Bad"));
    System.out.println(byPartialLink.getText());
}
@Test
    void byName(){
        driver.get("https://demoqa.com/links");
        WebElement byName= driver.findElement(By.name("email"));
    System.out.println(byName.getText());
}
}
