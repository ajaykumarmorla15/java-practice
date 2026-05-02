import java.util.Scanner;
public class Gradebymarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter telugu marks : ");
        int tel = sc.nextInt();
        System.out.println("Enter hindi marks : ");
        int hin = sc.nextInt();
        System.out.println("Enter maths marks : ");
        int mat = sc.nextInt();
        System.out.println("Enter english marks : ");
        int eng = sc.nextInt();
        System.out.println("Enter biology marks : ");
        int bio = sc.nextInt();
        double avg = (tel+hin+mat+eng+bio)/5;
        if(avg>=90){
            System.out.println("A grade");
        }else if(avg>=75){
            System.out.println("B grade");
        }else if(avg>=50){
            System.out.println("C grade");
        }else {
            System.out.println("FAIL");
        }

    }
    
}
