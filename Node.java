import java.io.Serializable;

public class Node<T>  implements Serializable {
    private static final long serialVersionUID =1L;
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
