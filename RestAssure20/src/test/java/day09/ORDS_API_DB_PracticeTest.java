package day09;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Country;
import testbase.HR_ORDS_TestBase;
import utility.DB_Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ORDS_API_DB_PracticeTest extends HR_ORDS_TestBase {

    @DisplayName("GET /countries/{country_id} Compare Result with DB")
    @Test
    public void testResponseMatchDatabaseData(){

        String myCountryID = "AR" ;
        // send request to /countries/{country_id} for AR
        // save the result as Country POJO

        Country arPOJO =    given()
                .pathParam("country_id" , myCountryID).
                        when()
                .get("/countries/{country_id}").prettyPeek()
                .as(Country.class) ;

        // here the shorter way of above code
//        Country arPOJO1 =  get("/countries/{country_id}" , myCountryID ) .as(Country.class) ;
        System.out.println("arPOJO = " + arPOJO);

        String query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = '" + myCountryID + "'  " ;
        System.out.println("query = " + query);
        DB_Utility.runQuery( query ) ;
        Map<String,String> dbResultMap = DB_Utility.getRowMap(1) ;

        // now start validating the actual response to expected result from database
        assertThat( arPOJO.getCountry_id()  ,is(dbResultMap.get("COUNTRY_ID") ) );
        assertThat(arPOJO.getCountry_name() ,is(dbResultMap.get("COUNTRY_NAME") ) );
        // save region_id from the map as number
        int expectedRegionId = Integer.parseInt(dbResultMap.get("REGION_ID"));
        assertThat(arPOJO.getRegion_id()    ,equalTo(   expectedRegionId   ) );



    }

    @DisplayName("GET /countries/{country_id} Compare Result with DB")
    @Test
    public void testResponsePracTice (){

        String coID="AU";

        Country pojo2=given().pathParam("id", coID).when().get("/countries/{id}").prettyPeek().as(Country.class);

        String query="SELECT * FROM COUNTRIES WHERE COUNTRY_ID = '" + coID + "'  " ;
                //"Select * from countries where country_id= '"+coID+"' ";

        DB_Utility.runQuery(query);
        Map<String, String> dbRez=DB_Utility.getRowMap(1);
        System.out.println("dbRez = " + dbRez);

        assertThat(pojo2.getCountry_id(),is(dbRez.get("COUNTRY_ID")));
        assertThat(pojo2.getCountry_name(),is(dbRez.get("COUNTRY_NAME")));

        int expid=Integer.parseInt(dbRez.get("REGION_ID"));
        assertThat(pojo2.getRegion_id(),is(expid));





    }

    @DisplayName("GET /countries Capture All CountryID and Compare Result with DB")
    @Test
    public void testResponseAllCountryIDsMatchDatabaseData(){

        List<String> allCountriesIds =  get("/countries").jsonPath().getList("items.country_id");
       allCountriesIds.forEach(System.out::println);

        DB_Utility.runQuery("SELECT * FROM COUNTRIES");
        List<String> expectedListFromDB = DB_Utility.getColumnDataAsList("COUNTRY_ID");
//        expectedListFromDB.forEach(System.out::println);

        // assert both list has same information
        assertThat(allCountriesIds , equalTo(expectedListFromDB)  );

    }

    @DisplayName("Practice")
    @Test
    public void testResponseAllCountryIDpractice(){
        
        List<String> all=get("/countries").jsonPath().getList("items.country_id");
        System.out.println("all = " + all);

        DB_Utility.runQuery("SELECT * FROM COUNTRIES");
        List<String> allDB=DB_Utility.getColumnDataAsList("COUNTRY_ID");

        assertThat(all,equalTo(allDB));

        
        
        
        
    }



}