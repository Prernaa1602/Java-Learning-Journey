package functions;
import java.util.Scanner;
public class F2_evenodd {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number which you want to check if it odd or even");
        int num = in.nextInt();
        letscheck(num);
    }
    public static void letscheck(int num){
        if (num%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
