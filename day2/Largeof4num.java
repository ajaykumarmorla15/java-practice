import java.util.Scanner;
public class Largeof4num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter value 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter value 3 : ");
        int num3 = sc.nextInt();
        System.out.println("Enter value 4 : ");
        int num4 = sc.nextInt();
        if(num1>num2 && num1>num3 && num1>num4){
            System.out.println(num1+" is largest.");
        }else if (num2>num1 && num2>num3 && num2>num4){
            System.out.println(num2+" is Largest.");
        }else if (num3>num1 && num3>num2 && num3>num4){
            System.out.println(num3+" is Largest.");
        }else if (num4>num1 && num4>num3 && num4>num2){
            System.out.println(num4+" is Largest.");
        }else{
            System.out.println("Please enter valid inputs.");
        }
        sc.close();
    }
    
}
