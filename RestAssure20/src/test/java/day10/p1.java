package day10;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
import org.junit.jupiter.api.DisplayName;
import pojo.Employees;
import testbase.HR_ORDS_TestBase;
import utility.DB_Utility;
import static org.hamcrest.MatcherAssert.assertThat;

        import java.util.*;

public class p1 extends HR_ORDS_TestBase{

    @DisplayName("Employee table task")
    @Test
    public void TestEmployeeTable(){

        Response response =given().accept(ContentType.JSON).get("/employees");
        JsonPath jp=response.jsonPath();

        //find max and min salary
        // find max salary
        System.out.println(jp.getInt("items.salary.max()"));
        System.out.println(jp.getInt("items.salary.min()"));
        //find max salary employee phone_number
        System.out.println(jp.getString("items.max{it.salary}.phone_number"));
        //find max salary employee first_name
        System.out.println(jp.getString("items.max{it.salary}.first_name"));
        //find min salary if job_id is FI_ACCOUNT
        System.out.println(jp.getInt("items.findAll{it.job_id=='FI_ACCOUNT'}.salary.min()"));

//        findAll email of employees belong to department 100
        System.out.println(jp.getList("items.findAll{it.department_id==90}.email"));
//        findAll first_name with salary more than 15000
        System.out.println(jp.getList("items.findAll{it.salary>15000}.first_name"));
//        findAll last_name of employee from index 10-15

        System.out.println(jp.getList("items.last_name[10..15]"));
//        findAll phone_number startWith 590 (it.phone_number.startWith('590'))
        //System.out.println(jp.getList("items.phone_number{it.startWith('590')}"));
//        Totally Optional :
//         collect first_name + last_name into a List<String>
        System.out.println(jp.getList("items.collect{it.first_name+' '+it.last_name}"));
//         items.collect { it.first_name +' '+ it.last_name }
//         findAll salary for those who has commission_pct not null
        System.out.println(jp.getList("items.findAll{it.commission_pct==null}.salary"));
//         then collect total salary after commission as List<Double>



    }

}
/*

//                *   findAll phone_number startWith 590 (it.phone_number.startWith('590'))
    List<String> phoneNum_590 = jp.getList("it.phone_number.startWith('590')");
    System.out.println("phoneNum_590 = " + phoneNum_590);
​
//                *   Totally Optional :
//     *   collect first_name + last_name into a List<String>
    List<String> first_lastName =
            jp.getList("items.collect { it.first_name +' '+ it.last_name }");
    System.out.println("first_lastName = \n\t" + first_lastName);
//     *         items.collect { it.first_name +' '+ it.last_name }
//     *   findAll salary for those who has commission_pct not null
//                *   then collect total salary after commission as List<Double>
    List<Integer> commission_pctSalary =
            jp.getList("items.findAll{it.commission_pct!=null}.salary");
    System.out.println("commission_pctSalary = " + commission_pctSalary);
    //commission_pctSalary = [] -->is empty
​
}
}

 */

