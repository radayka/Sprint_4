package ru.praktikum.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import pageobject.QuestionsPage;

import static org.junit.Assert.assertEquals;


public class QuestionsTest extends BaseTest {

    QuestionsPage QuestionsPage;

    @Test
    public void checkAllQuestionsField() {
        scroll();
        checkFirstQuestionFieldWithoutScroll();
        checkSecondQuestionFieldWithoutScroll();
        checkThirdQuestionFieldWithoutScroll();
        checkFourthQuestionFieldWithoutScroll();
        checkFifthQuestionFieldWithoutScroll();
        checkSixthQuestionFieldWithoutScroll();
        checkSeventhQuestionFieldWithoutScroll();
        checkEighthQuestionFieldWithoutScroll();
    }

    public void scroll() {
        QuestionsPage = new QuestionsPage(webDriver);
        QuestionsPage.clickCookieButton();
        QuestionsPage.scrollPage(By.id("accordion__heading-3"));
    }

    @Test
    public void checkFirstQuestionField() {
        scroll();
        QuestionsPage.clickFirstQuestionField();
        String actualText = QuestionsPage.getTextFirstQuestionField();
        assertEquals(expectedTextFirstQuestionField, actualText);
    }

    @Test
    public void checkSecondQuestionField() {
        scroll();
        QuestionsPage.clickSecondQuestionField();
        String actualText = QuestionsPage.getTextSecondQuestionField();
        assertEquals(expectedTextSecondQuestionField, actualText);
    }

    @Test
    public void checkThirdQuestionField() {
        scroll();
        QuestionsPage.clickThirdQuestionField();
        String actualText = QuestionsPage.getTextThirdQuestionField();
        assertEquals(expectedTextThirdQuestionField, actualText);
    }

    @Test
    public void checkFourthQuestionField() {
        scroll();
        QuestionsPage.clickFourthQuestionField();
        String actualText = QuestionsPage.getTextFourthQuestionField();
        assertEquals(expectedTextFourthQuestionField, actualText);
    }

    @Test
    public void checkFifthQuestionField() {
        scroll();
        QuestionsPage.clickFifthQuestionField();
        String actualText = QuestionsPage.getTextFifthQuestionField();
        assertEquals(expectedTextFifthQuestionField, actualText);
    }

    @Test
    public void checkSixthQuestionField() {
        scroll();
        QuestionsPage.clickSixthQuestionField();
        String actualText = QuestionsPage.getTextSixthQuestionField();
        assertEquals(expectedTextSixthQuestionField, actualText);
    }

    @Test
    public void checkSeventhQuestionField() {
        scroll();
        QuestionsPage.clickSeventhQuestionField();
        String actualText = QuestionsPage.getTextSeventhQuestionField();
        assertEquals(expectedTextSeventhQuestionField, actualText);
    }

    @Test
    public void checkEighthQuestionField() {
        scroll();
        QuestionsPage.clickEighthQuestionField();
        String actualText = QuestionsPage.getTextEighthQuestionField();
        assertEquals(expectedTextEighthQuestionField, actualText);
    }


    @Test
    public void checkFirstQuestionFieldWithoutScroll() {
        QuestionsPage.clickFirstQuestionField();
        String actualText = QuestionsPage.getTextFirstQuestionField();
        assertEquals(expectedTextFirstQuestionField, actualText);
    }

    @Test
    public void checkSecondQuestionFieldWithoutScroll() {
        QuestionsPage.clickSecondQuestionField();
        String actualText = QuestionsPage.getTextSecondQuestionField();
        assertEquals(expectedTextSecondQuestionField, actualText);
    }

    @Test
    public void checkThirdQuestionFieldWithoutScroll() {
        QuestionsPage.clickThirdQuestionField();
        String actualText = QuestionsPage.getTextThirdQuestionField();
        assertEquals(expectedTextThirdQuestionField, actualText);
    }

    @Test
    public void checkFourthQuestionFieldWithoutScroll() {
        QuestionsPage.clickFourthQuestionField();
        String actualText = QuestionsPage.getTextFourthQuestionField();
        assertEquals(expectedTextFourthQuestionField, actualText);
    }

    @Test
    public void checkFifthQuestionFieldWithoutScroll() {
        QuestionsPage.clickFifthQuestionField();
        String actualText = QuestionsPage.getTextFifthQuestionField();
        assertEquals(expectedTextFifthQuestionField, actualText);
    }

    @Test
    public void checkSixthQuestionFieldWithoutScroll() {
        QuestionsPage.clickSixthQuestionField();
        String actualText = QuestionsPage.getTextSixthQuestionField();
        assertEquals(expectedTextSixthQuestionField, actualText);
    }

    @Test
    public void checkSeventhQuestionFieldWithoutScroll() {
        QuestionsPage.clickSeventhQuestionField();
        String actualText = QuestionsPage.getTextSeventhQuestionField();
        assertEquals(expectedTextSeventhQuestionField, actualText);
    }

    @Test
    public void checkEighthQuestionFieldWithoutScroll() {
        QuestionsPage.clickEighthQuestionField();
        String actualText = QuestionsPage.getTextEighthQuestionField();
        assertEquals(expectedTextEighthQuestionField, actualText);
    }
}




