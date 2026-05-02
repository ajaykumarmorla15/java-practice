import java.util.Scanner;
public class Passorfail {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();
        if(marks>=35){
            System.out.println("You are pass.");
        }else if(marks<0){
            System.out.println("Please enter valid marks.");
        }else{
            System.out.println("You are Fail,improve next time.");
        }
        sc.close();
        

    }
    
}
