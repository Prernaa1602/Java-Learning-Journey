package functions;
import java.util.Scanner;
public class F4_sum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter first number  :  ");
        int first = in.nextInt();
        System.out.print("enter second number  :  ");
        int second = in.nextInt();
        int sum = additionn(first, second);
        System.out.println("the sum of both the numbers is : " + sum);
    }
    public static int additionn(int first, int second){
        return first+second ;
    }
}
