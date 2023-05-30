package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    WebDriver webDriver;


    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void scrollPage(By locator) {
        WebElement element = webDriver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void getText(){
        webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]/text()")).getText();
    }
}
