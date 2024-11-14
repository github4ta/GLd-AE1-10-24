package by.fiveelement.api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class UserLoginApiRequest {
    public static RequestSpecification requestSpecification;

    public static void initRequestSpecification() {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://5element.by")
                .setBasePath("/user/login")
                .setContentType("application/json;charset=UTF-8")
                .addHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36")
                .build();
    }

    public static String getBody(String login, String password) {
        return "{\n" +
                "   \"login\": \"" + login + "\",\n" +
                "   \"password\": \"" + password + "\",\n" +
                "   \"type\": \"auth_psw\"\n" +
                "}";
    }

    public static String getBody(String login, String password, String type) {
        return "{\n" +
                "   \"login\": \"" + login + "\",\n" +
                "   \"password\": \"" + password + "\",\n" +
                "   \"type\": \"" + type + "\"\n" +
                "}";
    }
}
