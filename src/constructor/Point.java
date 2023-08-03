/*
Point p1= new Point()-
Compile error will occur as JVM doesn't create default constructor if we add parameterized constructor
Error will be removed-
 if we call parameterized constructor instead of calling default constructor OR
 add default constructor

 Note- Priority of
 Default constructor > Parameterized Constructor
 say example-

 Point p= new Point(3,4);
 Point p= new Point();

 Although parameterized constructor is called first but still default constructor will be prioritized
 and output will be -
Hi
x = 0, y = 0




package constructor;

public class Point {
    protected int x, y;
    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}

 class Main {
    public static void main(String args[])
    {

       Point p= new Point();  //- Compile error as JVM doesn't create default constructor if we add parameterized constructor

        System.out.println("x = " + p.x + ", y = " + p.y);
    }
}

*/


package constructor;

public class Point {
    protected int x, y;

    public Point(){
        System.out.println("Hi");
    }

    public Point(int _x, int _y)
    {
        x = _x;
        y = _y;
    }
}

class Main {
    public static void main(String args[])
    {
        Point p1= new Point(3,4);
        Point p= new Point();  // default constructor called automatically

       System.out.println("x = " + p1.x + ", y = " + p1.y);
    }
}