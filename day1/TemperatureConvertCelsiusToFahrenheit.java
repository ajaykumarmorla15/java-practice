import java.util.Scanner;
public class TemperatureConvertCelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature(in Celsius) : ");
        int celsius = sc.nextInt();
        //convert temperature celsius in to fahrenheit
        float fah;
        fah = (celsius*9/5+32);
        System.out.println("Fahrenheit is : "+fah);    
        sc.close();

    }
    
}
