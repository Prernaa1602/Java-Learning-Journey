package functions;
import java.util.Scanner;
public class F1_maxmin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number  :  ");
        int first = in.nextInt();
        System.out.println("enter first number  :  ");
        int second = in.nextInt();
        System.out.println("enter first number  :  ");
        int third = in.nextInt();
        int maximum = maxx(first,second,third);
        System.out.println("maximum number from  all three is :  "+ maximum);
        int minimum = minn(first,second,third);
        System.out.println("maximum number from  all three is :  "+ minimum);
    }
    public static int maxx(int a, int b, int c){
        int max = a;
        if (b>max){
            max=b;
        }
        if (c>max){
            max=c;
        }
        return max;
    }

    public static int minn(int a, int b, int c) {
        int min = a;
        if (b<min){
            min = b;
        }
        if (c<min){
            min= c;
        }
        return min;

    }
}
