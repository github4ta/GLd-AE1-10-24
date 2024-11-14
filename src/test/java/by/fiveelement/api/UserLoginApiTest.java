package by.fiveelement.api;

import by.fiveelement.api.login.UserLoginApiRequest;
import by.fiveelement.api.login.UserLoginApiResponse;
import by.fiveelement.util.GenerationDataUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserLoginApiTest {
    @BeforeEach
    void setUp() {
        UserLoginApiRequest.initRequestSpecification();
    }

    @Test
    @DisplayName("Авторизация c невалидным логином")
    public void testAuthorizationWithInvalidLogin() {
        String login = GenerationDataUtil.generateName();
        String password = GenerationDataUtil.generatePassword();

        given()
                .spec(UserLoginApiRequest.requestSpecification)
                .body(UserLoginApiRequest.getBody(login, password))
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("errors.fields.login", equalTo(UserLoginApiResponse.INVALID_INPUT_MESSAGE))
                .body("message", equalTo(UserLoginApiResponse.INVALID_INPUT_MESSAGE));
    }

    @Test
    @DisplayName("Авторизация c пустым логином")
    public void testAuthorizationWithEmptyLogin() {
        String login = "";
        String password = GenerationDataUtil.generatePassword();

        given()
                .spec(UserLoginApiRequest.requestSpecification)
                .body(UserLoginApiRequest.getBody(login, password))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("message", equalTo(UserLoginApiResponse.MANDATORY_FIELDS_MESSAGE));
    }

    @Test
    @DisplayName("Авторизация c пустым паролем")
    public void testAuthorizationWithEmptyPassword() {
        String login = GenerationDataUtil.generateBelarusMobilePhone();
        String password = "";

        given()
                .spec(UserLoginApiRequest.requestSpecification)
                .body(UserLoginApiRequest.getBody(login, password))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("message", equalTo(UserLoginApiResponse.MANDATORY_FIELDS_MESSAGE));
    }

    @Test
    @DisplayName("Авторизация c пустым типом")
    public void testAuthorizationWithEmptyType() {
        String login = GenerationDataUtil.generateEmail();
        String password = GenerationDataUtil.generatePassword();
        String type = "";

        given()
                .spec(UserLoginApiRequest.requestSpecification)
                .body(UserLoginApiRequest.getBody(login, password, type))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("message", equalTo(UserLoginApiResponse.INCORRECT_REQUEST_MESSAGE));
    }
}
