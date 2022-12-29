package exercise;

public class arrays {
    public static void main(String args[]) {
        int arr[] = {12, 64, 23, 35,2, 67, 9, 11};
        System.out.println("Reverse Array: ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
