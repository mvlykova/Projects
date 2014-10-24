/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex1;

/**
 *
 * @author Мария
 */
public class Person {
    
    public Person()
    {
        Name = "temp";
        Age = 21;
    }
    public Person(int value, String str) throws WrongAgeValueException
    {
        SetAge(value);
        Name = str;
    }
    public int Age;
    public String Name;
    public void SetAge(int value) throws WrongAgeValueException
    {
        if ((value < 0)||(value > 100)) throw new WrongAgeValueException();
                Age = value; 
    }
    
    
}
