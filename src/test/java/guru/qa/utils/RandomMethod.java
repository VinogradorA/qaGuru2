package guru.qa.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMethod {


    public static String getRandomString(int len) {
//        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }
    public static String getRandomMonth(){
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
                return getRandomItemFromArray(months);
    }
    public static String getRandomYear(){
        return new Faker().random().nextInt(1950,2000).toString();
    }
    public static String getRandomDay(){
        int day = getRandomInt(1,28);
        if (day < 10) {
            return  "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public static String getRandomHobies() {
        String[] hobies = {"Sports", "Reading", "Music"};
        return getRandomItemFromArray(hobies);
    }

    public static String getRandomSubjects() {
        String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};
        return getRandomItemFromArray(subjects);
    }

    public static String getRandomEmail() {
        return getRandomString(15) + "@qa.guru";
//        return getRandomString(15) + "@" + getRandomString(5) + "." + getRandomString(5);
//        return String.format("%s@%s.%s", getRandomString(15),
//                getRandomString(5), getRandomString(5));
    }

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // +3 (263) 253 - 66 - 12
    public static String getRandomPhone() {
        return String.format("%s%s%s%s", getRandomInt(111, 999),
                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return getRandomItemFromArray(genders);
    }

    public static String getRandomItemFromArray(String[] array) {
        int index = getRandomInt(0, array.length - 1);

        return array[index];
    }
    public static String getRandomFirstName() {
        return new Faker(new Locale("ru")).name().firstName();
    }
    public static String getRandomAddress() {
        return new Faker(new Locale("ru")).address().fullAddress();
    }

    public static String getRandomLastName() {
        return new Faker(new Locale("ru")).name().lastName();
    }
    public static String getRandomState() {
        String[] states = {"Rajasthan", "NCR", "Uttar Pradesh", "Haryana"};
        return getRandomItemFromArray(states);
    }

    public static String getRandomCity(String state) {
        switch (state) {
            case "NCR": {
                String[] city = {"Delhi", "Gurgaon", "Noida"};
                return getRandomItemFromArray(city);
            }
            case "Uttar Pradesh": {
                String[] city = {"Agra", "Lucknow", "Merrut"};
                return getRandomItemFromArray(city);
            }
            case "Haryana": {
                String[] city = {"Karnal", "Panipat"};
                return getRandomItemFromArray(city);
            }
            case "Rajasthan": {
                String[] city = {"Jaipur", "Jaiselmer"};
                return getRandomItemFromArray(city);
            }
        }
        return null;
    }

}
