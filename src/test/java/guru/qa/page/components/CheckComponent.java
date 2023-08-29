package guru.qa.page.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckComponent {
    public void CheckForm(String studentName,
                          String studentEmail,
                          String gender,
                          String mobile,
                          String dateofBirth,
                          String subjects,
                          String picture,
                          String address,
                          String stateandCity)
    {
        $(".modal-content").should(visible);
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(studentName));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(studentEmail));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(gender));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(mobile));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text(dateofBirth));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(subjects));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text(picture));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(address));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text(stateandCity));
        $("#closeLargeModal").click();
    }
}
