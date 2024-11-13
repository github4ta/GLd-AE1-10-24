package by.fiveelement;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UserRegistrationApiTest {

    @Test
    @DisplayName("Регистрация без номера телефона")
    public void testRegistrationWithoutPhoneNumber() {
        String body = "{\n" +
                "    \"name\": \"test\",\n" +
                "    \"mobile\": \"\",\n" +
                "    \"type\": \"reg_code\"\n" +
                "}";
        String url = "https://5element.by/user/registration";
        given()
                .body(body)
                .headers("Content-Type", "application/json")
        .when()
                .post(url)
        .then()
                .log().all()
                .statusCode(200)
                .body("errors.fields.mobile", equalTo("Укажите номер телефона"));
    }

    @Test
    @DisplayName("Регистрация без имени и номера телефона")
    public void testRegistrationWithoutNameAndPhoneNumber() {
        String body = "{\n" +
                "    \"name\": \"\",\n" +
                "    \"mobile\": \"\",\n" +
                "    \"type\": \"reg_code\"\n" +
                "}";
        String url = "https://5element.by/user/registration";
        given()
                .body(body)
                .headers("Content-Type", "application/json")
                .when()
                .post(url)
                .then()
                .log().all()
                .statusCode(200)
                .body("errors.fields.name", equalTo("Укажите имя"))
                .body("errors.fields.mobile", equalTo("Укажите номер телефона"));
    }

    @Test
    @DisplayName("Регистрация без имени")
    public void testRegistrationWithoutName() {
        String body = "{\n" +
                "   \"name\": \"\",\n" +
                "   \"mobile\": \"+375290000000\",\n" +
                "   \"type\": \"reg_code\"\n" +
                "}";
        String url = "https://5element.by/user/registration";
        given()
                .body(body)
                .headers("Content-Type", "application/json")
                .when()
                .post(url)
                .then()
                .log().all()
                .statusCode(200)
                .body("errors.fields.name", equalTo("Укажите имя"));
    }
}
