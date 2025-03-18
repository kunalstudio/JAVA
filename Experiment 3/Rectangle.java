package shape2D;

public class Rectangle implements Shape
{  double length;
   double breadth;
   
  public Rectangle()
   { 
      length = 4 ;
	  breadth = 5;
   }
   
    public double displayArea()
   {
      return (length*breadth);
   }
   
    public double displayPerimeter()
   { 
     return (2*(length+breadth));
   }	  
   
}