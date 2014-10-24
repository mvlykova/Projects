/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import junit.framework.Test;
import junit.framework.TestCase;
/**
 *
 * @author Мария
 */
public class PeopleTest extends TestCase {
    
    public PeopleTest() {
        
    }
    
    @Override
    protected void setUp() throws Exception {
        
        //super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        
        //super.tearDown();
    }
    public void test1() throws WrongAgeValueException {
       try 
       {
            People t = new People("Alice", -1);
            assertEquals(-1, t.man1.Age);
       }
       catch(WrongAgeValueException e){
           System.out.println(e);
       }
     
    }
    
   /* public void test2() throws WrongAgeValueException {
        People t = new People("Zoe", 50);
        
    }*/
}
