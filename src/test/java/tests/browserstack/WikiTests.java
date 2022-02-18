package tests.browserstack;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import tests.steps.WikiSteps;

@DisplayName("Тестирование мобильного приложения Wikipedia с использованием BrowserStack")
@Tag("browserstack")
public class WikiTests extends TestBase {

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
}
