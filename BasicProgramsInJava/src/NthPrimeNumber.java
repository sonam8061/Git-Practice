import java.util.Scanner;
public class NthPrimeNumber {

    private static boolean checkPrime(int n)
    {
        int n1=0,n2=1;
        if(n==n1 || n==n2)
            return true;
        else {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                    return true;
                break;
            }
            return false;
        }
    }

    public static void findNthPrime(int n)
    {

        int count=0;
        for(int i = 1;;)
        {
               if(checkPrime(i)) {
                   count++;
                   if (count == n)
                       System.out.println(n + "th prime number is:" + i);
                       break;
               }
               else
                   i++;
        }


    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n to find the nth prime number");
        int n = scanner.nextInt();
        findNthPrime(n);

    }
}
