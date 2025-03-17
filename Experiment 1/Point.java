/*Create a Point class that has two data members x and y of double type. Write a default
constructor which initializes its data members to zero. Write a parameterized constructor which
takes two parameters of double type and assigns them to its data members. Write another
parameterized constructor that takes one Point object as parameter and copies the values of
the passed object’s data member to the calling object’s data members. Write a find_distance
method that takes two double parameters representing the x, y values of a point and finds the
distance between the calling object and the passed parameters and returns the distance as
double value. Overload the find_distance method, that takes single Point object parameter
and computes the distance between both the points and returns the distance as a double
value. Write a display method to print the point in the format of (x, y). In main method create
three point objects p1, p2 and p3. Initialize p1 with (3.25, 7.89), p2 with (5.37, 18.12) and p3
with p2. Find distance between p1 and (7.9, 16.25) using first find_distance method and
between p1 and p3 using secondfind_distancemethod.*/

class Point
{ double x,y;

  Point()
  { x = 0;
    y = 0;
  }
  
  Point( double a , double b)
  { x = a;
    y = b;
  }
  
  Point( Point a)
  { x = a.x;
    y = a.y;
  }
  
  double Find_Distance( double a , double b )
  { double d;
     d = Math.sqrt( Math.pow((x-a),2) + Math.pow((y-b),2));
	return d;
  }
  
   double Find_Distance( Point a )
  { double d;
    d = Math.sqrt( Math.pow((x-a.x),2) + Math.pow((y-a.y),2));
	return d;
  }
  
  void Display()
  { System.out.println("{"+x+","+y+"}");
  }
  
  public static void main( String args[] )
  {  Point p1 = new Point(3.25, 7.89);
     Point p2 = new Point(5.37, 18.12);
	 Point p3 = new Point();
     
	 p1.Display();
	 p2.Display();
	 p3.Display();
	 
	 System.out.println("DISTANCE:"+p1.Find_Distance(7.9, 16.25));
	 System.out.println("DISTANCE:"+p1.Find_Distance(p3));
	 
  }
}
  
  
  
  
  
  