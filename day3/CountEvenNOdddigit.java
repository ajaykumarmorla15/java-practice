import java.util.Scanner;
public class CountEvenNOdddigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int even=0,odd=0;
        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            num = num/10;
        }
        System.out.println("Even digits : "+even+"\nOdd digits : "+odd);
        sc.close();
    }
    
}
