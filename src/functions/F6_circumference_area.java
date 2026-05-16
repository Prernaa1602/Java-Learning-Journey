package functions;
import java.util.Scanner;
public class F6_circumference_area {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle  :  ");
        int radius = in.nextInt();
        double areaa = area(radius);
        double circumferencee = circumference(radius);
        System.out.println("the area of the circle is  :  "+ areaa);
        System.out.println("the area of the circle is  :  "+ circumferencee);
    }
    public static double area(int rad){
        return 3.14*(rad*rad);
    }
    public static double circumference(int rad){
        return 2*3.14*rad;
    }

}
