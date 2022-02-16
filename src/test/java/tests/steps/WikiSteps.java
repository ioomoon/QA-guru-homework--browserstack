package tests.steps;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class WikiSteps {
    @Step("Нажать на поле поиска")
    public void searchWikiClick() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
    }

    @Step("Ввести значение 'BrowserStack'")
    public void sendKeysBrowserStack() {
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
    }

    @Step("Проверить отображение результатов поиска")
    public void assertResultsExist() {
        $$(byClassName("android.widget.LinearLayout")).shouldHave(sizeGreaterThan(0));
    }

    @Step("Проверить, что язык поиска - Английский")
    public void assertLanguageIsEN() {
        $$(byClassName("android.widget.TextView")).first().shouldHave(Condition.text("EN"));
    }

}
