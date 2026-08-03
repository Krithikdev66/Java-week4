package P1;

import java.util.Arrays;
import java.util.Scanner;

public class Pract3 {
    public static void main(String[] args){
        // int[] a={1,2,3,4,5};
        Scanner s=new Scanner(System.in);
        int[][] a=new int[2][2];
        System.out.println("enter the array elements:");
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}

