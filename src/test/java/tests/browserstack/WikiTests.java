package tests.browserstack;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import tests.steps.WikiSteps;

@DisplayName("Тестирование мобильного приложения Wikipedia с использованием BrowserStack")
@Tag("browserstack")
public class WikiTests extends TestBase {

    private WikiSteps steps = new WikiSteps();

    @Test
    @DisplayName("Тест на поиск 'BrowserStack'")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    @Severity(SeverityLevel.BLOCKER)
    void searchTest() throws MalformedURLException, InterruptedException {
        steps.searchWikiClick();
        steps.sendKeys("BrowserStack");
        steps.assertResultsExist();
    }

    @Test
    @DisplayName("Тест на проверку языка поиска")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    void checkLanguage() throws MalformedURLException, InterruptedException {
        steps.searchWikiClick();
        steps.sendKeys("BrowserStack");
        steps.assertLanguageIsEN();
    }
}
