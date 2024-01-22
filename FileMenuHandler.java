import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.Container;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import java.io.File;   
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

class FileMenuHandler implements ActionListener {
   BulbGUI bulbGUI;
   public FileMenuHandler (BulbGUI bg) {
      bulbGUI = bg;
   }
   public void actionPerformed(ActionEvent event)  {
      String menuName = event.getActionCommand();
      if (menuName.equals("Open"))
      {
        try {
        openFile();
        }
        catch (IOException e){
          e.printStackTrace();
        }
      }
          
      else if (menuName.equals("Quit")){
          JOptionPane.showMessageDialog(null,"You clicked on Quit"); 
          System.exit(0);
      }
   }
   
  private void openFile() throws IOException{
    int status;
    JFileChooser fileChooser = new JFileChooser();    
    status = fileChooser.showOpenDialog(null); 
    readSource (fileChooser.getSelectedFile());
    
  }


   private void readSource(File chosenFile) throws IOException {
    String chosenFileName = chosenFile.getAbsolutePath();
    ArrayList<Bulb> unsortedBulbList = new ArrayList<>();
    FileReader reader = new FileReader(chosenFileName.toString());
      BufferedReader br = new BufferedReader(reader);
      Container BulbContentPane = bulbGUI.getContentPane();
      JTextArea BulbsTextArea = new JTextArea();
     



      String line = null;
      line = br.readLine();

        while (line != null){
          StringTokenizer token =new StringTokenizer(line, ",");
          
          while (token.hasMoreTokens()){
            try{
            String manufacturer = token.nextToken().trim();
            String partNumber = token.nextToken().trim();
            Integer wattage = Integer.parseInt(token.nextToken().trim());
            Integer lumens = Integer.parseInt(token.nextToken().trim());
            unsortedBulbList.add(new Bulb(manufacturer, partNumber, wattage, lumens));
            Bulb b = new Bulb(manufacturer, partNumber, wattage, lumens);
            unsortedBulbList.add(b);
            
            String unBulbs = BulbsTextArea.getText();
            String unsorts = b.toString();
            BulbsTextArea.setText( unBulbs + "\n"+ unsorts);
            BulbContentPane.add(BulbsTextArea);
            } 
            catch (IllegalBulbException a){ 
              System.out.println(a.getMessage());
            }
            finally {
              line = br.readLine();
            }

    
          }
         } 
         
         }


  
}






    
    

  

  
  



    
      /*public void listPlacement (BulbList unsorted, BulbList sorted){
     
      Container myContentPane = getContentPane();
        JTextArea UnsortedBulbstext = new JTextArea();
        //myContentPane.add(UnsortedBulbstext);
        String unBulbs = UnsortedBulbstext.getText();
        String unsorts = unsorted.toString();
        UnsortedBulbstext.setText("Unsorted List:"+ "\n"+ unBulbs + unsorts);
        add(UnsortedBulbstext);

        JTextArea SortedBulbsText = new JTextArea();
        //myContentPane.add(SortedBulbsText);
        String sBulbs = SortedBulbsText.getText();
        String sorts = sorted.toString();
        SortedBulbsText.setText("Sorted List: \n" + sBulbs + sorts);
        add(SortedBulbsText);
      
      UnsortedBulbstext.setEditable(false);
      SortedBulbsText.setEditable(false);
      
      
      // Adds the unsorted/sorted text areas to GUI
      
     
      
    }
    
    //sorting lists
    
      */
    