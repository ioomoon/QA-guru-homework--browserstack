package tests.real.steps;

import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

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
        $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
    }

    @Step("Проверить, что язык поиска - Английский")
    public void assertLanguageIsEN() {
        $$(byClassName("android.widget.TextView")).first().shouldHave(text("EN"));
    }

    @Step("Нажать 'Продолжить' или 'Начать' на последней странице о Википедии")
    public void clickForwardButton() {
        $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
    }

    @Step("Проверить, что заголовок страницы содержит необходимый текст")
    public void checkPrimaryText(String text) {
        $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                .shouldHave(text(text));
    }

}
