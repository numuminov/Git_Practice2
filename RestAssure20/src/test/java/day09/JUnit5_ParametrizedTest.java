package day09;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
public class JUnit5_ParametrizedTest {






@ParameterizedTest
@ValueSource(ints = {5,6,7,8,9})
    public void  test1(int myNumber){
        //assert 5,6,7,8,9 are all less than 10
    System.out.println("myNumber = " + myNumber);

    assertTrue(myNumber<10);
        


    }

    @ParameterizedTest
    @CsvFileSource(resources = "/zipcode.csv" , numLinesToSkip = 1)
    public void test2( String zip ){
        System.out.println("zip = " + zip);

        //api.zippopotam.us/us/15237

        given().log().uri().
                baseUri("http://api.zippopotam.us").pathParam("zipcode", zip).when()
                .get("/us/{zipcode}").then().statusCode(200);








    }

    @ParameterizedTest
    @CsvFileSource(resources = "/country_zip.csv" , numLinesToSkip = 1)
    public void testCountryZipCodeCombo(String csvCountry, int csvZip){
        given()
                .log().uri()
                .baseUri("https://api.zippopotam.us")
                .pathParam("country" , csvCountry)
                .pathParam("zipcode" , csvZip).
                when()
                .get("/{country}/{zipcode}").
                then()
                .statusCode(200) ;
    }





}
