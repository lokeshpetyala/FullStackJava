package exercise;

public class AverageOfArray {
    public static void main(String []args){
        int input[]= {1,2,3,4,5,6};
        int size = input.length;
        //System.out.println(size);
        float avg = input[0]+input[1]+input[2]+input[3]+input[4]+input[5];
        System.out.println(avg/size);
    }
}
