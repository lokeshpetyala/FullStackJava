package exercise;

public class NumberOfDigits {
    public static void main(String args[]){
        int input = 4536;
        if(input>=0 && input<=9)
            System.out.println("Input is Single Digit");
        else if (input>=10 && input<=99)
            System.out.println("Input is Two Digit");
        else if (input>=100 && input<=999)
            System.out.println("Input is Three Digit");
        else if (input>=1000 && input<=9999)
            System.out.println("Input is Thrree Digit");
    }
}
