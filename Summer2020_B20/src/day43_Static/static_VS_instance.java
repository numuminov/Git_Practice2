package day43_Static;

public class static_VS_instance {
    static int staticVariable;
    int instanceVariable;


    public static void main(String[] args) {

        static_VS_instance obj1=new static_VS_instance();
        obj1.instanceVariable=100;
        obj1.staticVariable=400;

        static_VS_instance obj2=new static_VS_instance();
        obj2.instanceVariable=200;
        obj2.staticVariable=300;


        System.out.println(obj1.instanceVariable);//100
        System.out.println(obj2.instanceVariable);//200
        System.out.println("=================");

        System.out.println(obj1.staticVariable);//100
        System.out.println(obj2.staticVariable);//200




    }
}
