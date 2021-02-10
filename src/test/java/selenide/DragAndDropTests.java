package selenide;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {

    @Test
    void moveAToBPlaceTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        SelenideElement squareA = $("#column-a");
        SelenideElement squareB = $("#column-b");

//        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(100,0).release().perform();
        squareA.dragAndDropTo(squareB);

        squareA.shouldHave(text("B"));
        squareB.shouldHave(text("A"));
    }
}
