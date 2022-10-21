package coe318.lab6;

/**
 *
 * @author Battl
 */
public class Node {
    private int id = 0;
    private static int nextId = 1;
    
    @Override
    public String toString () {
        return Integer.toString(id);
    }
    public Node () {
        id = nextId;
        nextId ++;
    }
     public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        System.out.println("b: " + b);
        System.out.println("a: " + a);
        System.out.println("c: " + c);
    }

}
