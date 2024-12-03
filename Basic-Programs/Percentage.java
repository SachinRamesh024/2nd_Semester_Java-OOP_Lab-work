import java.util.Scanner;
public class Percentage {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int total = 500;
            System.out.println("enter the marks of English: ");
            float a = sc.nextFloat();
            System.out.println("Enter the marks of Physics: ");
            float b = sc.nextFloat();
            System.out.println("Enter the marks of Maths: ");
            float c = sc.nextFloat();
            System.out.println("Enter the marks of chemistry: ");
            float d = sc.nextFloat();
            System.out.println("Enter the marks of Biology: ");
            float e = sc.nextFloat();

            float per = (a + b + c + d + e)/total * 100;
            System.out.println(per);
        }
    }


