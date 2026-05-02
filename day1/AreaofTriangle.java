import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        float length = sc.nextFloat();
        System.out.println("Enter Breadth : ");
        float breadth = sc.nextFloat();

        //area of rectangle
        System.out.println("Area of Rectangle : "+(length*breadth));   
        sc.close();
    }
    
}
