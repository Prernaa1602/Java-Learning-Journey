package functions;
import java.util.Scanner;
public class F9_factorial {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of which you wanna find factorial  :  ");
        int num = in.nextInt();
        int fact = factorial(num);
        System.out.println("the factorial of this number is  :  " + fact);
    }
    public static int factorial(int no){
        if (no ==1){
            return 1;
        }
        int flag = 0;
        flag = no* factorial(no-1);
        return flag;
    }
}
