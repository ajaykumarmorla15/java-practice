import java.util.Scanner;
public class LargestDigitInNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int max=0,orignal=num;
        while(num>0){
            int digit = num%10;
            if(digit>max){
                max=digit;
            }
            num=num/10;
        }
        System.out.println("Largest digit in "+orignal+" is "+max);
        sc.close();
    }
    
}
