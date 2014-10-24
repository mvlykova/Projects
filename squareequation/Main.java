/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squareequation;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try  {
        Data data = new Data(10,11,12);
        double d = data.D;
        data.Calculate(10, 11, d);
        }
        catch (NullException e)
        {   
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Ошибка ввода!");
        }
        
    }
}
