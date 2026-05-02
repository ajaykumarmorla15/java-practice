import java.util.Scanner;
public class checkmulof7n11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num%7==0 && num%11==0){
            System.out.println(num+" is divisble by both 7 and 11.");
        }else if(num%7==0 && num%11!=0){
            System.out.println(num+" is divisble by 7 but not with 11.");
        }else if(num%7!=0 && num%11==0){
            System.out.println(num+" is divisble by 11 but not with 7.");
        }else{
            System.out.println("please enter valid inputs.");
        }
        sc.close();
    }
}
