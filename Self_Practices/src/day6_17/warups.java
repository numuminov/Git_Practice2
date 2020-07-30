package day6_17;

public class warups {


   /*
    write a program that can define the age groups of a person
             age groups are:
                    baby (< 3 year)
                    Toddler (3 - 5),
                    Kid (6 - 9),
                    Pre-Teen (10 - 12),
                    Teenager (13 - 17),
                    Young Adult (18 - 20),
                    Adult (21 - 39),
                    Young Middle-Aged Adult (40 - 49),
                    Middle-Aged Adult (50 - 54),
                    Very Young Senior Citizen (55 - 64),
                    Young Senior Citizen (65 - 74),
                    Senior Citizen (75 - 84),
                    Old Senior Citizen (85+)
                    if age > 150 or less than 0 ==> invalid entry
2. Write an if statement that will print day of the week based on value of the day variable.
        Ex:
            num = 1
        output:
            "Monday"
            num = 8
        output:
            "There is no such a day!"
            num = 3

        output:
            Wednesday





    /*

    */
   public static void main(String[] args) {
       int age = 55;
       String mrms= "";

       if(age<=3&&age>=0){mrms= "Baby";} else if(age<=5&&age>3){mrms= "Toddler";} else if(age<=9&&age>=6){mrms= "Kid";} else if(age<=10&&age>=12){mrms= "Pre-Teen";} else if(age<=17&&age>=13){mrms= "Teenager";} else if(age<=20&&age>=18){mrms= "young adult";}
       else if(age<=39&&age>=21){mrms= "Adult";} else if(age<=49&&age>=40){mrms= "Young Middle aged abult";} else if(age<=54&&age>=50){mrms= "Middle aged adult";}
       else if(age<=64&&age>=55){mrms= "Very youn senior citizen";} else if(age<=74&&age>=65){mrms= "Young senor citizen";}
       else if(age<=75&&age>=84){mrms= "Senior Citizen";} else if(age<=150&&age>=85){mrms= "Old Cenior Citizen";}
       else{mrms= "Invalid entry";}


       System.out.println(mrms);




   }

}