import java.util.Scanner;
public class Elgiblevote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Are you Citizen of this state or not(true or false) : ");
            boolean citi = sc.nextBoolean();
            if(citi){
                System.out.println("You are eligible to vote.");
            }else{
                System.out.println("You are not eligible to vote in this state.");
            }
        }else{
            System.out.println("Sorry! you are not eligible at your age.");
        }
        sc.close();
    }
    
}
