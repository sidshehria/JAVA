import java.util.Arrays;
import java.util.Scanner;
public class funmeth {

    public static void printJava(){
        System.out.println("Hello java");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printsum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        //METHODS
        printJava();
        printJava();
        printJava();
        printName("Siddharth");
        printName("Aditi");
        printsum(1,2);


    }
}
