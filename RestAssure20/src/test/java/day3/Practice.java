package day3;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

public class Practice {

    @BeforeAll
    public  static  void setUp(){
        baseURI="http://100.26.101.158:8000";
        basePath="/api";
    }

    @AfterAll
    public  static  void tearDown(){
        reset();
    }
    @DisplayName("first Practice")
    @Test
    public  void test1(){

        JsonPath jp = get("/spartans").jsonPath();
        
        String name1= jp.getString("name[0]");
        System.out.println("name1 = " + name1);

        String phone2= jp.getString("phone[1]") ;
        System.out.println("phone2 = " + phone2);

        List<String> allPhone= jp.getList("phone");
        System.out.println("allPhone = " + allPhone);

        jp=given().queryParam("gender", "Male").when().get("/spartans/search").jsonPath();

        System.out.println(jp.getString("content[1].name"));

    }
}
