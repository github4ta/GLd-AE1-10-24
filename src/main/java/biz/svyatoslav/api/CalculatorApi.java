package biz.svyatoslav.api;

import biz.svyatoslav.domain.NewUser;
import biz.svyatoslav.domain.User;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class CalculatorApi {

    private final String POST_REQUEST_URL = "https://svyatoslav.biz/testlab/wt/index.php";

    public ValidatableResponse getResponseForRequestWithData(String name, String height, String weight, String gender) {
        ValidatableResponse response = given()
                .formParam("name", name)
                .formParam("height", height)
                .formParam("weight", weight)
                .formParam("gender", gender)
                .when()
                .post(POST_REQUEST_URL)
                .then();
        return response;
    }

    public ValidatableResponse getResponseForRequestWithData(String name, int height, int  weight, String gender) {
       return getResponseForRequestWithData(name, Integer.toString(height), Integer.toString(weight), gender);
    }

    public ValidatableResponse getResponseForRequestWithData(User user) {
        return getResponseForRequestWithData(user.getName(), user.getHeight(), user.getWeight(), user.getGender());
    }

    public ValidatableResponse getResponseForRequestWithData(NewUser user) {
        return getResponseForRequestWithData(user.getName(), user.getHeight(), user.getWeight(), user.getGender().label);
    }
}
