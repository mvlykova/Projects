/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squareequation;

import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestCase;

/**
 *
 * @author Мария
 */
public class DataTest extends TestCase {
    
    public DataTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    

    /**
     * Test of SetA method, of class Data.
     * @throws squareequation.NullException
     */
    public void testSetA() throws NullException {
        try{
        double A = 0.0;
        Data instance = new Data (A,11,10);
        instance.SetA(A);
        assertEquals(A, instance.a);
        }
        catch(NullException e){
        System.out.println(e);
        }
    }
    public void testCalculate() throws NullException, ArithmeticException
    {
        try {
            
            Data instance = new Data(5,4,3);
            assertEquals(Math.sqrt(instance.D), Math.sqrt(Math.pow(instance.b,2) - 4*instance.a*instance.c));
        } 
        catch (ArithmeticException e) {
            System.out.println("Неправильное вычисление корня");
        }
        catch (NullException e) {
            System.out.println(e);
        }
        
    }
    
    
}
