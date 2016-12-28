// An exercise to understand code structure in Java.

// Put a class in a source file.
  // A source code file (of .java extension) holds one class definition

// Put methods in a class file.
  // A class has 1+ methods related to class, and must be declared INSIDE a class.

// Put statements in a method.
  // write instructions for how the method should run


// source file > class file > method > statements

// 'public' means everyone can access it.
// 'class' means it's a class
// 'MyFirstApp' is the name of the class
public class MyFirstApp {

  // 'void' means there is no return value
  // 'main' is the name of the method - the compiler will look for the first 'main' method in any program so it knows where to look to know how to run the rest of the app
  // 'String[] args' - arguments to the method. means this method MUST be given an array of strings and array is called 'args'
  public static void main (String[] args) {

    // statements for the method
    System.out.println("I Rule!");
    System.out.println("The World!");

  }

}

// To run program:
// 1. Save file as same name of class
// 2. Compile - run 'javac MyFirstApp.java' at command line
// 3. Run program - 'java MyFirstApp'
