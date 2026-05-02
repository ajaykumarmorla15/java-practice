import java.util.Scanner;
public class Swap2numberswithThirdVariavle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1 : ");
        int num1 =sc.nextInt();
        System.out.println("Enter value 2 : ");
        int num2 =sc.nextInt();
        int num1a = num1;
        int num2a = num2;
        //Swap two numbers with third variable
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swapping of two numbers : ");
        System.out.println("Swap of "+num1a+" is "+num1);
        System.out.println("Swap of "+num2a+" is "+num2);
        sc.close();
        
    
    }
    
}
