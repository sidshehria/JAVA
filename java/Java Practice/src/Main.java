import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //loops
        Scanner sc = new Scanner(System.in);

//        int number =0;
//        do{
//            System.out.println("Input a number: ");
//            number = sc.nextInt();
//            System.out.print("here is your number :");
//            System.out.println(number);
//        }while(number > 0);
//
//        System.out.println("THE END");

        //break and continue
        int i = 0 ;
        while(true){
            if(i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }
        }
    }

}
