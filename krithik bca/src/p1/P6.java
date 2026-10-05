package p1;

import java.util.Arrays;

public class P6 {
    public static void main(String[] args) {
        int a[]={50,40,30,20,10,35};
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key) {
                a[j + 1] = a[j];
                j--;
            }
                a[j+1]=key ;
            }

            System.out.println(Arrays.toString(a));
        }
    }


