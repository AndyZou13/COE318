/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    Counter c;
    int mod;
    int n;
    public Counter(int modulus, Counter left) {
        mod = modulus;
        c = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return c;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return n;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        n = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        n++;
        if (c != null && n == mod) {
            c.increment();
            n = n % mod;
        }
        else if (n == mod) {
            n = n % mod;
        }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (c != null) {
            Counter next = this;
            int p = 1;
            int number = 0;
            for (int i = 0; next != null; i ++) {
                for (int j = 0; j < i; j ++) {
                    p = p * mod;
                }
                number = number + next.getDigit() * p;
                next = next.getLeft();
            }
            return number;
        }
        return n;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
