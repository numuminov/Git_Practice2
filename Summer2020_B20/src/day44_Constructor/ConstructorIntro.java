package day44_Constructor;

public class ConstructorIntro {
    /*
    Constructor: very special method. used when we create the object of the class

            Every class  MUST have constructor. if we don't create one, compiler creates it for us (no-arg)
            execution depends on the creation of object
           A                 obj         =   new           A();
        class name           obj name        keyword      Constructor
        declear:
             Access-Modifier  className(Parameters){
                    statements;
             }
             name of constructor MUST be same with class name
    create object from class:
                ClassName    obj = new ExistingConstructor

     */
    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
        System.out.println("How are you "+arr);
    }


    public static void main(String[] args) {

        //    ConstructorIntro obj = new ConstructorIntro(10);

        //  ConstructorIntro obj2 =  new ConstructorIntro();

        ConstructorIntro obj3 = new ConstructorIntro("Muhtar");
        ConstructorIntro obj4 = new ConstructorIntro("Dawud");
        ConstructorIntro obj5 = new ConstructorIntro("Zeliha");


    }

}

