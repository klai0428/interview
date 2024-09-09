import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 153;
        Boolean flag = false;
        flag = ArmstrongNum(num,3);
        System.out.println(flag);
    }

//        System.out.println(num%10);
//        System.out.println(num/10%10);
//        System.out.println(num/100);
    public static Boolean ArmstrongNum(int input, int n) {
        int d = input%10;
        int t = input/10%10;
        int h = input/100;
        System.out.println(d^n);
        System.out.println(t^n);
        System.out.println(h^n);
        int result = d^n + t^n + h^n;
        boolean flag = result == input;

        return flag;
    }
}