package selenide;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionPageTests {

    @Test
    void findJUnitExampleTest() {
        open("https://github.com");

        $("[name='q']").setValue("selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("[data-content='Wiki']").click();

        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));

        $("a[href='/selenide/selenide/wiki/SoftAssertions']").click();

        $("#wiki-wrapper h1").shouldHave(text("SoftAssertions"));

        $$("#wiki-body ol").last().shouldHave(text("Using JUnit5 extend test class:"));
        $$("#wiki-body ol").last().sibling(0).shouldHave(text("@ExtendWith"));
    }
}
