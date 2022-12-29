package exercise;
import java.util.Scanner;

public class PowerofNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter base");
        int base = scan.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter power");
        int power = sc.nextInt();
        int result = 1;
        while(power>0){
            result = result*base;
            power--;
        }
        System.out.println(result);
    }
}
