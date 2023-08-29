package guru.qa.tests;

import org.junit.jupiter.api.Test;

public class TestJavaOperator {
    //операторы арифмитичские + - * / % ++ --
    //операторы сравнения < > <= >= != ==
    //операторы kjubxtcrbt  && (&) || (|)
    @Test
    void testOperator() {

        char sex = 'm';
        String chaildName = sex == 'm'
                ? "valera"
                : "maria";


        if (sex == 'm') {
            chaildName = "valera";
        } else {
            chaildName = "maria";
        }
    }
}