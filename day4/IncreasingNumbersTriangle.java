import java.util.Scanner;
public class IncreasingNumbersTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nomber : ");
        int n = sc.nextInt();
        int num =1;
        if(n<=0){
            System.out.println("Please enter positive valid numbers.");
        }else{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }
                System.out.println(" ");
            }
        }
        sc.close();
    }
    
}
