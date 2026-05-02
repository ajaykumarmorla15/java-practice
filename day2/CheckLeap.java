import java.util.Scanner;
public class CheckLeap {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sb.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+" is  leap year.");
        }else{
            System.out.println(year+" is not Leap year.");
        }
        sb.close();
    }
    
}
