import java.util.Scanner;
public class Reminderof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter value 2 : ");
        int num2 =sc.nextInt();
        if(num1>num2){
            int rem =num1%num2;
            System.out.println("Remainder of "+num1 +" and "+num2+" is "+rem);
        }else{
            System.out.println("Please enter valid inputs value2 must smaller then value1.");
        }
        sc.close();

    }
    
}
