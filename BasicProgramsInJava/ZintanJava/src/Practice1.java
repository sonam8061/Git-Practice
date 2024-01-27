public class Practice1 {
    int e;
    public Practice1(int x){
        e=x;
    }
    public void C(){
        int y= 20;
        System.out.println(y);
    }
    public static void D(){
        int z= 30;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Practice1 a = new Practice1(10);
        Practice1.D();
        System.out.println(a.e);
        a.C();
    }
}

class A{
    public static int B(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        int d = A.B(10,20);
        System.out.println(d);
    }
}
