package coe318.lab7;

    /**
     * A Resistor class
     * 
     */
public class Resistor implements Component{
    // instance variables
    static int num = 1;
    private final int id = num;
    private int node1;
    private int node2;
    private double value;
    
    /**
    * A resistor
    * 
    * @param in user input
    */
    public Resistor (String in) {
        String[] s = in.split(" ");
        node1 = Integer.parseInt(s[1]);
        node2 = Integer.parseInt(s[2]);
        value = Double.parseDouble(s[3]);
        if (node1 == node2)
            throw new IllegalArgumentException("Node cannot be the same");
        num ++;
    }
    
    @Override
    public String toString () {
        return "R" + id + " " + node1 + " " + node2 + " " + value;
    }
}
