package functions;
import java.util.Scanner;
public class F12_pythagoreantriplet {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the first number  :  ");
        int a = in.nextInt();
        System.out.print("enter the first number  :  ");
        int b = in.nextInt();
        System.out.print("enter the first number  :  ");
        int c = in.nextInt();
        int max = maximmum(a,b,c);
        if (max == a){
            System.out.println("the maximum number here is  a");
            boolean ch = triplet(b,c,a);
            System.out.println("is it true that this is pythagorean triplet?  :  " + ch);
        }
        if (max == b){
            System.out.println("the maximum number here is  b");
            boolean ch = triplet(a,c,b);
            System.out.println("is it true that this is pythagorean triplet?  :  " + ch);
        }
        if (max == c){
            System.out.println("the maximum number here is  c");
            boolean ch = triplet(a,b,c);
            System.out.println("is it true that this is pythagorean triplet?  :  " + ch);
        }
    }
    public static boolean triplet(int first, int second, int third){
        int res = (first*first) + (second*second);
        int res1 = (third*third);
        if (res==res1){
            return true;
        }
        return false;
    }
    public static int maximmum(int a, int b, int c){
        int max = a;
        if (max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        return max;
    }
}
