import java.util.Scanner;
import java.lang.Math;
public class ArmstrongExample {

    static boolean isArmstrong(int num)
    {
       int temp,digits = 0, last = 0, armstrong =0;
       temp = num;
       while(temp>0)
       {
           temp = temp/10;
           digits++;
       }
       temp = num;
       while(temp>0)
       {
           last = temp%10;
           armstrong += (Math.pow(last,digits));
           temp = temp/10;

       }
       if(num == armstrong)
           return true;
       else
           return false;

    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check if it is armstrong or not");
         int number = scanner.nextInt();
        System.out.println(isArmstrong(number));
    }
}
