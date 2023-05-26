package ru.praktikum.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import pageobject.AboutRentPage;
import pageobject.MainPage;

public class OrederTest extends BaseTest {
    MainPage mainPage;
    AboutRentPage aboutRentPage;
    public void check() {

        mainPage = new MainPage(webDriver);

        mainPage.clickOrderButton();
        mainPage.clickNameField();
        mainPage.writeNameField(name);
        mainPage.clickLastNameField();
        mainPage.writeLastNameField(lastName);
        mainPage.clickAddressField();
        mainPage.writeAddressField(address);
        mainPage.clickStationField();
        mainPage.clickSelectedMetroStation();
        mainPage.clickTelephoneNumberField();
        mainPage.writeTelephoneNumberField(number);
        mainPage.clickNextButton();


        aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.clickWhenToBringScooterField();
        aboutRentPage.clickTabWhenToBringScooterField();
        aboutRentPage.clickRentalPerionField();
        aboutRentPage.clickTabRentalPeriodField();
        aboutRentPage.clickColorScooterField();
        aboutRentPage.clickCommentToCourierField();
        aboutRentPage.writeCommentToCourierField(comment);
        aboutRentPage.clickOrderButton();
        aboutRentPage.clickConfirmationButton();
        aboutRentPage.checkSuccessfulOrder();

    }

    @Test
    public void check1() {
        mainPage = new MainPage(webDriver);
        mainPage.clickOrderButton();
        check();
    }

    @Test
    public void check2() {
        mainPage = new MainPage(webDriver);
        mainPage.clickCoocieButton();
        mainPage.scrollPage(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM'  ]"));
        mainPage.clickAnotherOrderButton();
        check();
    }
}
