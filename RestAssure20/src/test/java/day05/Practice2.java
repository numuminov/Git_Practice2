package day05;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.ConfigurationReader;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
import org.junit.jupiter.api.DisplayName;
import utility.SpartanUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class Practice2 {

    @Test
    public void Test1(){
        JsonPath jp = given().contentType(ContentType.JSON).
                when().get(" https://swapi.dev/api/people").prettyPeek().then()
        .extract().jsonPath();



        List<String>hairColor= jp.getList("results.hair_color");
        System.out.println("hairColor = " + hairColor);
        
        List<Integer> height=jp.getList("results.height");
        System.out.println("height = " + height);


        ArrayList<String> hairs=new ArrayList<>();
        for (String s : hairColor) {
            if (s!="blond"||s!="n/a"){hairs.add(s);}



        }

        System.out.println("s = " + hairs);



       

       


    }
}
