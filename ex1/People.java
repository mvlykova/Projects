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
public class People {
    
    Person man1;
    Person man2;
    
    public People(String name, int age) throws WrongAgeValueException
    {
        man1 = new Person(age, name);
        man2 = new Person();
    }
    
}
;