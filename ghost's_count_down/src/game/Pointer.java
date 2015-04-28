package game;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Pointer {
   double circleTime;
   
   double angle;
   double length;
   double width;
   
   Image image;
   
   public Pointer(double v){
	   this();
	   circleTime = v;
   }
   
   
   public Pointer(){
  	   angle = -90;
   }
   
   
   public void rotate(){
	   angle += 360/circleTime;
	   angle %= 360 ;
   }
 
   public void draw(Graphics g){
	   
   }
  
}
