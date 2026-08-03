package P1;

import java.util.Scanner;
import java.util.Arrays;

public class Pract9 {
    public static void main(String[] args) {
        int num;
        int digit=0,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        num=s.nextInt();
        while(num!=0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println("sum:"+sum);

    }
}
