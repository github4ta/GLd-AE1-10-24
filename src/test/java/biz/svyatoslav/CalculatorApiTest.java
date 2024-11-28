package biz.svyatoslav;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CalculatorApiTest {
    @Test
    @DisplayName("Не заданы параметры в body")
    public void testEmptyBody() {
        given().formParam("name", "").
                formParam("height", "").
                formParam("weight", "").
                when().
                post("https://svyatoslav.biz/testlab/wt/index.php").
                then().
                statusCode(200);
    }
}
