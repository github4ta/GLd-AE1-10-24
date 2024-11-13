package by.fiveelement;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

public class SearchApiTest {

    private static String URL = "https://sort.diginetica.net/search?st=apple&apiKey=08IE0509XQ&strategy=advanced_xname,zero_queries&fullData=true&withCorrection=true&withFacets=true&treeFacets=true&regionId=global&useCategoryPrediction=false&size=20&offset=0&showUnavailable=true&unavailableMultiplier=0.002&preview=false&withSku=false&sort=DEFAULT";

    private static String rawHeaders = "accept:*/*\n" +
            "accept-language:ru-BY,ru;q=0.9,en-US;q=0.8,en;q=0.7,ru-RU;q=0.6,bg;q=0.5,uk;q=0.4\n" +
            "origin:https://5element.by\n" +
            "priority:u=1, i\n" +
            "referer:https://5element.by/\n" +
            "sec-ch-ua:\"Chromium\";v=\"130\", \"Google Chrome\";v=\"130\", \"Not?A_Brand\";v=\"99\"\n" +
            "sec-ch-ua-mobile:?0\n" +
            "sec-ch-ua-platform:\"Windows\"\n" +
            "sec-fetch-dest:empty\n" +
            "sec-fetch-mode:cors\n" +
            "sec-fetch-site:cross-site\n" +
            "user-agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/130.0.0.0 Safari/537.36";

    @Test
    void searchStatusCodeTest(){
        RestAssured
                .given()
                    .headers(rawHeaders
                                .lines()
                                .map(line -> line.split(":"))
                                .collect(Collectors.toMap(key -> key[0], val -> val[1])))
                .when()
                    .get(URL)
                .then()
                    .statusCode(200);
    }
}
