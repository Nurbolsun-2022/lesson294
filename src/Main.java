import javax.script.ScriptContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Scanner sc1 = new Scanner(System.in);
         int number = sc1.nextInt();
         String a = sc.nextLine();
        switch (a){
            case "*":
                umnajenie(number,sc.nextInt());
                break;

            case "+":
                plus(number,sc.nextInt());
                break;

            case "-":
                minus(number,sc.nextInt());
                break;


            case "/":
                delenie(number, sc.nextInt());
                break;


            case "%":
                kalduk(number, sc.nextInt() );
                break;
            default:
                System.out.println("chyk eshike");
        }
    }


    public static void umnajenie (int a, int b){
        int sum =a*b;
        System.out.println(sum);
    }
    public static void plus (int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void minus(int a, int b){
        int sum = a-b;
        System.out.println(sum);
    }
    public static void delenie(int a, int b){
        int sum =a/b;
        System.out.println(sum);
    }
    public static void kalduk(int a , int b){
        int sum= a%b;
        System.out.println(sum);
    }
}
