import java.util.Scanner;
public class Diviby3r5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = sc.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println(num+" is divisble by either 3 or 5.");
        }else{
            System.out.println(num+" is not divisble by both numbers.");
        }
        sc.close();
    }
    
}
