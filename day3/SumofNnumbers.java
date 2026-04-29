import java.util.Scanner;
public class SumofNnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("SUm of "+n+" number is : "+sum);
        sc.close();
    }
}
