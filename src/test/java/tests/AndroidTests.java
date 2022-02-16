package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;


import tests.steps.WikiSteps;

public class AndroidTests extends TestBase {

    private WikiSteps steps = new WikiSteps();

    @DisplayName("Тест на поиск 'BrowserStack'")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    @Test
    void searchTest() throws MalformedURLException, InterruptedException {
        steps.searchWikiClick();
        steps.sendKeys("BrowserStack");
        steps.assertResultsExist();
    }

    @DisplayName("Тест на проверку языка поиска")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    @Test
    void checkLanguage() throws MalformedURLException, InterruptedException {
        steps.searchWikiClick();
        steps.sendKeys("BrowserStack");
        steps.assertLanguageIsEN();
    }

    @Test
    @DisplayName("Открытие страницы из результатов поиска")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    void openingPageFromSearchResultsTest() {
        steps.searchWikiClick();
        steps.sendKeys("Java");
        steps.clickResult("Java");
        steps.checkSubtitleTextContains("Island in Southeast Asia");
    }
}
