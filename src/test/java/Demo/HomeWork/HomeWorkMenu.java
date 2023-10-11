package Demo.HomeWork;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomeWorkMenu extends BaseTest {
@Test
    void mainItem(){
    driver.get("https://demoqa.com/menu#");
    WebElement item1= driver.findElement(By.linkText("Main Item 1"));
    Actions actions= new Actions(driver);
    actions.moveToElement(item1).perform();

    WebElement item2= driver.findElement(By.linkText("Main Item 2"));
    actions.moveToElement(item2).perform();

    WebElement sumList=driver.findElement(By.linkText("SUB SUB LIST »"));
    actions.moveToElement(sumList).perform();

    WebElement subItem=driver.findElement(By.linkText("Sub Sub Item 2"));
    actions.moveToElement(subItem).perform();

    WebElement item3= driver.findElement(By.linkText("Main Item 3"));
    actions.moveToElement(item3).perform();

}
}
