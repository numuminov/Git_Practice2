package day04;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.AfterAll;

import java.util.LinkedHashMap;
import java.util.Map;
import java.io.File;

public class SpartanUpdatingTest {


    @BeforeAll
    public static void setUp(){
        baseURI = "http://54.90.101.103:8000";
        basePath = "/api" ;
    }
    @AfterAll
    public static void tearDown(){
        reset();
    }


    @DisplayName("Testing PUT /api/spartans/{id} ")
    @Test
    public void testUpdatingSingleSpartan(){

        String updateStrPayload =  "    {\n" +
                "        \"name\": \"Trabzonspor\",\n" +
                "        \"gender\": \"Male\",\n" +
                "        \"phone\": 9876543210\n" +
                "    }" ;

        given()
                .log().all()
                .auth().basic("admin","admin")
                .contentType(ContentType.JSON)
                .pathParam("id", 7)
                .body(updateStrPayload).
                when()
                .put("/spartans/{id}").
                then()
                .log().all()
                .assertThat()
                .statusCode( is(204))
                // This is how we can check a header exists by checking the value is not null
                // using notNullValue() matcher
                .header("Date", is(notNullValue() ) )
                .body( emptyString() )
        ;
    }

    @DisplayName("Testing PATCH /api/spartans/{id} with String body")
    @Test
    public void testPartialUpdatingSingleSpartanWithStringBody(){

        // update the name to B20 Patched
        // {"name" : "Zidane"}
        String patchBody = "{\"name\" : \"Besiktas\"}";

        given()
                .log().all()
                .auth().basic("admin","admin")
                .contentType(ContentType.JSON)
                .pathParam("id", 318)
                .body(patchBody).
                when()
                .patch("/spartans/{id}").
                then()
                .log().all()
                .assertThat()
                .statusCode( is(204))
                // This is how we can check a header exists by checking the value is not null
                // using notNullValue() matcher
                .header("Date", is(notNullValue() ) )
                .body( emptyString() );




    }

    @DisplayName("Testing Delete /api/spartans/{id} with String body")
    @Test
    public void testDeletingSingleSpartanWithStringBody(){


        given()
                .log().all()
                .auth().basic("admin","admin")

                .pathParam("id", 45).
                when()
                .delete("/spartans/{id}").
                then()
                .log().all()
                .assertThat()
                .statusCode( is(204))
                // This is how we can check a header exists by checking the value is not null
                // using notNullValue() matcher
                .header("Date", is(notNullValue() ) )
                .body( emptyString() );




    }


}
