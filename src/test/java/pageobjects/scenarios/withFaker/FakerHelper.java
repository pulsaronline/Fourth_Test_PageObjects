package pageobjects.scenarios.withFaker;

import com.codeborne.selenide.ElementsCollection;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selenide.$$;

public class FakerHelper {

    public static Faker faker = new Faker();

    public static String randomHobbies() {
        ElementsCollection hobbies = $$("#hobbiesWrapper .custom-checkbox");
        int hobbieNumber = faker.number().numberBetween(0, hobbies.size() - 1);
        String hobbieName = hobbies.get(hobbieNumber).text();
        hobbies.get(hobbieNumber).click();
        return hobbieName;
    }
    public static String randomYear() {
        return String.valueOf(faker.number().numberBetween(1900, 2099));
    }
    public static String randomDay() {
        int day = 0;
        day = faker.number().numberBetween(1, 28);
        return String.valueOf(day);
        //return String.valueOf(faker.number().numberBetween(1, 31));
    }
    public static String randomMonth() {
        return String.valueOf(faker.number().numberBetween(1, 12));
    }
}
