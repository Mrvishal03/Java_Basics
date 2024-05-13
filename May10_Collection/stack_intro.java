package May10_Collection;

import java.util.Stack;

public class stack_intro {
    public static void main(String[] args) {
    
         Stack<Integer> stk=new Stack<>();
         stk.push(23);
         stk.push(67);
         stk.push(34);
         stk.push(45);
        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        
 
        String str= "{(([{}]))}";
        
        
    }
    
}
