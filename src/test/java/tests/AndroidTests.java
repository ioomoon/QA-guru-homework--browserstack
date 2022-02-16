package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;


import tests.steps.WikiSteps;

public class AndroidTests extends TestBase {

    private WikiSteps steps = new WikiSteps();

    @DisplayName("Тест на поиск 'BrowserStack'")
    @Test
    void searchTest() throws MalformedURLException, InterruptedException {
        steps.searchWikiClick();
        steps.sendKeysBrowserStack();
        steps.assertResultsExist();
    }

    @DisplayName("Тест на проверку языка поиска")
    @Test
    void checkLanguage() throws MalformedURLException, InterruptedException {
        steps.searchWikiClick();
        steps.sendKeysBrowserStack();
        steps.assertLanguageIsEN();
    }
}
