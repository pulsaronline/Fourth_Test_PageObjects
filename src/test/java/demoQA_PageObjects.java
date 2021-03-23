import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class demoQA_PageObjects {

    @BeforeAll
    public static void setup() {
        // Окно браузера на весь экран
        Configuration.startMaximized = true;
    }

    @Test
    void demoQA_PageObjectsClass () {
    openPage("https://www.google.com");
    $(byName("q")).setValue("selenide").pressEnter();
    $("#search").shouldHave(text("selenide.org"));
    }

    void searchText (String text) {
        $(byName("q")).setValue(text).pressEnter();
    }

    void openPage (String text) {
        open(text);
    }

    void checkSearchResaults () {
        $("#search").shouldHave(text("selenide.org"));
    }
}