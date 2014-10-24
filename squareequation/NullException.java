/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squareequation;

/**
 *
 * @author Мария
 */
public class NullException extends Exception
{
    public NullException()
            {
                super("Коэффициент А должен быть не равен нулю!");
            }
            
}
