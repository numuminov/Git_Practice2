package day05;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utility.ConfigurationReader;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
import org.junit.jupiter.api.DisplayName;
import utility.SpartanUtil;

import java.util.Map;

@TestMethodOrder(MethodOrderer.MethodName.class)

public class Practice {

    private static Map<String,Object> payloadMap ;
    private static int newID ;

    @BeforeAll
    public static void SetUp(){

        baseURI=ConfigurationReader.getProperty("spartan.base_url");
        basePath="/api";
        payloadMap=SpartanUtil.getRandomSpartanRequestPayload();

    }

    @AfterAll
    public static void tearDown(){
        reset();
    }
    @DisplayName("Add Data")
    @Test
    public void Test1(){

       newID= given().auth().basic("admin", "admin").contentType(ContentType.JSON).log().all().body(payloadMap).
        when().post("/spartans").
                then().contentType(ContentType.JSON).log().all().body("data.name",equalTo(payloadMap.get("name"))).body("data.gender",equalTo(payloadMap.get("gender")))
                .body("data.phone",equalTo(payloadMap.get("phone"))).extract().jsonPath().getInt("data.id");

        System.out.println("newID = " + newID);


    }

    @DisplayName("Get Data")
    @Test
    public void Test2(){

        given().auth().basic("admin", "admin").pathParam("id",newID).
        when().get("/spartans/{id}").
        then().statusCode(200).contentType(ContentType.JSON).body("name",equalTo(payloadMap.get("name"))).body("id",equalTo(newID));

    }

    @DisplayName("Update Data")
    @Test
    public void Test3(){



        payloadMap = SpartanUtil.getRandomSpartanRequestPayload();
//        System.out.println("payloadMap = " + payloadMap);
        given()
                .auth().basic("admin","admin")
                .pathParam("id" , newID)
                .contentType(ContentType.JSON)
                .body(payloadMap) // updated payload
                .log().all().
                when()
                .put("/spartans/{id}").
                then()
                .log().all()
                .assertThat()
                .statusCode( is(204) )
                .body( emptyString() );







    }


    @DisplayName("Get Again Data")
    @Test
    public void Test4(){

        given().auth().basic("admin","admin").log().all().pathParam("ia",newID).
                when().get("/spartans/{ia}").then().statusCode(200).contentType(ContentType.JSON).body("name",equalTo(payloadMap.get("name"))).body("id",equalTo(newID));
    }

    @DisplayName("Delete Data")
    @Test
    public void Test5(){

        given().auth().basic("admin","admin").pathParam("id", newID).log().all()
                .when().delete("spartans/{id}").then().statusCode(is(204)).body(emptyString());



        given().auth().basic("admin", "admin").pathParam("id", newID).when().get("spartans/{id}").then().statusCode(is(404));
    }








}
