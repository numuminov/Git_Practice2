package practice6_10;

public class cities {
    public static void main(String[] args) {
        String city1 = "Tashkent";
        String city2 = "Kyiv";
        String city3 = "Moscow";
        System.out.println("From " + city1 + " to " + city2 + " is $500");
        System.out.println("From " + city3 + " to " + city1 + " is $550");
        System.out.println("I have been to " + city1+ ", " + city3 + ", " + city2+".");
        int age = 4;
        String mrms= "";

        if(age<2){mrms= "ineligible";} else if(age==2){mrms= "toddler";} else if(age<=5&&age>=3){mrms= "early childhood";} else if(age<=7&&age>=6){mrms= "young reader";} else if(age<=10&&age>=8){mrms= "elementary";} else if(age<=12&&age>=11){mrms= "middle";}
        else if(age==13){mrms= "impossible";} else if(age<=16&&age>=14){mrms= "high school";} else if(age<=18&&age>=17){mrms= "schoolar";}
        else{mrms= "ineligible";}


        System.out.println(mrms);





    }
}
