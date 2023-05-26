package ru.praktikum.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    static WebDriver webDriver;
    String expectedTextFirstQuestionField = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    String expectedTextSecondQuestionField = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    String expectedTextThirdQuestionField = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    String expectedTextFourthQuestionField = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    String expectedTextFifthQuestionField = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    String expectedTextSixthQuestionField = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    String expectedTextSeventhQuestionField = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    String expectedTextEighthQuestionField = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
        webDriver.findElement(By.className("App_CookieButton__3cvqF")).click();
    }

    @After
    public void clean() {
        webDriver.quit();
    }

}
