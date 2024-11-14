package by.fiveelement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ForgotPasswordApiTest {

    @BeforeEach
    void setup() {
        ForgotPasswordApiRequest.initRequestSpecification();
    }

    @Test
    @DisplayName("Пустой логин")
    public void testEmptyLogin() {
        String email = "";
        String sendCode = "send_code";

        given()
                .spec(ForgotPasswordApiRequest.requestSpecification)
                .body(ForgotPasswordApiRequest.getBody(email, sendCode))
                .when()
                .post()
                .then()
                .log().all()
                .statusCode(200)
                .body("message", equalTo("Некорректный ввод"));
    }

    @Test
    @DisplayName("Отправлен код подтверждения на указанный email")
    public void testConfirmationCodeSentToTheSpecifiedEmail() {
        String email = "test@test.com";
        String sendCode = "send_code";

        given()
                .spec(ForgotPasswordApiRequest.requestSpecification)
                .body(ForgotPasswordApiRequest.getBody(email, sendCode))
                .when()
                .post()
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("message", equalTo("На указанный email отправлен код для подтверждения"));
    }

    @Test
    @DisplayName("Отправлен код подтверждения на указанный номер")
    public void testConfirmationCodeSentToTheSpecifiedPhone() {
        String email = "+375290000000";
        String sendCode = "send_code";

        given()
                .spec(ForgotPasswordApiRequest.requestSpecification)
                .body(ForgotPasswordApiRequest.getBody(email, sendCode))
                .when()
                .post()
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("message", equalTo("Код подтверждения отправлен на указанный номер"));
    }

    @Test
    @DisplayName("Неверный логин")
    public void testInvalidLogin() {
        String email = "test";
        String sendCode = "send_code";

        given()
                .spec(ForgotPasswordApiRequest.requestSpecification)
                .body(ForgotPasswordApiRequest.getBody(email, sendCode))
                .when()
                .post()
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("message", equalTo("Некорректный ввод"));
    }
}
