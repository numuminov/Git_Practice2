package replit;

public class coverUp {
        public static void main(String[] args) {
            System.out.println(coverString("java methods", "me") ) ; //java [me]thods
        }

        public static String coverString(String main, String coverME) {
            String result="";
            if(main.contains(coverME)){

result=main.replace(coverME,"["+coverME+"]");






            }else{result="["+main+"]";}

            return result;
        }


    }
