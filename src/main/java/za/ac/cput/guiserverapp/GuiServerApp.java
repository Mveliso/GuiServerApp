/**
 *
 * @author Mveliso Roto
 * 
 */

package za.ac.cput.guiserverapp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GuiServerApp extends JFrame implements ActionListener
{
    private ServerSocket listener;
    private String msg = "";
    private String upCaseMsg = "";
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private JButton exitBtn = new JButton("EXIT");
    private JTextArea clientTxtArea = new JTextArea(5,40);
    private String response = "";
    private JPanel topPanel = new JPanel();
    private JPanel centerPanel = new JPanel();

    // Client connection
    private Socket client;
//----------------------------------------------------------------------------------    
    //Define a constructor in which you construct a ServerSocket object and setup the Gui
    public GuiServerApp()
   {
        super("server");
        this.topPanel.setLayout(new FlowLayout());
        this.topPanel.add(exitBtn);
        this.exitBtn.addActionListener(this);
        this.exitBtn.setVisible(false);
        
        this.centerPanel.setLayout(new FlowLayout());
        this.centerPanel.add(clientTxtArea);
        
        this.add(topPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 400);
        this.setVisible(true);
   }
  

//declare a method to listen for client connections
   private void listenForClients() throws IOException
   {
    
    }

//declare a method to initiate communication streams
    private void getStreams() throws IOException
   {
       
   }

//declare a method in which you write data to the client    
   private void sendData(String myMsg)
   {
   }

//declare a method in which you close the streams and the socket connection    

   
//declare a method in which you continuously read from the client; process the incoming data;
   //and write results back to client.    
/*public void processClient()
   {
        do{
        }while(.... );
  }
    */
   public static void main(String[] args)
   {
       new GuiServerApp();
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
    
//----------------------------------------------------------------------------------    

     
