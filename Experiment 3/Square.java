package shape2D;

public class Square implements Shape
{  double side;
   
   public Square()
   { 
      side = 4 ;
   }
   
    public double displayArea()
   {
      return (side*side);
   }
   
    public double displayPerimeter()
   { 
      return (4*side);
   }	  
   
}
