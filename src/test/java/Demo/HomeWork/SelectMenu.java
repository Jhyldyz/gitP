package Demo.HomeWork;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectMenu extends BaseTest {
    @Test
    void selectMenuDemoqa() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
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
        Thread.sleep(5000);


        WebElement selectOne= driver.findElement(By.id("selectOne"));
        WebElement selectInput= driver.findElement(By.xpath("(//div[@aria-hidden='true'])[2]"));
        selectInput.click();

        WebElement inputOne= driver.findElement(By.id("react-select-3-input"));
        List<WebElement> menuOne = selectOne.findElements(By.id("./div[2]//div[contains(text(), 'Mr') or contains(text(), 'Ms')]"));
        List<String> menuOneValue = new ArrayList<>();

        for (WebElement item2 : menuOne) {
            String text = item2.getText();
                menuOneValue.add(text);
            }

        Random random2 = new Random();
        int numberOfItemsToOne = random2.nextInt(menuOneValue.size());

        inputOne.sendKeys(menuOneValue.get(numberOfItemsToOne));
        inputOne.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
    @Test
    public void selectRandomColor(Select select, List<WebElement> selectedOption) throws InterruptedException {

        Random randomColor= new Random();
        int indexColor= randomColor.nextInt(selectedOption.size());
        select.selectByIndex(indexColor);
        System.out.println(indexColor);

        Thread.sleep(7000);
    }

    @Test
    public void multoselect(){
        WebElement select= driver.findElement(By.id(""));
    }
}

