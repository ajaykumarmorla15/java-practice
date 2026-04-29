import java.util.Scanner;
public class MultiplicationTableforUserInputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter required table number : ");
        int num = sc.nextInt();
        System.out.println(num+" Table : ");
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        sc.close();
    }
    
}
