package by.fiveelement.api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class SearchApiTest {

    private String URL = "https://sort.diginetica.net/search";

    private String rawParams = "st:apple\n" +
            "apiKey:08IE0509XQ\n" +
            "strategy:advanced_xname,zero_queries\n" +
            "fullData:true\n" +
            "withCorrection:true\n" +
            "withFacets:true\n" +
            "treeFacets:true\n" +
            "regionId:global\n" +
            "useCategoryPrediction:false\n" +
            "size:20\n" +
            "offset:0\n" +
            "showUnavailable:true\n" +
            "unavailableMultiplier:0.002\n" +
            "preview:false\n" +
            "withSku:false\n" +
            "sort:DEFAULT";

    @Test
    void searchStatusCodeTest(){
        RestAssured
                .given()
                    .basePath(URL)
                    .queryParams(rawParams
                                    .lines()
                                    .map(line -> line.split(":"))
                                    .collect(Collectors.toMap(key -> key[0], val -> val[1])))
                .when()
                    .get(URL)
                .then()
                    .statusCode(200);
    }
}
