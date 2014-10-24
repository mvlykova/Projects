/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

import java.util.Scanner;

/**
 *
 * @author Мария
 */

public class Ex1 {

    /**
     * @param args the command line arguments
     * @throws ex1.WrongAgeValueException
     */
    public static void main(String[] args) throws WrongAgeValueException {
        
        
        try
        {
        People p = new People("Ann", 20);
        }
        catch (WrongAgeValueException e)
        {
        System.out.println(e);
        }
    }
    
}
