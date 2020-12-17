package day06;

import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import pojo.Spartan;
import utility.ConfigurationReader;
import utility.SpartanUtil;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;


public class PostWithCustomObject {

    @BeforeAll
    public static void setUp(){
        //RestAssured.filters().add(new AllureRestAssured() ) ;
        baseURI = ConfigurationReader.getProperty("spartan.base_url");
        basePath = "/api" ;
    }


    @AfterAll
    public static void tearDown(){
        reset();
    }

    @DisplayName("Add 1 Data with POJO as body")
    @Test
    public void testAddDataWithPojo(){

        //Spartan sp1= new Spartan("Ronaldo","Male",1238760980l);

        Spartan sp1=SpartanUtil.getRandomSpartanPOJO_Payload();
        given()
                .auth().basic("admin","admin")
                .contentType(ContentType.JSON)
                .body(  sp1  )
                .log().all().
                when()
                .post("/spartans").
                then()
                .log().all()
                .assertThat()
                .statusCode(201)
                .body("success",is("A Spartan is Born!"))
                .body("data.name",is(sp1.getName()))
                .body("data.gender",is(sp1.getGender()))
                .body("data.phone",is(sp1.getPhone()))
        ;
    }
}