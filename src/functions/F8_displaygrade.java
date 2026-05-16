package functions;
import java.util.Scanner;
public class F8_displaygrade {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 to know your grade  : ");
        int marks = in.nextInt();
        grade(marks);
    }
    public static void grade(int m){
        if (91<=m && m<=100){
            System.out.println("Your grade is  :  AA");
        } else if (81<=m && m<=90){
            System.out.println("Your grade is  :  AB");
        }else if (71<=m && m<=80){
            System.out.println("Your grade is  :  BB");
        }else if (61<=m && m<=70){
            System.out.println("Your grade is  :  BC");
        }else if (51<=m && m<=60){
            System.out.println("Your grade is  :  CD");
        }else if (41<=m && m<=50){
            System.out.println("Your grade is  :  DD");
        }else if (m<=40){
            System.out.println("Your grade is  :  FAIL");
        }
    }
}
