package functions;
import java.util.Scanner;
public class F3_eligibility {
    public static void main( String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age of the person to check his eligibility of voting  :  ");
        int age = in.nextInt();
        eligibility(age);
    }
    public static void eligibility(int age){
        if (age>=18){
            System.out.println("this person is eligible for voting...");
        }else{
            System.out.println("this person is not eligible for voting...");
        }
    }
}
