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

class BulbGUI extends JFrame {
    //Container myContentPane;
    //initialize gui
    public BulbGUI(String title, int height, int width){
      //setLayout(new GridLayout (1,2));
			setDefaultCloseOperation(/*JFrame.*/EXIT_ON_CLOSE);
      setSize(height, width);
		  setLocation(100,100);
      createFileMenu();
      setTitle(title);
      setVisible(true);
    }

    private void createFileMenu( ) {


      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");
     
      FileMenuHandler fmh = new FileMenuHandler(this);

      item = new JMenuItem("Open");    
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           
    
      item = new JMenuItem("Quit");      
      item.addActionListener( fmh );
      fileMenu.add( item );

     

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      
    
   } 

} 

     
