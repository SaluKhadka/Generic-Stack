
package genericstack;

class StackNode<T>{
    public StackNode next;
    public T data;
    
    public StackNode(){
        next = null;
    }
    
    public StackNode(T data){
        this.next = null;
        this.data = data;
    }
   
}