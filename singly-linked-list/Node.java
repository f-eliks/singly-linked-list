/**
 *
 * @author felix
 * @param <T>
 */
public class Node<T>{
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
    }
    
    @Override
    public String toString(){
        return this.data.toString();
    }

    public T getData() {
        return this.data;
    }  
   
    public boolean greaterThan(Node<T> k2){
        if(this.data instanceof Number) return ((int)this.data) > ((int)k2.getData());
        else return false;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    
}
