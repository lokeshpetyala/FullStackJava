package exercise;

import java.util.Arrays;

public class CompareNumbers {
    public static void main(String []args){
        int arr[] = {1, 15, -1, 23, 45, 70, 99, -13, -5};
        Arrays.sort(arr);
        int len = arr.length;
        int highest = arr[len-1];
        int lowest = arr[0];
        int difference = highest-lowest;
        System.out.println("Sorted array: "+Arrays.toString(arr));
        System.out.println("Highest Element: "+highest);
        System.out.println("Lowest Element: "+lowest);
        System.out.println("Difference between highest and lowest Element: "+difference);

    }
}
