package day4;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import utility.DB_Utility;

public class DB_Test {

    @BeforeAll
    public static void init(){

        DB_Utility.createConnection();
    }

    @AfterAll

    public static void tearDown() {

    DB_Utility.destroy();

    }

    @Test
    public  void testEmploeecount(){

        //run a query select * from employees
        //assert that the employees count is 107
        DB_Utility.runQuery("select * from employees");
        int emp=DB_Utility.getRowCount();
        Assertions.assertEquals(107,emp);
        System.out.println("assert true!!!");


    }

    @Test
    public  void test3rdRow2ndColumn(){
        DB_Utility.runQuery("select * from regions");

        Assertions.assertEquals("Asia", DB_Utility.getColumnDataAtRow(3,2));



    }
}
