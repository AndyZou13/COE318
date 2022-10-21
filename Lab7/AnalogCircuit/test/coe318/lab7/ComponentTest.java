package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Battl
 */
public class ComponentTest {
    
    public ComponentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of verify method, of class Component.
     */
    @Test
    public void testVerify() {
        System.out.println("verify");
        String in = "v 1 2 3";
        boolean expResult = true;
        boolean result = Component.verify(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Input is invalid");
    }

    /**
     * Test of identify method, of class Component.
     */
    @Test
    public void testIdentify() {
        System.out.println("identify");
        String in = "v 1 2 3";
        Component expResult = new Source("v 1 2 3");
        Component result = Component.identify(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("It is not a v 1 2 3");
    }
    
}
