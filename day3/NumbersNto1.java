import java.util.Scanner;
public class NumbersNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        System.out.println("Numbers from "+n+" to 1 : ");
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
        sc.close();

    }
    
}
