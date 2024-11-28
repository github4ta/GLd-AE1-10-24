package biz.svyatoslav.api;

import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class CalculatorApi {

    private final String POST_REQUEST_URL = "https://svyatoslav.biz/testlab/wt/index.php";

    public ValidatableResponse getResponseForRequestWithData(String name, String height, String weight) {
        ValidatableResponse response = given()
                .formParam("name", name)
                .formParam("height", height)
                .formParam("weight", weight)
                .when()
                .post(POST_REQUEST_URL)
                .then();
        return response;
    }
}
