import java.util.Scanner;

public class Posorneg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num>0){
            System.out.println(num+" is postivie number.");
        }else if(num<0){
            System.out.println(num+" is negative number.");
        }else{
            System.out.println(num+" is Zero");
        }
        sc.close();
    }
    
}
