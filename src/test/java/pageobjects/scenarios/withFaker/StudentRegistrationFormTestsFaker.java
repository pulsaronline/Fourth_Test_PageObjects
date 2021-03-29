package pageobjects.scenarios.withFaker;

import org.junit.jupiter.api.Test;

public class StudentRegistrationFormTestsFaker {
StudentRegistrationFormPageFaker studentRegistrationFormPageFaker = new StudentRegistrationFormPageFaker();

@Test
    void succesfulFillTest() {

    studentRegistrationFormPageFaker.openPage();
    studentRegistrationFormPageFaker.fillForm();
    studentRegistrationFormPageFaker.checkData();
}
}
