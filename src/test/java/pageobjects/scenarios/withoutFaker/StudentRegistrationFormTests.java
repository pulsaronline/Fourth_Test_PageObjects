package pageobjects.scenarios.withoutFaker;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTests {
StudentRegistrationFormPage studentRegistrationFormPage = new StudentRegistrationFormPage();


@Test
    void succesfulFillTest() {

    studentRegistrationFormPage.openPage();
    studentRegistrationFormPage.fillForm();
    studentRegistrationFormPage.checkData();
}
}
