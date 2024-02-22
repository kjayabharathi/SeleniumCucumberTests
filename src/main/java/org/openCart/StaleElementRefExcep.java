package org.openCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaleElementRefExcep {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
/*        driver.get("https://tutorialsninja.com/demo");

        WebElement myAccount = driver.findElement(By.linkText("My Account"));
        myAccount.click();
        //Thread.sleep(5000);
        WebElement loginLink = driver.findElement(By.xpath("//*[contains(@href, 'route=account/login')]"));
        loginLink.click();

        driver.findElement(By.id("input-email")).sendKeys("sgsdvgsdgds");
        driver.navigate().back();
        myAccount.click();*/

        driver.get("https://omayo.blogspot.com/");
        WebElement textAreaFiled = driver.findElement(By.id("ta1"));
        textAreaFiled.sendKeys("frarw");
        driver.findElement(By.linkText("compendiumdev")).click();
        driver.navigate().back();
        textAreaFiled.clear();



    }

}
