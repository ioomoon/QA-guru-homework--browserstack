package tests.browserstack.steps;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class WikiSteps {
    @Step("Нажать на поле поиска")
    public void searchWikiClick() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
    }

    @Step("Ввести значение 'BrowserStack'")
    public void sendKeys(String key) {
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys(key);
    }

    @Step("Проверить отображение результатов поиска")
    public void assertResultsExist() {
        $$(byClassName("android.widget.LinearLayout")).shouldHave(sizeGreaterThan(0));
    }

    @Step("Проверить, что язык поиска - Английский")
    public void assertLanguageIsEN() {
        $$(byClassName("android.widget.TextView")).first().shouldHave(text("EN"));
    }

    @Step("Нажать на результат поиска")
    public void clickResult(String result){
        $$(byClassName("android.widget.TextView")).find(text(result)).click();
    }

    @Step("Проверить отображение подзаголовка на открывшейся странице")
    public void checkSubtitleTextContains(String text){
        $(MobileBy.id("org.wikipedia.alpha:id/view_page_subtitle_text")).shouldHave(text(text));
    }

}
