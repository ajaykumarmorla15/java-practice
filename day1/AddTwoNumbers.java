import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 value : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 value : ");
        int num2 = sc.nextInt();
        //add two numbers
        System.out.println("sum of "+num1+" and "+num2+" is : " +(num1+num2));  
        sc.close();
    }
    
}
