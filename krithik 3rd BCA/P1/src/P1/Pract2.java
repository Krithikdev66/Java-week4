package P1;

import java.util.Arrays;
import java.util.Scanner;

public class Pract2 {
    public static void main(String[] args){
   // int[] a={1,2,3,4,5};
    Scanner s=new Scanner(System.in);
    String[] a=new String[5];
    System.out.println("enter the array elements:");
    for(int i=0;i<a.length;i++){
        a[i]=s.next();
    }
    System.out.println(Arrays.toString(a));
}
}

