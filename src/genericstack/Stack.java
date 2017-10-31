
package genericstack;

public class Stack<T> {
    private StackNode top;
    
    public Stack(){
        top = null;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void push(T data){
        StackNode node = new StackNode(data);
        node.next = top;
        top = node;       
    }
    
    public T pop(){
        if(isEmpty())
            return null;
        T data = (T) top.data;
        StackNode ptr = top;
        top = ptr.next;
        return data;
    }
    
    
}
