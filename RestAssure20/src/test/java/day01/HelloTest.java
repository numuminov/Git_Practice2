package day01;


import org.junit.jupiter.api.*;

import static  org.junit.jupiter.api.Assertions.*;


@DisplayName("Day  1 Hello Test")
public class HelloTest {

    @BeforeAll
    public  static  void setUp(){

        System.out.println("@Before all is running");
    }
    @AfterAll

    public  static  void tearDown(){

        System.out.println("@after all is running");
    }

    @BeforeEach
    public  void SetUptest(){
        System.out.println("Before each  is running ");


    }
    @AfterEach
    public  void TearDowntest(){
        System.out.println("After each  is running ");


    }
    @DisplayName("Test 1+2=3")
    @Test
    public void test(){
        System.out.println("Test1 is running ");
        Assertions.assertEquals(3,2+1);
    }

    @Disabled
    @DisplayName("Test 12=3*4")
    @Test
    public  void test2(){
        System.out.println("Test2 is running ");
        assertEquals(12,4*3);

    }
}
