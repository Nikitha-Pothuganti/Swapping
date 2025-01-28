import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);{
            System.out.println("Enter 1st value: ");
            int a = src.nextInt();
            System.out.println("Enter 2nd value: ");
            int b=src.nextInt();
            System.out.println("Before Swapping Numbers:- ");
            System.out.println(a);
            System.out.println(b);
            int temp=a;
            a=b;
            b=temp;
            System.out.println("After Swapping Numbers:- ");
            System.out.println(a);
            System.out.println(b);
            src.close();
        }
    }
}
