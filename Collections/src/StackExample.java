import java.util.Stack;
import java.util.Iterator;
public class StackExample
{

    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();
        if(stk.empty()) {
            System.out.println("Stack is empty");    //checking if stack is empty
        }
            else
            System.out.println("Stack is not empty");
        //pushing elements into stack
        stk.push("Sonam");
        stk.push("Poonam");
        stk.push("Sujit");
        stk.push("Ashok");

         //printing the elements of stack
        System.out.println("elements of the stack are:"+stk);

        //popping the elements of stack
        stk.pop();
        stk.pop();
        stk.push("Shatabdi");
        stk.push("Pallabi");

        System.out.println("elements of stack after popping"+stk);
        System.out.println("The element at the top of the stack is:"+stk.peek());
        System.out.println("Position of element name 'sonam' is:"+stk.search("sonam"));
        System.out.println("size of the stack is:"+stk.size());

        Iterator iterator =  stk.iterator();
        while(iterator.hasNext()){
            Object values = iterator.next();
            System.out.println(values);
        }


    }


}
