/*Imagine a publishing company that markets both book and audiocassette versions of
its works. Create a class publication that stores the title (a string) and price (type float) of a
publication. From this class derive two classes book, which adds a page count (type int); and
tape, which adds a playing time in minutes (type float). Each of these three class should have
a get data () method to initialize its data and a put data () method to display its data. Write a
java program to test the book and tape classes by creating five instances of them, asking the
user to fill in their data with get data (), and then display the data with put data ().*/
import java.util.Scanner;
class publication
{ String title;
  float price;
  void get_data()
  { Scanner s = new Scanner(System.in);
    System.out.println("Enter the Title:");
	title = s.next();
    System.out.println("Enter the Price:");
	price = s.nextFloat();
  }
	
  void put_data()
  { System.out.println("Title:"+title);
	System.out.println("Price:"+price);
  }
}

class Book extends publication
{ int page_count;
  void get_data()
  { Scanner s = new Scanner(System.in);
    System.out.println("Enter the page_count:");
	page_count = s.nextInt();
  }
  
  void put_data()
  { System.out.println("Page Count:"+page_count);
  }
    
}

class Tape extends publication
{ float time;
  void get_data()
  { Scanner s = new Scanner(System.in);
    System.out.println("Enter the Time:");
	time = s.nextFloat();
  }
  
   void put_data()
  { System.out.println("Time:"+time);
  }
}

class Main
{ 
   public static void main(String args[])
   {  publication a = new Book();
      a.get_data();
	  a.put_data();
	  
	  publication b = new publication();
	  b.get_data();
	  b.put_data();
	  
	  publication c = new Tape();
      c.get_data();
	  c.put_data();
   }
}