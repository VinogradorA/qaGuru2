package guru.qa.tests;

import com.codeborne.selenide.SelenideElement;
import guru.qa.page.RegPage;
import guru.qa.page.components.CalendarComponent;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LessonRegTests extends TestBaze{

    RegPage regPage = new RegPage();

    @Test
    void testForm() {

        regPage
                .openPage()
                .setFirstName("testName")
                .setLastName("testLastName")
                .setUserEmail("testuserEmail@ya.ru")
                .setUserNumber("4444444444")
                .setGenterWrapper("Male")
                .setBirthDate("06","July","1971")
                .setSubjectsInput("commerce")
                .setHobbiesWrapper("Sports")
                .setUploadPicture("fileForTest2")
                .setCurrentAddress("testAddress")
                .setState()
                .setstateCityWrapper("Haryana")
                .setCity()
                .setstateCityWrapper("Karnal")
                .clikSubmit()
                .checkFormResult
                        ("testName testLastName",
                        "testuserEmail@ya.ru",
                        "Male",
                        "4444444444",
                        "06 July,1971",
                        "Commerce",
                        "fileForTest2",
                        "testAddress",
                        "Haryana Karnal");

    }
}
