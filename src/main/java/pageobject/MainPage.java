package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ru.praktikum.selenium.AppConfig.APP_URL;

public class MainPage {
    WebDriver webDriver;


    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    private By orderButton = By.className("Button_Button__ra12g");
    private By anotherOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM'  ]");
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    private By lastNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By stationField = By.className("select-search__value");
    private By selectedMetroStation = By.xpath(".//li[@data-index='1']");
    private By telephoneNumberField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By coocieButton = By.className("App_CookieButton__3cvqF");


    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void clickAnotherOrderButton() {
        webDriver.findElement(anotherOrderButton).click();
    }

    public void clickNameField() {
        webDriver.findElement(nameField).click();
    }

    public void writeNameField(String name) {
        webDriver.findElement(nameField).sendKeys(name);
    }

    public void clickLastNameField() {
        webDriver.findElement(lastNameField).click();
    }

    public void writeLastNameField(String lastName) {
        webDriver.findElement(lastNameField).sendKeys(lastName);
    }

    public void clickAddressField() {
        webDriver.findElement(addressField).click();
    }

    public void writeAddressField(String address) {
        webDriver.findElement(addressField).sendKeys(address);
    }

    public void clickStationField() {
        webDriver.findElement(stationField).click();
    }

    public void clickSelectedMetroStation() {
        webDriver.findElement(selectedMetroStation).click();
    }

    public void clickTelephoneNumberField() {
        webDriver.findElement(telephoneNumberField).click();
    }

    public void writeTelephoneNumberField(String number) {
        webDriver.findElement(telephoneNumberField).sendKeys(number);
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    public void clickCoocieButton() {
        webDriver.findElement(coocieButton).click();
    }

    public void scrollPage(By locator) {
        WebElement element = webDriver.findElement(locator);
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }
}

