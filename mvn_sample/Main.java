/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.imgscalr.mvn_sample;


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author РњР°СЂРёСЏ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    
    ScalrClass resize = new ScalrClass();
    
    resize.pathIn = args[0];
    int width = Integer.parseInt(args[1]);
    int height = Integer.parseInt(args[2]);
    resize.pathOut = args[3];
    
    resize.Resize(width, height);
        
  }
}
    
 
    
    

