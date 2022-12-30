package exercise;

import java.util.Arrays;

//import static sun.net.www.http.KeepAliveCache.result;

public class CompareArray {
    public static void main(String []args){
        int[] array1 = {1,3,6,2};
        int[] array2 = {3,1,5,4};
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++) {
                if (array1[i] == (array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
