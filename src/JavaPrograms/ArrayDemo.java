package JavaPrograms;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};

        System.out.println(a[0]);
        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Index"+ i +":"+a[i]);
        }

        System.out.println(Arrays.toString(a));
    }
}
