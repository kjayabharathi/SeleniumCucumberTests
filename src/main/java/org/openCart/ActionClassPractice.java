package org.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionClassPractice {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
       // driver.get("https://omayo.blogspot.com/");

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        Actions actions = new Actions(driver);
       /* WebElement blogElement = driver.findElement(By.id("blogsmenu"));
        WebElement dropDownElement = driver.findElement(By.xpath("//a[contains(@href, 'selenium-by-arun.blogspot')]"));
        // perform() is a method to perform an action. without this we can't do any action to perform
        // For single action we just say .perform()
        actions.moveToElement(blogElement).perform();
        // For multiple actions we should say .build().perform()
        actions.moveToElement(dropDownElement).click().build().perform();*/

        WebElement emailField = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
        emailField.sendKeys("jaya1234@gmail.com");

              /*  driver.findElement(By.id("input-email"));   //.sendKeys("jaya1234@gmail.com")
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("input-email")));*/

        WebElement passwordField = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("input-password")));
        passwordField.sendKeys("Jaya1234");
//        driver.findElement(By.id("input-password")).sendKeys("Jaya1234");
        actions.sendKeys(Keys.ENTER).perform();

//        actions.dragAndDrop(driver.findElement(By.id("source element")), driver.findElement(By.id("target element"))).build().perform();

    }
}
