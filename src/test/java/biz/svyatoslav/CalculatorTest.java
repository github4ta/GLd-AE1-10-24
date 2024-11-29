package biz.svyatoslav;

import biz.svyatoslav.domain.User;
import biz.svyatoslav.pages.CalculatorMessages;
import biz.svyatoslav.pages.CalculatorPage;
import biz.svyatoslav.steps.CalculatorStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends BaseTest{

    @Test
    @DisplayName("Все поля пустые")
    public void test1() {

        String EMPTY_VALUE = "";
        CalculatorStep calculatorStep = new CalculatorStep();
        calculatorStep.fillFormAndSubmit(EMPTY_VALUE, EMPTY_VALUE, EMPTY_VALUE, EMPTY_VALUE);
        CalculatorPage calculatorPage = new CalculatorPage();
        Assertions.assertEquals(CalculatorMessages.NO_DATA, calculatorPage.getErrorMessage(), "Все поля пустые");
    }

    @Test
    @DisplayName("Все поля пустые")
    public void test2() {

        String EMPTY_VALUE = "";
        User user = new User(EMPTY_VALUE, 0, 0, EMPTY_VALUE);
        CalculatorStep calculatorStep = new CalculatorStep();
        calculatorStep.fillFormAndSubmit(user);
        CalculatorPage calculatorPage = new CalculatorPage();
        Assertions.assertEquals(CalculatorMessages.NO_DATA, calculatorPage.getErrorMessage(), "Все поля пустые");
    }
}
