import java.util.Scanner;
public class SimpleIntersetCalculator {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter princpal : ");
        int princpal = sc.nextInt();
        System.out.println("Enter Time : ");
        int time = sc.nextInt();
        System.out.println("Enter Rate : ");
        int rate = sc.nextInt();

        //simple interest
        int sp;
        sp =(princpal*time*rate)/100;
        System.out.println(sp);    
        sc.close();
    }
    
}
