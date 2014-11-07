/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.imgscalr.mvn_sample;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;

/**
 *
 * @author Мария
 */
public class ScalrClass {
 
    File source;
    File result;
    String pathIn;
    String pathOut;
    
    public ScalrClass() throws IOException{
        
        
    }
    
    public void Resize(int width, int height) throws IOException
    {
        source = new File(pathIn);
        result = new File(pathOut);
        result.createNewFile();
        BufferedImage OrImage = ImageIO.read(source);
        BufferedImage resizedImage;
        if (height == 0) 
        {
            resizedImage = Scalr.resize(OrImage,Scalr.Mode.FIT_TO_WIDTH,width);
        }else 
            if (width == 0) 
            {
                resizedImage = Scalr.resize(OrImage,Scalr.Mode.FIT_TO_HEIGHT,height);
            }else 
            {
                resizedImage = Scalr.resize(OrImage,Scalr.Method.BALANCED,width,height);
            }
        ImageIO.write(resizedImage, "jpg", result);
        
        
    }
    
            
    
}
