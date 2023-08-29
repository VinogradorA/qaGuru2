package guru.qa.page;

import com.codeborne.selenide.SelenideElement;
import guru.qa.page.components.CalendarComponent;
import guru.qa.page.components.CheckComponent;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegPage {
    CalendarComponent calendar = new CalendarComponent();
    CheckComponent checkForm = new CheckComponent();

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userNumberInput = $("#userNumber"),
            genterWrapperInput = $("#genterWrapper"),
            dateOfBirthInput= $("#dateOfBirthInput"),
            subjectsInput= $("#subjectsInput"),
            hobbiesWrapperInput= $("#hobbiesWrapper"),
            uploadPictureInput= $("#uploadPicture"),
            currentAddressInput= $("#currentAddress"),
            stateInput= $("#state"),
            cityInput= $("#city"),
            submitClik= $("#submit"),
            stateCityWrapperInput= $("#stateCity-wrapper"),
            modalContentVisible= $(".modal-content"),
            closeLargeModal= $("#closeLargeModal"),
            userEmailInput = $("#userEmail");

    public RegPage setFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }
    public RegPage checkFormResult(String studentName,
                                   String studentEmail,
                                   String gender,
                                   String mobile,
                                   String dateofBirth,
                                   String subjects,
                                   String picture,
                                   String address,
                                   String stateandCity){
        modalContentVisible.should(visible);
        checkForm.CheckForm(studentName,studentEmail,gender,mobile,dateofBirth,subjects,picture,address,stateandCity);
        closeLargeModal.click();
        return this;
    }
    public RegPage setCurrentAddress(String value){
        currentAddressInput.setValue(value);
        return this;
    }
    public RegPage setUploadPicture(String value){
        uploadPictureInput.uploadFromClasspath(value);
        return this;
    }
    public RegPage setGenterWrapper(String value){
        genterWrapperInput.$(byText(value)).click();
        return this;
    }
    public RegPage setstateCityWrapper(String value){
        stateCityWrapperInput.$(byText(value)).click();
        return this;
    }
    public RegPage clikSubmit(){
        submitClik.click();
        return this;
    }
    public RegPage setState(){
        stateInput.click();
        return this;
    }
    public RegPage setCity(){
        cityInput.click();
        return this;
    }
    public RegPage setHobbiesWrapper(String value){
        hobbiesWrapperInput.$(byText(value)).click();
        return this;
    }
    public RegPage setSubjectsInput(String value){
        subjectsInput.setValue(value).pressEnter();
        return this;
    }
    public RegPage setBirthDate(String day, String month, String year){
        dateOfBirthInput.click();
        calendar.SetDate(day, month, year);
        return this;
    }
    public RegPage setUserNumber(String value){
        userNumberInput.setValue(value);
        return this;
    }
    public RegPage setLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }
    public RegPage openPage(){
        open("/automation-practice-form");
        return this;
    }
    public RegPage setUserEmail(String value){
        userEmailInput.setValue(value);
        return this;
    }
}
