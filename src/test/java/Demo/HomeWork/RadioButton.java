package Demo.HomeWork;

import Demo.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest {
   @Test
    void chekRadioButton() throws InterruptedException {
       driver.get("https://demoqa.com/radio-button");
       WebElement checkYes= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
       checkYes.click();
       String text= "Yes";
       Thread.sleep(7000);
       WebElement containsText= driver.findElement(By.xpath("//span[@class='text-success']"));
      Assert.assertTrue(containsText.getText().contains(text));


      WebElement checkImpressive=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
       checkImpressive.click();
       String text2= "Impressive";
       Thread.sleep(7000);
       WebElement containsText2= driver.findElement(By.xpath("//span[@class='text-success']"));
       Assert.assertTrue(containsText.getText().contains(text2));

       Thread.sleep(7000);

   }
}
