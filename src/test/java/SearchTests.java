import org.junit.jupiter.api.Test;

public class SearchTests {

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    @Test
    void selenideSearchTest() {
        mainPage.openPage();

        mainPage.searchText("selenide");

        resultsPage.checkSearchResults("selenide.org");
    }

    @Test
    void gradleSearchTest() {
        mainPage.openPage();

        mainPage.searchText("gradle");

        resultsPage.checkSearchResults("gradle.org");
    }

    @Test
    void junitSearchTest() {
        mainPage.openPage();

        mainPage.searchText("junit");

        resultsPage.checkSearchResults("junit.org");
    }

    @Test
    void negativeSearchTest() {
        mainPage.openPage();

        mainPage.searchText("sadnhl;hbhu;sdtnvnlacwexduf'awn;btyvaleryawlcnryxawerav");

        resultsPage.checkNoSearchResults();
    }
}