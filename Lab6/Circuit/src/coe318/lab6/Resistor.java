
package coe318.lab6;

/**
 *
 * @author Battl
 */
public class Resistor {
    private double res = 0;
    private Node n1;
    private Node n2;
    private int id = 0;
    private static int nextId = 1;
    public Resistor (double resistance, Node node1, Node node2) {
        if (resistance <= 0)
            throw new IllegalArgumentException("can't be negative");
        res = resistance;
        n1 = node1;
        n2 = node2;
        id = nextId;
        nextId ++;
    }
    public Node [] getNodes () {
        Node [] n = new Node[2];
        n[0] = n1;
        n[1] = n2;
        return n;
    }
    @Override
    public String toString () {
        return "R" + Integer.toString(id) + " " + n1 + " " + n2 + " " + Double.toString(res);
    }
         public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Resistor i = new Resistor(-1,a,b);
        System.out.println(i);
        Resistor j = new Resistor(10,b,c);
        System.out.println(j);
    }

}
