//(c) A+ Computer Science
// www.apluscompsci.com
// Name - 

import java.util.Scanner;
import static java.lang.System.*;

public class Thing
{
   private String type;
   private String name;
   private double size;
   
   public Thing( String t, String n, double s)
   {	
   }
   
   public String getType()
   {
   	return "";
   }
   
   public double getSize()
   {
   	return 0;
   }
   
   public String toString()
   {
   	return "" + type + " " + name + " " + String.format("%.2f",size) + " ";
   }	
	
}