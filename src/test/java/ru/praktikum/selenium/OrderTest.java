package ru.praktikum.selenium;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import pageobject.MainPage;

import static org.junit.Assert.assertEquals;


public class OrderTest {


    @RunWith(Parameterized.class)
    public static class CheckTest extends BaseTest {

        public void scroll() {
            MainPage MainPage = new MainPage(webDriver);
            MainPage.scrollPage(By.className("Home_Status__YkfmH"));
        }

        private final String name;
        private final String lastName;
        private final String address;
        private final String number;
        private final String comment;


        public CheckTest(String name, String lastName, String address, String number, String comment) {
            this.name = name;
            this.lastName = lastName;
            this.address = address;
            this.number = number;
            this.comment = comment;
        }

        @Parameterized.Parameters
        public static Object[][] getData() {
            return new Object[][]{{"Иван", "Иванов", "улица Пупкина", "79113049952", "Домофон работает"}, {"Макс", "Петров", "улица Колотушкина", "79113099452", "Домофон не работает"},};
        }

        @Test
        public void orderTest() {

            webDriver.findElement(By.className("Button_Button__ra12g")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Имя']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Имя']")).sendKeys(name);
            webDriver.findElement(By.xpath(".//input[@placeholder='* Фамилия']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Фамилия']")).sendKeys(lastName);
            webDriver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).sendKeys(address);
            webDriver.findElement(By.className("select-search__value")).click();
            webDriver.findElement(By.xpath(".//li[@data-index='1']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys(number);
            webDriver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();


            webDriver.findElement(By.xpath(".//input[@placeholder='* Когда привезти самокат']")).click();
            webDriver.findElement(By.xpath(".//div[@tabindex='-1']")).click();
            webDriver.findElement(By.className("Dropdown-placeholder")).click();
            webDriver.findElement(By.className("Dropdown-option")).click();
            webDriver.findElement(By.xpath(".//label[@for='black']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']")).sendKeys(comment);
            webDriver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
            webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();;
            assertEquals("Заказ оформлен",webDriver.findElement(By.className("Order_Text__2broi")).getText());

        }

        @Test
        public void orderTestWithAnotherEnterButton() {
            scroll();
            webDriver.findElement(By.xpath("/html/body/div/div/div/div[4]/div[2]/div[5]/button")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Имя']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Имя']")).sendKeys(name);
            webDriver.findElement(By.xpath(".//input[@placeholder='* Фамилия']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Фамилия']")).sendKeys(lastName);
            webDriver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']")).sendKeys(address);
            webDriver.findElement(By.className("select-search__value")).click();
            webDriver.findElement(By.xpath(".//li[@data-index='1']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']")).sendKeys(number);
            webDriver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();


            webDriver.findElement(By.xpath(".//input[@placeholder='* Когда привезти самокат']")).click();
            webDriver.findElement(By.xpath(".//div[@tabindex='-1']")).click();
            webDriver.findElement(By.className("Dropdown-placeholder")).click();
            webDriver.findElement(By.className("Dropdown-option")).click();
            webDriver.findElement(By.xpath(".//label[@for='black']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']")).click();
            webDriver.findElement(By.xpath(".//input[@placeholder='Комментарий для курьера']")).sendKeys(comment);
            webDriver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
            webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]")).click();
            assertEquals("Заказ оформлен",webDriver.findElement(By.className("Order_Text__2broi")).getText());
        }
    }
}



