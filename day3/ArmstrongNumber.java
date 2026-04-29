import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int count=0,sum=0,original =num;
        int temp=num;
        while(temp>0){
            count++;
            temp=temp/10;
            
        }
        while(num>0){
            int digit = num%10;
            sum +=Math.pow(digit,count);
            num=num/10;
        }
        if(original==sum){
            System.out.println(original+" is a armstrong number.");
        }else{
            System.out.println(original+" is not a armstrong number.");
        }
        sc.close();
    }
    
}
