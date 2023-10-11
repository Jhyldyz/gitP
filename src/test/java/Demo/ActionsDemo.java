package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo extends Demo.BaseTest {
    @Test
    void demo123(){
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickButton= driver.findElement(By.id("doubleClickBtn"));
        Actions actions= new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
        WebElement text= driver.findElement(By.xpath("//p[text()='You have done a double click']"));
        Assert.assertEquals(text.getText(),"You have done a double click");

        WebElement rightClickButton= driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickButton).perform();
        WebElement text2= driver.findElement(By.xpath("//p[text()='You have done a right click']"));
        Assert.assertEquals(text2.getText(), "You have done a right click");

        WebElement clickMe= driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMe).perform();
        WebElement text3= driver.findElement(By.xpath("//p[text()='You have done a dynamic click']"));
        Assert.assertEquals(text3.getText(), "You have done a dynamic click");
    }
}
