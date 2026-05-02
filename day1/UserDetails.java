import java.util.Scanner;
public class UserDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name : ");
        String name = sc.next();
        System.out.println("Enter a age : ");
        int age = sc.nextInt();
        System.out.println("Enter a height : ");
        float height = sc.nextFloat();
        System.out.println("Enter a city : ");
        String city = sc.next();
        System.out.println("Enter a gender : ");
        String gender = sc.next();

        //full details
        System.out.println("User Details : ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height : "+height);
        System.out.println("Gender : "+gender);
        System.out.println("City : "+city); 
        sc.close();
    }
}