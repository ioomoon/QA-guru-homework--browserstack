package tests.emulation;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.steps.WikiSteps;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

@DisplayName("Тестирование мобильного приложения Wikipedia на эмуляторе")
@Tag("emulation")
public class WikiTests extends TestBase {

    private WikiSteps steps = new WikiSteps();

    @Test
    @DisplayName("Проверка текста начальных страниц")
    @Feature("AboutWikiPage")
    @Owner("m.lavrushina")
    void aboutWikiPageTest() {
        steps.checkPrimaryText("The Free Encyclopedia …in over 300 languages");
        steps.clickForwardButton();
        steps.checkPrimaryText("New ways to explore");
        steps.clickForwardButton();
        steps.checkPrimaryText("Reading lists with sync");
        steps.clickForwardButton();
        steps.checkPrimaryText("Send anonymous data");
    }

    @DisplayName("Тест на поиск 'BrowserStack'")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    @Test
    void searchTest() throws MalformedURLException, InterruptedException {
        back();
        steps.searchWikiClick();
        steps.sendKeys("BrowserStack");
        steps.assertResultsExist();
    }

    @DisplayName("Тест на проверку языка поиска")
    @Feature("WikiSearch")
    @Owner("m.lavrushina")
    @Test
    void checkLanguage() throws MalformedURLException, InterruptedException {
        back();
        steps.searchWikiClick();
        steps.sendKeys("BrowserStack");
        steps.assertLanguageIsEN();
    }
}
