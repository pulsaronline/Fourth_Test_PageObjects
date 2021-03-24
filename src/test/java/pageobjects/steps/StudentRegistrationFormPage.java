package pageobjects.steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class StudentRegistrationFormPage {

    private static SelenideElement pageHdr = $("#example-modal-sizes-title-lg");

    public static void checkPageHeader(String headerText){
    pageHdr.shouldHave(text(headerText));
    }
    //check the header, should be "Thanks for submitting the form"

    //$("#example-modal-sizes-title-lg").shouldHave(text(pageHeader));

}
