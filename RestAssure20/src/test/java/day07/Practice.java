package day07;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import pojo.BookCategory;
import pojo.Departments;
import pojo.Employees;
import pojo.Region;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class Practice {

    @BeforeAll
    public static void setUp(){
        baseURI = "http://54.90.101.103:1000";
        basePath = "/ords/hr" ;
    }

    @AfterAll
    public static void tearDown(){
        reset();
    }


    @DisplayName("Testing Emp")
    @Test
    public void testThirdRegionIsAsia(){

        given().pathParam("id", 102).log().all().when().get("employees/{id}").prettyPeek().then().statusCode(200).log().all()
                .body("first_name",is("Lex"));


    }

    @DisplayName("Testing /employees/{id}")
    @Test
    public void testEmployees(){

    Response response = given().pathParam("id", 102).when().get("/employees/{id}").prettyPeek();

    JsonPath jp=response.jsonPath();

    Employees emp1=jp.getObject("", Employees.class);

        System.out.println("emp1 = " + emp1);


}
    @DisplayName("Save GET /regions response as List of POJO")
    @Test
    public void testAllEmployees() {

        Response response= given().log().all().when().get("/employees").prettyPeek();

        JsonPath jp=response.jsonPath();

        List <Employees> allEmp=jp.getList("items",Employees.class);
        allEmp.forEach(System.out::println);

    }

@DisplayName("Test Departments")
    @Test
    public void testDepartments(){

        Response response = given()
                //.pathParam("num", 240)
                .log().all().accept(ContentType.JSON).when().get("/departments").prettyPeek();
        
        
        
        JsonPath jp = response.jsonPath();

    //Departments department1=jp.getObject("",Departments.class);
    //System.out.println("department1 = " + department1);


    List<Departments> allDep=jp.getList("items", Departments.class);

    allDep.forEach(System.out::println);
}

}
