package biz.svyatoslav.api;

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
}
