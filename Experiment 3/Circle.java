package shape2D;


public class Circle implements Shape
{  double radius ;
   
   public Circle()
   { 
      radius = 10;
   }
   
    public double displayArea()
   {
      return (3.14*radius*radius);
   }
   
    public double displayPerimeter()
   { 
     return (2*3.14*radius);
   }	  
   
}