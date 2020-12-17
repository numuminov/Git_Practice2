package day2;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;



public class Prctc {

    @BeforeAll
    public static void SetUp(){

        baseURI="http://100.26.101.158:8000";
        basePath="/api";
    }

    @AfterAll
    public static void tearDown(){
        reset();

    }

    @DisplayName("Practise")
    @Test
    public void testSpartan(){

        Response response = get("/spartans");
        response.prettyPrint();

        assertThat(response.contentType(), is(ContentType.JSON.toString()));
        assertThat(response.statusCode(),is(200));



    }
    @DisplayName("GivenWhenThen")
    @Test
    public void test2(){

        given()
                .header("accept","application/xml").
                when()
                .get("/spartans").
                then()
                .statusCode(200).header("Content-Type","application/xml");

        given().accept(ContentType.XML).
                when().get("/spartans").then().statusCode(200).contentType(ContentType.XML);

        given().accept(ContentType.JSON).when().get("/spartans").then().statusCode(200).contentType(ContentType.JSON);

        given().header("accept", "application/xml").when().get("/spartans").then().statusCode(200).header("Content-Type","application/xml");

        given().accept(ContentType.JSON).when().get("/spartans").then().statusCode(200).contentType(ContentType.JSON);

    }

    @DisplayName("work with id")
    @Test
    public void test3(){

        given()
                .accept(ContentType.JSON).pathParam("id", "75").pathParam("spar","spartans").
        when()
                .get("/{spar}/{id}").
        then()
                .assertThat().statusCode(200).contentType(ContentType.JSON);


        given()
                .header("accept","application/json").pathParam("spar","spartans").pathParam("id","100").
        when()
                .get("/{spar}/{id}").
        then()
                .statusCode(is(not(is(not(200))))).header("Content-Type","application/json");


        given()
                .accept(ContentType.JSON).
        when()
                .get("/spartans/{id}",4).
        then()
                .statusCode(200).contentType(ContentType.JSON).body("id",is(4)).body("name",equalTo("Page")).body("gender",is("Male")).body("phone",is(1234567899));



    }


}
