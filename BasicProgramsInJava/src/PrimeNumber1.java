import javax.swing.*;
public class PrimeNumber1
{
    public static void main(String[] args) {
        int n=3;//this is the number to be checked
        int flag = 0;
        if(n==0||n==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else
        {
            for(int i =2;i<n/2;i++)
            {
                if(n % i ==0)
                    flag = 1;
                    System.out.println(n+" is not a prime number");
                break;
            }
            if(flag==0)
            System.out.println(n+" is a prime number");
        }
    }

}

