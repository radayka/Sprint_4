package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ru.praktikum.selenium.AppConfig.APP_URL;

public class QuestionsPage {
    WebDriver webDriver;

    public QuestionsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    public void scrollPage(By locator) {
        WebElement element = webDriver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }

    private By coocieButton = By.className("App_CookieButton__3cvqF");
    private By firtsQuestionField = By.id("accordion__heading-0");
    private By secondQuestionField = By.id("accordion__heading-1");
    private By thirdQuestionField = By.id("accordion__heading-2");
    private By fourthQuestionField = By.id("accordion__heading-3");
    private By fifthQuestionField = By.id("accordion__heading-4");
    private By sixthQuestionField = By.id("accordion__heading-5");
    private By seventhQuestionField = By.id("accordion__heading-6");
    private By eighthQuestionField = By.id("accordion__heading-7");


    public void clickCookieButton() {
        webDriver.findElement(coocieButton).click();
    }

    public void clickFirstQuestionField() {
        webDriver.findElement(firtsQuestionField).click();
    }

    public void clickSecondQuestionField() {
        webDriver.findElement(secondQuestionField).click();
    }

    public void clickThirdQuestionField() {
        webDriver.findElement(thirdQuestionField).click();
    }

    public void clickFourthQuestionField() {
        webDriver.findElement(fourthQuestionField).click();
    }

    public void clickFifthQuestionField() {
        webDriver.findElement(fifthQuestionField).click();
    }

    public void clickSixthQuestionField() {
        webDriver.findElement(sixthQuestionField).click();
    }

    public void clickSeventhQuestionField() {
        webDriver.findElement(seventhQuestionField).click();
    }

    public void clickEighthQuestionField() {
        webDriver.findElement(eighthQuestionField).click();
    }

    public String getTextFirstQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p")).getText();
    }

    public String getTextSecondQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p")).getText();
    }

    public String getTextThirdQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p")).getText();
    }

    public String getTextFourthQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p")).getText();
    }

    public String getTextFifthQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p")).getText();
    }

    public String getTextSixthQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p")).getText();
    }

    public String getTextSeventhQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p")).getText();
    }

    public String getTextEighthQuestionField() {
        return webDriver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p")).getText();
    }


}
