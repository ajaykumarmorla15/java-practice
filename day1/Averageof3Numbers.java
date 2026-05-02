import java.util.Scanner;
public class Averageof3Numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number-1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number-2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter number-3 : ");
        int num3 = sc.nextInt();
        //average of 3 numbers
        int sum, avg;
        sum =(num1+num2+num3);
        avg =(sum/3);
        System.out.println("Sum of 3 Numbers : "+sum);
        System.out.println("Average of 3 Numbers : "+avg);
        sc.close();
    }
    
}
