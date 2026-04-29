import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int rev=0;
        int original = num;
        while(num>0){
            int digit=num%10;
            rev =rev*10+digit;
            num=num/10;
        }
        if(original==rev){
            System.out.println(original+" is a palindrome number.");
        }else{
            System.out.println(original+" is not a palindrome number.");
        }
        sc.close();
    }
}
