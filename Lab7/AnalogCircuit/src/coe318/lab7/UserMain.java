package coe318.lab7;
import java.util.*;

    /**
     * 
     * User Main class
     * 
     */
public class UserMain {
    // instance variables
    static ArrayList arr = new ArrayList<Component>(); 
    private static int snode = 0;
    private static int enode = 0;
    private static int high = 0;

    /**
     * Adds component to ArrayList
     * 
     * @param c component
     * 
     */
    public static void add (Component c) {
        arr.add(c);
    }
    
    /**
     * Identifies nodes, organizes nodes, and keeps track of the continuity of the circuit
     * 
     * @param in user input
     * 
     * @return user input but organized
     */
    public static String findNode (String in) {
        String[] s = in.split(" ");
        if (Integer.parseInt(s[1]) > Integer.parseInt(s[2])) {
            String a = s[1];
            s[1] = s[2];
            s[2] = a;
            if (s[0].equalsIgnoreCase("v"))
                s[3] = "-" + s[3];
        }
        if (snode == 0 && enode == 0) {
            snode = Integer.parseInt(s[1]);
            enode = Integer.parseInt(s[2]);
        }
        if (Integer.parseInt(s[2]) == enode + 1 && Integer.parseInt(s[1]) == snode + 1) {
            enode ++;
            snode ++;
        }
        if (Integer.parseInt(s[2]) > high) {
            high = Integer.parseInt(s[2]);
        }
        return s[0] + " " + s[1] + " " + s[2] + " " + s[3];
    }
    
    /**
     * Determines if the circuit is complete 
     * 
     * @return Statement about continuity
     */
    public static String complete () {
        if (enode < high)
            return "Circuit is incomplete";
        return "Circuit is complete";
    }
    
    /**
    *
    * @param args the command-line arguments
    *
    */
    public static void main (String[] args) {
        Scanner stdin = new Scanner (System.in);
        String in;
        while(true) {
            in = stdin.nextLine();
            if (in.compareToIgnoreCase("spice") == 0) {
                for (int i = 0; i < arr.size(); i ++)
                    System.out.println(arr.get(i));
            }
            else if (in.compareToIgnoreCase("end") == 0) {
                System.out.println("All Done");
                System.out.println(complete());
                System.out.println(enode + " " + enode + " " + high);
                break;
            }
            else if (Component.verify(in) == true) {
                in = findNode(in);
                arr.add(Component.identify(in));
            }
        }
    }
}
