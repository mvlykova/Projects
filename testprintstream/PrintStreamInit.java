/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testprintstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Мария
 */
public class PrintStreamInit extends PrintStream{

    public PrintStreamInit(OutputStream out) {
        super(out);
    }
    
    PrintStreamInit (OutputStream out, boolean bool)
    {
        super (out, bool);
    }
    
    
    PrintStreamInit (OutputStream out, boolean bool, String string) throws UnsupportedEncodingException
    {
        super (out, bool, string);
    }
    
    public String ConfigureString (Map OutputMap, String Separator)
    {
        Set s = OutputMap.entrySet();
        Iterator Iter = s.iterator();
        String ResString = "";
        while (Iter.hasNext())
        {
            Map.Entry m = (Map.Entry)Iter.next();
            ResString += "{" + m.getKey() + "," + m.getValue()+"}";
            if (Iter.hasNext()) ResString += Separator;
        }
        return ResString;
    }
    
    public void print (Map map)
    {
        String result = ConfigureString(map," ");
        super.print(result);
    }
    
    public void println (Map map)
    {
        String result = ConfigureString (map, "\n");
        super.println(result);
    }
    
    public void print (Map map, String separator)
    {
        String result = ConfigureString(map,separator);
        super.print(result);
    }
    
    public void println (Map map, String separator)
    {
        String result = ConfigureString (map, separator);
        result += "\n";
        super.println(result);
    }
}
