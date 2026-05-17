package functions;
import java.util.Scanner;
public class F10_palindrome {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number which you want to check if it palindrome or not  :  ");
        int num = in.nextInt();
        boolean ch = palindromee(num);
        System.out.println("Is it true that this is a palindrome?  : " + ch);
    }
    public static boolean palindromee(int n){
        int old = n;
        int c =0;
        while (old!=0){
            int res = old%10;
            c = (c*10) + res;
            old = old/10;
        }
        if(c==n){
            return true;
        }
        return false;
    }
}
