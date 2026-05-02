import java.util.Scanner;
public class ASCIIValueofCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        String chr = sc.next();
        //ASCII value of a character
        if(chr.length()==1){
            char chra=chr.charAt(0);
            System.out.println("ASCII value of "+chr+" is "+((int)chra)); 

        }else{
            System.out.println("Please enter single character.");
        }
        
        sc.close();
    }
    
}
