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
public class WrongAgeValueException extends Exception
{
    public WrongAgeValueException() 
    {
        super("Некорректное значение возраста"); 
    } 
   
}
