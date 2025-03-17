/*Create a class called Book that contains instance variables like BKName, BKId and
BKAuthor, a parameterized constructor to initialize its instance variables and and an
overloaded constructor that initializes its instance variables with default values. Implemnt a
method BKUpdateDetails(String name, int id, String author), that accepts new values for
name, Id and author as parameters and updates the corresponding instance variable values
of that object and another method BKDisplay() to display the book details. Create a class
BookDemo and provide main method for instantiate a Book object, display the original book
details, update its details with new values, and display the updated book details.*/



class Book 
{ String BKName;
  int BKId;
  String BKAuthor;
  
  Book()
  { BKName = null;
    BKId = 0;
	BKAuthor = null;
  }

  Book( String a , int b , String c)
  { BKName = a ;
    BKId = b ;
	BKAuthor = c ;
  }
  
  void BKUpdateDetails( String name , int id , String author )
  { BKName = name ;
    BKId = id ;
	BKAuthor = author ;
  }
  
  void BKDisplay()
  { System.out.println("BOOK NAME :"+BKName);
    System.out.println("ID:"+BKId);
	System.out.println("AUTHOR NAME:"+BKAuthor);
  }
}

class BookDemo
{ 
  public static void main(String args[])
  { Book b = new Book("Effective Java",1,"Joshua Bloch");
    b.BKDisplay();
	
	b.BKUpdateDetails("Effective Java 3rd Edition",2,"Joshua Bloch");
	b.BKDisplay();
	
	Book c = new Book();
	c.BKDisplay();
	
	c.BKUpdateDetails("Clean Code: A Handbook of Agile Software Craftsmanship",3,"Robert C. Martin");
	c.BKDisplay();
  }
  
};

