/*Create an abstract class called Shape2d that has two data members of type double
and two abstract methods area() and display(). Create two derived classes Rectangle and
Triangle. In both classes define the method area() to compute the area of that shape and
return it as a double value and define the method display() to display the value of the data
members with appropriate caption and the calculated area. Create a class called
Shape2dDemo and provide main method to instantiate the objects of Rectangle and Triangle
for demonstration of the above classes*/

abstract class Shape2d
{ double x , y;
  Shape2d(double a,double b)
  { x = a;
    y = b;
  }
  abstract double area();
  abstract void display();
}

class Rectangle extends Shape2d
{  Rectangle(double a, double b) {
        super(a, b);
    }
  
  double area()
  { double a;
    a = x*y ;
	return a;
  }
  
  void display()
  {  System.out.println("Length :"+x);
     System.out.println("Bredth :"+y);
     System.out.println("Area :"+area());
  }
}

class Triangle extends Shape2d
{ Triangle(double a, double b) {
        super(a, b);
    }
  double area()
  { double a;
    a = x*y*0.5 ;
	return a;
  }
  
  void display()
  {  System.out.println("Base :"+x);
     System.out.println("Height :"+y);
     System.out.println("Area :"+area());
  }
}

class Shape2dDemo
{ public static void main(String args[])
	{ double d1 = 4;
      double d2 = 5;
      Rectangle s = new Rectangle(5,10);
      s.display();
      Triangle d = new Triangle(8,6);
      d.display();
	}
}