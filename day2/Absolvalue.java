import java.util.Scanner;
public class Absolvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int val = sc.nextInt();
        if(val<0){
            val=-val;
            System.out.println("Absolute value of given number is : "+val);
        }else{
            System.out.println("Absolute value of given number is : "+val);
        }
        sc.close();
    }
    
}
