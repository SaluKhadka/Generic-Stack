
package genericstack;

public class GenericStack {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(12.5);
        stack.push("sujin daka");
        
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
        
    }
    
}
