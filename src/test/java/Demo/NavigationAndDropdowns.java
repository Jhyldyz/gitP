package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NavigationAndDropdowns extends BaseTest{
  //  @Test
//    void demo1() throws InterruptedException {
//        driver.navigate().to("https://nambafood.kg/");
//        driver.findElement(By.xpath("//a[@gref='/food])[1]")).click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//    }

    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
//        select.selectByVisibleText("Green");
//
//        Thread.sleep(3000);
//        select.selectByValue("3");
//
//        select.selectByIndex(7);
//       // select.deselectByIndex(7);

        WebElement selectReact = driver.findElement(By.id("withOptGroup"));
        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        inputClick.click();
        WebElement inputText = driver.findElement(By.id("react-select-2-input"));

        List<WebElement> menuItem = selectReact.findElements(By.xpath("./div[2]//div[contains(text(), 'Group') or contains(text(), 'root option')]"));
        List<String> menuItemValue = new ArrayList<>();

        for (WebElement item : menuItem) {
            String text = item.getText();
            if (!text.equals("GROUP 1") && !text.equals("GROUP 2")) {
                menuItemValue.add(text);
            }
        }

        Random random = new Random();
        int numberOfItemsToSelect = random.nextInt(menuItemValue.size());

        inputText.sendKeys(menuItemValue.get(numberOfItemsToSelect));
        inputText.sendKeys(Keys.ENTER);

    }



    @Test
    public void selectRandomColor(Select select, List<WebElement> selectedOption) throws InterruptedException {

        Random randomColor= new Random();
        int indexColor= randomColor.nextInt(selectedOption.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);

        Thread.sleep(7000);
    }
}
