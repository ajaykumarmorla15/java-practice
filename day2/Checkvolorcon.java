import java.util.Scanner;
public class Checkvolorcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        String cha = sc.next();
        if(cha.length()==1){
            cha = cha.toUpperCase();
            if (cha.equals("A") || cha.equals("E") || cha.equals("I") ||cha.equals("O") || cha.equals("U")) {
                System.out.println(cha+" is vowel.");
             }else{
                System.out.println(cha+" is Consonent.");
            }
        }else{
            System.out.println("Please enter single character.");
        }
        sc.close();

    }
}
