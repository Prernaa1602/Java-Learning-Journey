package functions;
import java.util.Scanner;
public class F14_sumofnnumbers {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number to get sum till number itself: ");
        int num = in.nextInt();
        int sum = additionn(num);
        System.out.print("the sum of first natural number is  :  " + sum);
    }
    public static int additionn(int number){
        int res = 0;
        int numm = 1;
        while (numm!=number+1){
            res = res+ numm;
            numm++;
        }
        return res;
    }
}
