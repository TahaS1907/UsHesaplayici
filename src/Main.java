import java.util.Scanner;

public class Main {
    public static void pow(){
        int number=1,base;
        double radix;
        Scanner sacnner=new Scanner(System.in);

     while(number!=0){
         System.out.println("Please enter a radix(set radix 0 to end the loop) :");
         number= sacnner.nextInt();
         System.out.println("Please enter a base :");
         base= sacnner.nextInt();
         radix=Math.pow(number,base);
         System.out.println("result="+radix);

     }System.out.println("The cycle is over");


    }
    public static void main(String[] args) {
        pow();
    }
}