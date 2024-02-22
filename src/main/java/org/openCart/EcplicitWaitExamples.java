package org.openCart;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EcplicitWaitExamples {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        // Creating the instance for Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        /*WebElement alertButton = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("alert1")));
        alertButton.click();
        Alert alert = driver.switchTo().alert();  // NoAlertPresentException: alert won't pop up if the above step doesn't execute and give this exception
        System.out.println(alert.getText());
        alert.accept();
//        alert.dismiss();
     //   alert.sendKeys("dfs" + Keys.ENTER); //ElementNotInteractableException --> Because User dialog does not have a text box input field.*/

     /*   driver.findElement(By.className("dropbtn")).click();

        WebElement facebookLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
        facebookLink.click();*/
      //  driver.findElement(By.linkText("Facebook")).click();  // NoSuchElementException

       WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
       button3.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();



    }
}