package P1;
import java.util.Scanner;
import java.util.Arrays;

public class Pract1 {
    public static void main(String[] args){
      //  int[] a={1,2,3,4,5};
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("enter the array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
