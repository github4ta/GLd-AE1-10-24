package biz.svyatoslav.api;

import biz.svyatoslav.domain.User;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorApiTest {
    @Test
    @DisplayName("Не заданы параметры в body")
    public void testEmptyBody() {
        String EMPTY_VLAUE = "";
        CalculatorApi calculatorApi = new CalculatorApi();
        ValidatableResponse response = calculatorApi.getResponseForRequestWithData(EMPTY_VLAUE, EMPTY_VLAUE, EMPTY_VLAUE, EMPTY_VLAUE);

        response.statusCode(200);
    }

    @Test
    @DisplayName("Не заданы параметры в body")
    public void testEmptyBody2() {
        String EMPTY_VLAUE = "";
        User user = new User(EMPTY_VLAUE, 0, 0, EMPTY_VLAUE);
        CalculatorApi calculatorApi = new CalculatorApi();
        ValidatableResponse response = calculatorApi.getResponseForRequestWithData(user);

        response.statusCode(200);
    }
}
