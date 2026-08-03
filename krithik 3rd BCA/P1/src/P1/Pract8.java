package P1;

import java.util.Scanner;
import java.util.Arrays;

public class Pract8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] a=new int[2][2];
        int row=a.length;
        int column=a[0].length;
        int[][] b= new int[column][row];
        System.out.println("enter the array elements:");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                b[j][i]=a[i][j];
            }}
            System.out.println(Arrays.deepToString(b));


    }
}
