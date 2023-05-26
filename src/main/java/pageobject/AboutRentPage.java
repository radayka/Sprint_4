package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class AboutRentPage {
    WebDriver webDriver;

    public AboutRentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By whenToBringScooterField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By tabWhenToBringScooterField = By.xpath(".//div[@tabindex='-1']");
    private By rentalPerionField = By.className("Dropdown-placeholder");
    private By tabRentalPeriodField = By.className("Dropdown-option");
    private By colorScooterField = By.xpath(".//label[@for='black']");
    private By commentToСourierField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By orderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By confirmationButton = By.xpath(".//button[text()='Да']");
    private By successfullOrder = By.className("Order_ModalHeader__3FDaJ");

    public void clickWhenToBringScooterField() {
        webDriver.findElement(whenToBringScooterField).click();
    }

    public void clickTabWhenToBringScooterField() {
        webDriver.findElement(tabWhenToBringScooterField).click();
    }

    public void clickRentalPerionField() {
        webDriver.findElement(rentalPerionField).click();
    }

    public void clickTabRentalPeriodField() {
        webDriver.findElement(tabRentalPeriodField).click();
    }

    public void clickColorScooterField() {
        webDriver.findElement(colorScooterField).click();
    }

    public void clickCommentToCourierField() {
        webDriver.findElement(commentToСourierField).click();
    }

    public void writeCommentToCourierField(String comment) {
        webDriver.findElement(commentToСourierField).sendKeys(comment);
    }

    public void clickOrderButton() {
        webDriver.findElement(orderButton).click();
    }

    public void clickConfirmationButton() {
        webDriver.findElement(confirmationButton).click();
    }


    public void checkSuccessfulOrder() {
        boolean isDisplayed = webDriver.findElement(successfullOrder).isDisplayed();
        assertTrue(isDisplayed);
    }

}
