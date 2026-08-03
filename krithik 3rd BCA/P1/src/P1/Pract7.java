package P1;

import java.util.Scanner;
import java.util.Arrays;

public class Pract7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] a=new int[2][2];
        System.out.println("enter the array elements:");
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
        for(int j=0;j<a.length;j++){
            int rowSum=0;
            for(int i=0;i<a[j].length;i++){
                rowSum=rowSum+a[i][j];
            }
            System.out.println(rowSum);
        }

    }
}
