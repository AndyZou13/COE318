package coe318.lab6;

/**
 *
 * @author Battl
 */
public class main {
    
    public static void main (String[] args) {
        Circuit circ = Circuit.getInstance();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Resistor r1 = new Resistor(1, n1, n2);
        for (Node n: r1.getNodes())
            System.out.println(n);
        Resistor r2 = new Resistor(2, n2, n3);
        for (Node n: r2.getNodes())
            System.out.println(n);
        circ.add(r1);
        circ.add(r2);
        System.out.println(circ);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}
