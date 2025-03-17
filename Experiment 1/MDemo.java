/*Implement a Java program to define a class called ‘Mobilephone’ with Model Number,
Manufacture Name, Cost, Size, Color, MemoryCapacity,CameraPixelSize, as instance
variables.. Include various types of constructors such as Default constructor, Parameterized
constructor with two arguments, three arguments and four arguments. Create objects to
invoke various types of constructors and demonstrate polymorphism.*/

import java.util.Scanner;
class Mobilephone{
int modelnumber;
String manufacturename;
int cost;
int size;
String color;
int memorycapacity;
int camerapixelsize;

Mobilephone()
{modelnumber=0;
manufacturename=null;
cost=0;
size=0;
color=null;
memorycapacity=0;
camerapixelsize=0;}

Mobilephone(int mn)
{modelnumber=mn;
manufacturename=null;
cost=0;
size=0;
color=null;
memorycapacity=0;
camerapixelsize=0;}

Mobilephone(int mn,String man)
{modelnumber=mn;
manufacturename=man;
cost=0;
size=0;
color=null;
memorycapacity=0;
camerapixelsize=0;}

Mobilephone(int mn,String man,int c)
{modelnumber=mn;
manufacturename=man;
cost=c;
size=0;
color=null;
memorycapacity=0;
camerapixelsize=0;}

Mobilephone(int mn,String man,int c,int s)
{modelnumber=mn;
manufacturename=man;
cost=c;
size=s;
color=null;
memorycapacity=0;
camerapixelsize=0;}

void display()
{System.out.println(+modelnumber);
System.out.println("MN"+manufacturename);
System.out.println(+cost);
System.out.println(+size);
System.out.println("CO"+color);
System.out.println(+memorycapacity);
System.out.println(+camerapixelsize);}}

class MDemo{
public static void main(String args[])
{Scanner m=new Scanner(System.in);
String man;
int mn,c,s;
Mobilephone m1=new Mobilephone();
Mobilephone m2=new Mobilephone(1);
Mobilephone m3=new Mobilephone(1,"ab");
Mobilephone m4=new Mobilephone(1,"ab",2);
Mobilephone m5=new Mobilephone(1,"ab",2,4);
System.out.println("Enter modelnumber");
mn=m.nextInt();
System.out.println("Enter manufacturename");
man=m.next();
System.out.println("Enter cost");
c=m.nextInt();
System.out.println("Enter size");
s=m.nextInt();
m1.display();
m2.display();
m3.display();
m4.display();
m5.display();
}}