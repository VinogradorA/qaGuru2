package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LessonRegTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";

    }


    @Test
    void testForm() {
        open("/automation-practice-form");

        $("#firstName").setValue("testName");
        $("#lastgitName").setValue("testLastName");
        $("#userEmail").setValue("testuserEmail@ya.ru");
        $("#userNumber").setValue("4444444444");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("4444444444");

        //календарь
        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").click();
        $("select.react-datepicker__month-select").selectOption("July");
        $("select.react-datepicker__year-select").click();
        $("select.react-datepicker__year-select").selectOption("1971");
        $("div.react-datepicker__day.react-datepicker__day--006").click();

        $("#subjectsInput").setValue("commerce").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("fileForTest2");
        $("#currentAddress").setValue("testAddress");


        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Karnal")).click();

        $("#submit").click();

        //проверка
        $(".modal-content").should(visible);
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("testName testLastName"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("testuserEmail@ya.ru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("4444444444"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("06 July,1971"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Commerce"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("fileForTest2"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("testAddress"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Haryana Karnal"));
        $("#closeLargeModal").click();
    }
}
