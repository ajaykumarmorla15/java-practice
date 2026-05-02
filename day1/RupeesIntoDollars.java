import java.util.Scanner;
public class RupeesIntoDollars {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rupees amount : ");
        int rupees = sc.nextInt();
        //convert rupees in to dollar
        int dollar = 83;
        int total = rupees/dollar;
        System.out.println("Dollars amount : "+total);    
        sc.close();
    }
    
}
