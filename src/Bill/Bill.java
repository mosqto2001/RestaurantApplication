/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author windows
 */
public class Bill implements Printable{

  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    
            double width = pageFormat.getImageableWidth();                               
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 



          //  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        
        try{
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
           // int headerRectHeighta=40;
            
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("         CodeGuid.com        ",12,y);y+=yShift;
            g2d.drawString("   No 00000 Address Line One ",12,y);y+=yShift;
            g2d.drawString("   Address Line 02 SRI LANKA ",12,y);y+=yShift;
            g2d.drawString("   www.facebook.com/CodeGuid ",12,y);y+=yShift;
            g2d.drawString("        +94700000000      ",12,y);y+=yShift;
            g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;

            g2d.drawString(" Item Name                  Price   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
     
            for(int s=0; s<2; s++)
            
            g2d.drawString(" "+"DSAdasds"+"                            ",10,y);y+=yShift;
            g2d.drawString("      "+"10"+" * "+"500.00",10,y); g2d.drawString("dsadsa",160,y);y+=yShift;

            
          
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Total amount:               "+"999"+"   ",10,y);y+=yShift;
  
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("       THANK YOU COME AGAIN            ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("       SOFTWARE BY:CODEGUID          ",10,y);y+=yShift;
            g2d.drawString("   CONTACT: contact@codeguid.com       ",10,y);y+=yShift;       
           

    }
    catch(Exception e){
    e.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }

   
   }

