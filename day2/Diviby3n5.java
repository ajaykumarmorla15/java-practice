import java.util.Scanner;
public class Diviby3n5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num%5==0 && num%3==0){
            System.out.println(num+" is divisble by both 3 and 5.");

        }else if(num%3==0 && num%5!=0){
            System.out.println(num+" is divisble by 3 but not with 5.");
        }else if(num%3!=0 && num%5==0){
            System.out.println(num+" is divisble by 5 but not with 3.");
        }else {
            System.out.println(num+" is not divisble by both numbers.");
        }
        sc.close();
    }
    
}
