import java.util.Scanner;
public class FibanacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =sc.nextInt();
        int f1=0,f2=1;
        while(f1<=num){
            System.out.println(f1);
            int fab =f1+f2;
            f1=f2;
            f2=fab;
        }
        sc.close();
       
    }  
}
