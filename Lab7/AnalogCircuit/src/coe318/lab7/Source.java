package coe318.lab7;

    /**
     * A Voltage Source class
     * 
     */
public class Source implements Component{
    // instance variables
    static int num = 1;
    private final int id = num;
    private int node1;
    private int node2;
    private double value;
    
    /**
    *
    * A voltage source
    * 
    * @param in user input
    */
    public Source (String in) {
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
        return "V" + id + " " + node1 + " " + node2 + " DC " + value;
    }
    
}
