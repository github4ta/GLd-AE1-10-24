package biz.svyatoslav.steps;

import biz.svyatoslav.domain.NewUser;
import biz.svyatoslav.domain.User;
import biz.svyatoslav.enums.Gender;
import biz.svyatoslav.pages.CalculatorPage;

public class CalculatorStep {

    public void fillFormAndSubmit(String name, String height, String weight, String gender) {
        CalculatorPage calculatorPage = new CalculatorPage();

        calculatorPage.fillName(name);
        calculatorPage.fillHeight(height);
        calculatorPage.fillWeight(weight);
        if (gender == "MALE") {
            calculatorPage.selectMale();
        }
        if (gender == "FEMALE") {
            calculatorPage.selectFemale();
        }
        calculatorPage.clickButton();
    }

    public void fillFormAndSubmit(String name, int height, int weight, String gender) {
        fillFormAndSubmit(name, String.valueOf(height), String.valueOf(weight), gender);
    }

    public void fillFormAndSubmit(User user) {
        fillFormAndSubmit(user.getName(), user.getHeight(), user.getWeight(), user.getGender());
    }

    public void fillFormAndSubmit(NewUser user) {
        fillFormAndSubmit(user.getName(), user.getHeight(), user.getWeight(), user.getGender().toString());
    }

    public void fillFormAndSubmit(String name, String height, String weight, Gender gender) {
        CalculatorPage calculatorPage = new CalculatorPage();

        calculatorPage.fillName(name);
        calculatorPage.fillHeight(height);
        calculatorPage.fillWeight(weight);
        if (gender == Gender.MALE) {
            calculatorPage.selectMale();
        }
        if (gender == Gender.FEMALE) {
            calculatorPage.selectFemale();
        }
        calculatorPage.clickButton();
    }
}
