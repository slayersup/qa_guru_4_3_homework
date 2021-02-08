package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionPageTests {

    @Test
    void findJUnitTest() {
        open("https://github.com/selenide/selenide");

        $("[data-content='Wiki']").click();
        sleep(3000);
    }
}
