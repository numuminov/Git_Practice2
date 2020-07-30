package officehours.Forloop;

public class EvenNumbers1000 {
    public static void main(String[] args) {
        for(int i=0;i<=1000;i=i+2){
          System.out.print(i);
        }
        System.out.println();

        for(int i1=0;i1<=1000;i1++){if(i1%2==0) System.out.print(i1+" ");}
        System.out.println();

        for(int q=0;q<=1000;q++){if(q%2==1) System.out.print(q+" ");}

        System.out.println();

        for(char w=97;w<=122;w++){
            System.out.print(w +" ");}
        System.out.println();
        for(char e='A';e<='Z';e++){
            System.out.print(e);}
        System.out.println();
        for(int r=1; r*r<=r*10;r++){
            System.out.println(r*r);
        }
        System.out.println();
        for(int i3=2;i3<=100;i3=i3+1){if(i3%2==0)System.out.print(i3+",");}








    }
}
