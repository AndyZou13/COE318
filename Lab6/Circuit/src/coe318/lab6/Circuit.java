package coe318.lab6;
import java.util.*;
/**
 *
 * @author Battl
 */
public class Circuit {
    private static Circuit instance = null; 
    private ArrayList <Resistor> res = new ArrayList<Resistor>();
    public static Circuit getInstance() {
        if (instance == null){ 
            instance = new
            Circuit();
        }
    return instance;
    }
    
    private Circuit () {
    }
    public void add (Resistor r) {
        res.add(r);
    }
    public String toString () {
        String s = "";
        for (Resistor r : res) {
            s += r;
            s += " \n";
        }
        return s;
    }
        public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Resistor i = new Resistor(1,a,b);
        System.out.println(i);
        Resistor j = new Resistor(10,b,c);
        System.out.println(j);
        Circuit x = Circuit.getInstance();
        x.add(j);
        x.add(i);
        System.out.println(x);

    }

}
