public class Factorial {

    public static void factorial(int n)    //or public void factorial() (if you don't use static in the method then follow this
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {

        factorial(4);                           //Factorial obj = new Factorial();
                                                     //obj.factorial(4)
    }
}
