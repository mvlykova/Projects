/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squareequation;

import java.util.InputMismatchException;

/**
 *
 * @author Мария
 */
public final class Data {
    
    double a;
    double b;
    double c;
    double D;
    double rez1;
    double rez2;
    
    public Data (double A, double B, double C) throws NullException
    {
        SetA(A);
        b = B;
        c = C;
        D = Math.pow(b,2) - 4*a*c;
        rez1 = 0;
        rez2 = 0;
    }
    public void SetA(double A)throws NullException
    {
        if (A == 0) throw new NullException();
        else a = A;
        
    }
    public void Calculate(double a1, double b1, double d) 
    {
        if (d < 0) {
            System.out.println("Корней нет");
        } else if (d == 0){
            rez1 = (-b1)/2*a1;
            System.out.println("x = " + rez1);
        }else
        {
         rez1 = (-b1 + Math.sqrt(d))/2*a1;
         System.out.println("x1 = " + rez1);
         rez2 = (-b1 - Math.sqrt(d))/2*a1;
         System.out.println("x2 = " + rez2);
    }
  }
}

