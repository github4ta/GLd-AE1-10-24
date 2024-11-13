package by.fiveelement;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class SearchApiTest {

    private static String URL = "https://sort.diginetica.net/search?st=apple&apiKey=08IE0509XQ&strategy=advanced_xname,zero_queries&fullData=true&withCorrection=true&withFacets=true&treeFacets=true&regionId=global&useCategoryPrediction=false&size=20&offset=0&showUnavailable=true&unavailableMultiplier=0.002&preview=false&withSku=false&sort=DEFAULT";

    @Test
    void searchStatusCodeTest(){
        RestAssured
                .when()
                    .get(URL)
                .then()
                    .statusCode(200);
    }
}
