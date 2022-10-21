
package coe318.lab7;

    /**
     * Component interface
     * 
     */
public interface Component {

    /**
     * Verifies if input is valid entry
     * 
     * @param in user input
     * 
     * @return true or false
     */
    public static boolean verify (String in) {
        String[] s = in.split(" ");
        if (s.length != 4)
            throw new IllegalArgumentException("Invalid Input");
        if (s[0].equalsIgnoreCase("r")) {
            try {  
                Integer.parseInt(s[1]);  
                Integer.parseInt(s[2]); 
                Double.parseDouble(s[3]); 
                return true;
            }
            catch(NumberFormatException e){  
                return false;  
            }
        }
        else if (s[0].equalsIgnoreCase("v")) {
            try {  
                Integer.parseInt(s[1]);  
                Integer.parseInt(s[2]); 
                Double.parseDouble(s[3]); 
                return true;
            }
            catch(NumberFormatException e){  
                return false;  
            }
        }   
        return false;
    }
    
    /**
     * Identifies if input is a resistor or voltage source
     * 
     * @param in user input
     * @return new resistor or voltage source
     */
    public static Component identify(String in) {
        String[] s = in.split(" ");
        if (s[0].equalsIgnoreCase("r"))
            return new Resistor(in);
        return new Source(in);
    }
}
