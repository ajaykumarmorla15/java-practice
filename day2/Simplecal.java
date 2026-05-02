import java.util.Scanner;
public class Simplecal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1 : ");
        int val1 = sc.nextInt();
        System.out.println("Enter value 2 : ");
        int val2 = sc.nextInt();
        System.out.println("Enter an operation(+,-,*,/) : ");
        String oper = sc.next();
        if(oper.equals("+")){
            double sum = val1+val2;
            System.out.println("addition of "+val1+" and "+val2+ " is "+sum);
        }else if(oper.equals("-")){
            double sub = val1-val2;
            System.out.println("subtraction of "+val1+" and "+val2+ " is "+sub);
            
        }else if(oper.equals("*")){
            double mul = val1*val2;
            System.out.println("multiplition of "+val1+" and "+val2+ " is "+mul);
        }else if (oper.equals("/")){
            double div = val1/val2;
            System.out.println("Division of "+val1+" and "+val2+ " is "+div);
        }else{
            System.out.println("Please enter valid operation.");
        }
        sc.close();
    }
    
}
