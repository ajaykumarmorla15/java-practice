import java.util.Scanner;
public class Swap2NumbersWithoutThirdVariable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter value 2 : ");
        int num2 =sc.nextInt();
        //swap two numbers without third variable
        int num1a = num1;
        int num2a = num2;

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1 - num2;
        System.out.println("Swapping without third variable : ");
        System.out.println("Swap of "+num1a+" is "+num1);
        System.out.println("Swap of "+num2a+" is "+num2);
        sc.close();
    }
    
}
