
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    void openPage() {
        open("https://www.google.com/");
        $(byText("Войти")).shouldBe(visible);
    }

    void searchText(String text) {
        $(byName("q")).setValue(text).pressEnter();
    }

}