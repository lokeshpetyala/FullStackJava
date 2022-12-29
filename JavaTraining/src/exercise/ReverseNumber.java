package exercise;

public class ReverseNumber {
    public static void main(String args[]){
        int number=1234;
        int result=0;
        while(number>0){
            result = result*10+number%10;
            number=number/10;
        }
        System.out.println(result);
    }
}
