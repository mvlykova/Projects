/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testprintstream;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Мария
 */
public class PrintStreamInitTest {
    
    public static Map<Object, String> Map;
    public static ByteArrayOutputStream OutArray;
    public static PrintStreamInit Init;
    
    public PrintStreamInitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Map = new HashMap<>();
        Map.put(1, "one");
        Map.put(2, "two");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        OutArray = new ByteArrayOutputStream();
        System.setOut(new PrintStreamInit(OutArray));
        Init = new PrintStreamInit (System.out);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ConfigureString method, of class PrintStreamInit.
     */
    @Test
    public void testConfigureString() {
        Map OutputMap = Map;
        String Separator = " ";
        String expResult = "{1,one} {2,two}";
        String result = Init.ConfigureString(OutputMap, Separator);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of print method, of class PrintStreamInit.
     */
    @Test
    public void testPrint_Map() {
        
        Init.print(Map);
        assertEquals("{1,one} {2,two}",OutArray.toString());
        
    }

    /**
     * Test of println method, of class PrintStreamInit.
     */
    @Test
    public void testPrintln_Map() {
        
        Init.println(Map);
        assertEquals("{1,one}\n{2,two}\n",OutArray.toString());
        
    }

    /**
     * Test of print method, of class PrintStreamInit.
     */
    @Test
    public void testPrint_Map_String() {
        
        Init.print(Map,"//");
        assertEquals("{1,one}//{2,two}",OutArray.toString());
        
    }

    /**
     * Test of println method, of class PrintStreamInit.
     */
    @Test
    public void testPrintln_Map_String() {
        Init.print(Map,"//");
        assertEquals("{1,one}//{2,two}\n",OutArray.toString());
    }
    
}
