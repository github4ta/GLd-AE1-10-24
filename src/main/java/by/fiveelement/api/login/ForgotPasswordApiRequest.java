package by.fiveelement.api.login;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ForgotPasswordApiRequest {
    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://5element.by/")
                .setBasePath("/user/forgot/password")
                .setContentType(ContentType.JSON)
                .build();
    }

    public static String getBody(String email, String sendCode) {
        return "{\"login\":\"" + email + "\",\"type\":\"" + sendCode + "\"}";
    }
}