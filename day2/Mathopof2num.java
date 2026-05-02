import java.util.Scanner;
public class Mathopof2num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter value 2 : ");
        int num2 = sc.nextInt();
        double sum =num1+num2;
        double sub = num1-num2;
        double mul = num1 * num2;
        double div = num1/num2;
        System.out.println("Addition of "+num1+" and "+num2+" is "+sum);
        System.out.println("Subtraction of "+num1+" and "+num2+" is "+sub);
        System.out.println("MUltiplication of "+num1+" and "+num2+" is "+mul);
        System.out.println("Division of "+num1+" and "+num2+" is "+div);
        sc.close();

    }
    
}
