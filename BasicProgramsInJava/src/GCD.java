import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int gcd=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the value of Y");
        int y =scanner1.nextInt();

        for(int i=1;i<=x || i<=y;i++)
        {
            if(x%i==0 && y%i==0)
                gcd=i;
        }

        System.out.println("GCD of x and y is:"+gcd);
    }

}
