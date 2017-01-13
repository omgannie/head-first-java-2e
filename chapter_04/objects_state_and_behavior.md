# Objects have state and behavior, respresented by instance variables and methods.

## The **behavior** of an object acts on its **state.**

### A class describes what an object *knows* and what an object *does*

Think of a class as the blueprint for an object - we describe how the JVM should make an object of that type.

example:
```java
  public class Song() {
    // instance variables. state of Song objects, or what a Song object 'knows'
    String title;
    String artist;

    // methods. behavior of Song objects, of what a Song object 'does'
    public void setTitle(String[] title) {
      this.title = title;
    }

    public void setArtist(String[] artist) {
      this.artist = artist;
    }

    public void play() {
      return "Playing song now...";
    }
  }
```

## Methods use instance variables
Methods can use instance variables of an object to determine output.

example:
```java
  class Dog {
    int size;
    String name;

    void bark() {
      if (size > 60) {
        System.out.println("Woof Woof!");
      } else if (size > 14) {
        System.out.println("Ruff Ruff!");
      } else {
        System.out.println("Yip yip!");
      }
    }
  }
```

## Passing values into methods
A method **uses** parameters. A caller **passes** arguments.
Arguments are passed into methods, which in turn becomes parameters. A parameter is a local variable available within the method. **If a method takes a parameter, you must past it a vlue of the appropriate type**.

example:
```java
  void bark(int numOfBarks) {
    while (numOfBarks > 0) {
      System.out.println("Ruff");
      numOfBarks = numOfBarks - 1;
    }
  }

  Dog d = new Dog();
  d.bark(3);
  // 3 is 'numOfBarks'
  // outputs "Ruff Ruff Ruff"
```

### You can pass multiple parameters into a method
Separate delcarations with a comma, then separate the arguments with commas when you pass them. They must be passed with the right types and order.

example:
```java
void go() {
  TestStuff t = new TestStuff();
  t.takeTwo(12, 34);
}

// int x, int y
void takeTwo(int x, int y) {
  int z = x + y;

  System.out.println("total is " + z);
}
```

## Return values from methods
Every method is declared with a return type and MUST return a value of that type!

example:
```java
  // void means it won't return anything
  void go() {    
  }

  // int means it will return an Integer type
  int giveSecret() {
    return 42;
  }

  // return values saved within variables must match
  int theSecret = life.giveSecret();
  int giveSecret() {
    return 42;
  }
```
### Pass by copy
Basically means variables declared outside of a method are not changed by the methods when they are passed through. The method creates a copy of the variable passed in and the return value lives within the method.

# Other bullet points
* Values passed in and out of methods can be
implicitly promoted to a larger type or explicitly cast
to a smaller type.
* The value you pass as an argument to a method
can be a literal value (2, ‘c’, etc.) or a variable of
the declared parameter type (for example, x where
x is an int variable). (There are other things you
can pass as arguments, but we’re not there yet.)
* A method must declare a return type. A void return
type means the method doesn’t return anything.
* If a method declares a non-void return type, it must
return a value compatible with the declared return
type.
