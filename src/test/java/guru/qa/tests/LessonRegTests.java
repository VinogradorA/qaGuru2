package guru.qa.tests;

import guru.qa.page.RegPage;
import org.junit.jupiter.api.Test;

import static guru.qa.utils.PropertiesForRandomMethod.*;

public class LessonRegTests extends TestBaze{
    RegPage regPage = new RegPage();
    @Test
    void testForm() {

        regPage
                .openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(randomPhone)
                .setGenterWrapper(randomGender)
                .setBirthDate(randomDay,randomMonth,randomYear)
                .setSubjectsInput(randomSubjects)
                .setHobbiesWrapper(randomHobies)
                .setUploadPicture(fileForTest)
                .setCurrentAddress(randomAddress)
                .setState()
                .setstateCityWrapper(randomState)
                .setCity()
                .setstateCityWrapper(randomCity)
                .clikSubmit()
                .checkFormResult
                        (firstName+" " +lastName,
                                userEmail,
                                randomGender,
                                randomPhone,
                                randomDay+" "+randomMonth+","+randomYear,
                                randomSubjects,
                                fileForTest,
                                randomAddress,
                                randomState+ " " +randomCity);

    }
}
// test