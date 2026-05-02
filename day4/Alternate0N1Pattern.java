import java.util.Scanner;
public class Alternate0N1Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numebr : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int val = i%2;
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val =1-val;
            }
            System.out.println(" ");
        }
    } 
}
