package guru.qa.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selenide.*;

public class FileParce {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }
    @Disabled("Тест проверят загрузку файла побайтово и сравнение надписи")
    @Test
    void downLoadTXTFileTest() throws Exception {
        open("https://github.com/junit-team/junit5/blob/main/README.md");
        File download = $("a[href*='raw/main/README.md']").download();
        try(InputStream is = new FileInputStream(download);) {
            byte[] bytes = is.readAllBytes();
            String content = new String(bytes, StandardCharsets.UTF_8);
            Assertions.assertTrue(content.contains("This repository is the home of _JUnit 5_."));
        }
    }
    @Disabled("Тест проверят загрузку файла побайтово и сравнение надписи")
    @Test
    void downLoadPDFFileTest() throws Exception {
        open("https://github.com/junit-team/junit5/blob/main/README.md");
        File download = $("a[href*='raw/main/README.md']").download();
        try(InputStream is = new FileInputStream(download);) {
            byte[] bytes = is.readAllBytes();
            String content = new String(bytes, StandardCharsets.UTF_8);
            Assertions.assertTrue(content.contains("This repository is the home of _JUnit 5_."));
        }
    }

    @Test
    void uploadFileTest() throws Exception {
        open("https://fineuploader.com/demos.html");
        $("input[type='file']").uploadFromClasspath("inst.png");
        $(".qq-file-name").shouldHave(Condition.text("inst.png"));
    }
}
