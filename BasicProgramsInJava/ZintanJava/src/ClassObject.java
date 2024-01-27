public class ClassObject {
    static int x;
    int y;

    public ClassObject(int c, int d)
    {
        x = c;
        y = d;
        System.out.println("Hi! I'm Zaid");
    }

    public static void main(String[] args) {
        int z = 30;
        ClassObject a = new ClassObject(10, 20);
        System.out.println(z);         // static, non-static and local variable
        System.out.println(a.y);
        System.out.println(ClassObject.x);
    }
}

class Rectangle {
    int length;
    int breadth;

    public Rectangle(int e, int f) {
        length = e;
        breadth = f;
    }

    public int Area() {

        return length * breadth;
    }

    public int Sum() {
        int s = length + breadth;
        return s;
    }

    public void Perimeter() {
        int peri = 2 * (Sum());
        System.out.println(peri);

    }

    public static void main(String[] args) {
        Rectangle b = new Rectangle(10, 20);
        Rectangle g = new Rectangle(30, 20);
        System.out.println(b.Area());
        b.Perimeter();
        System.out.println(g.Area());
        g.Perimeter();
    }
}

class Employee{
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("These are employeees");
    }
    public static void main(String[] args) {
        Employee thoi = new Employee(1, "chutiya");
        Employee zaidwa = new Employee(2, "perfecct");
        System.out.println(thoi.id);
        System.out.println(thoi.name);
        System.out.print(zaidwa.id);
        System.out.print(zaidwa.name);
        System.out.println("employee id and name is " + thoi.id + "," + thoi.name);
    }



}


