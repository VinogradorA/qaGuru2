package guru.qa.utils;

import static guru.qa.utils.RandomMethod.*;

public class PropertiesForRandomMethod {

    public static String
            firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            userEmail = getRandomEmail(),
            randomGender = getRandomGender(),
            randomPhone = getRandomPhone(),
            randomDay = getRandomDay(),
            randomMonth = getRandomMonth(),
            randomYear = getRandomYear(),
            randomSubjects = getRandomSubjects(),
            randomAddress = getRandomAddress(),
            randomState = getRandomState(),
            randomCity = getRandomCity(randomState),
            fileForTest = "fileForTest2",
            randomHobies = getRandomHobies();
}
