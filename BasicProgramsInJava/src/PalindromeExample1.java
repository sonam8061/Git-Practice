import java.util.Scanner;
public class PalindromeExample1
{
    public static void main(String[] args) {
        int rev =0,r,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check if it's palindrome or not");
       int num = scanner.nextInt();
       temp=num;
       while(num > 0)
       {
           r = num %10;
           rev = rev*10 + r;
           num = num/10;
       }
       if(temp == rev)
           System.out.println(rev+ " is a palindrome number");
       else
           System.out.println(rev+ " is not a palindrome number");


    }
}
