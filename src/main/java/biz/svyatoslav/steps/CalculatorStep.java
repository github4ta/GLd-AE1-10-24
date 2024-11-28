package biz.svyatoslav.steps;

import biz.svyatoslav.pages.CalculatorPage;

public class CalculatorStep {

    public void fillFormAndSubmit(String name, String height, String weight, String gender) {
        CalculatorPage calculatorPage = new CalculatorPage();

        calculatorPage.fillName(name);
        calculatorPage.fillHeight(height);
        calculatorPage.fillWeight(weight);
        if (gender == "male") {
            calculatorPage.selectMale();
        }
        if (gender == "female") {
            calculatorPage.selectFemale();
        }
        calculatorPage.clickButton();

    }
}
