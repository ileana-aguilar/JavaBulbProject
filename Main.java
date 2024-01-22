import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


class Main {
  static BulbGUI bulbGUI;
  public static void main(String[] args) throws IOException {
  
    /*BufferedReader buffRead = new BufferedReader(new FileReader("inputFile.txt"));
    String line = null;

        while ((line = buffRead.readLine()) != null){
          StringTokenizer token =new StringTokenizer(line, ",");
          while (token.hasMoreTokens()){
            String manufacturer = token.nextToken().trim();
            String partNumber = token.nextToken().trim();
            Integer wattage = Integer.parseInt(token.nextToken().trim());
            Integer lumens = Integer.parseInt(token.nextToken().trim());
            Bulb b = new Bulb(manufacturer, partNumber, wattage, lumens);
           
          }
        } 
    //Bulb b = new Bulb(manufacturer, partNumber, wattage, lumens);
*/
    bulbGUI = new BulbGUI("Bulbs", 400, 400);
   
    
    
    
    
  }
}