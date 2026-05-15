package functions;
import java.util.Scanner;
public class F5_product {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number  :  ");
        int first = in.nextInt();
        System.out.print("enter the second number  :  ");
        int second = in.nextInt();
        int res = product(first,second);
        System.out.println("the product of entered numbers is  :  "+ res);
    }
    public static int product(int first, int second){
        return first*second;
    }
}
