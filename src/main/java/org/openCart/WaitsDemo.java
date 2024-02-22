package org.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitsDemo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Automation step by step" + Keys.ENTER);
      /*  driver.close();
        driver.quit();
*/
       // List<WebElement> pageLoadElements = driver.findElements(By.xpath("//a/h3"));
        List<WebElement> pageLoadElements  = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a/h3")));
        System.out.println(pageLoadElements.size());
        System.out.println(driver.getTitle());

    }
}
