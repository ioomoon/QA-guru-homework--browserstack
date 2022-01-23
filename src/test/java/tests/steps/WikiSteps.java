package tests.steps;

import com.codeborne.selenide.Condition;
import groovy.lang.MetaClassImpl;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WikiSteps {
    @Step("Click Search Wikipedia")
    public void searchWikiClick() {
        $(MobileBy.AccessibilityId("Search Wikipedia")).click();
    }

    @Step("Send 'BrowserStack' for search")
    public void sendKeysBrowserStack(){
        $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");
    }

    @Step("Assert that results exist")
    public void assertResultsExist(){
//        $$(byClassName("android.widget.TextView")).shouldHave(sizeGreaterThan(0));
        $$(byClassName("android.widget.LinearLayout")).shouldHave(sizeGreaterThan(0));
    }

    @Step("Assert that language of search is English")
    public void assertLanguageIsEN(){
        $$(byClassName("android.widget.TextView")).first().shouldHave(Condition.text("EN"));
    }

}
