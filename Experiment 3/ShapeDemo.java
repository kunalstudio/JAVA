/*Create a package called shape2d. In that package create an interface called Shape2D that
contains displayArea() and displayPerimeter() methods. Derive three classes Square,
Rectangle and Circle that implement the Interface Shape2D. In all three classes override two
methods displayArea() and displayPerimeter(). Both returns double value. Square class
contains one instance variable called side of double type, a parameterized constructor for
initializing that member, displayArea() and displayPerimeter() methods for computing and
returning the area and perimeter of the square using appropriate formulae. Similarly Rectangle
class contains two instance variables called length and breadth of double type, a
parameterized constructor with two parameters for initializing those members, displayArea()
and displayPerimeter() methods for computing and returning the area and perimeter of the
rectangle using appropriate formulae. Circle class contains one instance variable called radius
of double type, a parameterized constructor for initializing that member, displayArea() and
displayPerimeter() methods for computing and returning the area and perimeter of the circle
using appropriate formulae. Create a class ShapeDemo outside the packages and declare a
main method for creating objects of all 2D shapes, calculate area and perimeter.*/

import shape2D.*;
import shape2D.Square;

class ShapeDemo
{
   public static void main(String args[])
   {
      Square s = new Square();
	  System.out.println("Area of Square:"+s.displayArea());
	  System.out.println("Area of Square:"+s.displayPerimeter());
	  
	  Rectangle r = new Rectangle();
	  System.out.println("Area of Rectangle:"+r.displayArea());
	  System.out.println("Area of Rectangle:"+r.displayPerimeter());
	  
	  Circle c = new Square();
	  System.out.println("Area of Circle:"+c.displayArea());
	  System.out.println("Area of Circle:"+c.displayPerimeter());
   }
}