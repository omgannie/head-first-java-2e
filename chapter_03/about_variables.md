# Variables in Java

## What are variables?
Variables hold assigned values that you want to save for a program to use at a later time.

## There are two types of variables in Java.
* **Primitive**
  * Primitives hold fundamental values like integers, booleans, and floating point numbers.
* **Object Reference**
  * Object references hold references to objects

## Declaring a variable - Type Safety First
**Java cares about type.** You must declare a variable with a type, and instantiate the variable with the same type that was initially declared. If you are trying to initialize an instance of a new Dog class object, you can't declare that it will be a Cat. The compiler will error out.

example:
```java
  Dog pupper = new Cat();

  int count;
  // int is the type; it stands for 'integer'
  // count is the name of the variable

  // examples of primitive declarations with assignments...
  int x;
  x = 234;
  byte b = 89;
  boolean isFun = true;
  double d = 3456.98;
  char c = 'c';
  String phrase = "This is my phrase";
  int z = x;
```
**Be sure the value can fit into the variable!**
example:
```java
  int x = 24;
  byte b = x;
  // won't compile because of the possibility of 'spilling'
```

## Naming Conventions for Variables
Apply the following rules to naming a class, method or variable
* Start with a letter, underscore or a dollar sign. Don't start a name with a number.
* After the first character, you can use numbers.
* Don't use any of Java's reserved words as variable names: boolean, byte, char, double, float, int, long, short, public, private, protected, abstract, final, native, static, strictfp, synchronized, transient, volatile, if, else, do, while, switch case, default, for, break, continue, assert, class, extends, implements, import, instanceof, interface, new, package, sper, this, catch, finally, try, throw, throws, return, void, const, goto, enum

## Object Reference Variables
Things to know about object reference variables:
* There is actually no such thing as an **object variable**. Objects actually only live in the garbage collection heap.
* There's only an **object reference variable**
* An object reference variable holds bits that represent **a way to access an object**
* It does not hold the object itself, it holds the pointer. There is no other reference to let us know WHAT it inside of a reference variable.
* It represents one and only one object that JVM knows how to use to reference to the actual object.
* All references for a given JVM are the same size regardless of the objects they reference
* You can use the dot operator to access methods that the object reference variable is associated with.
  example:
  ```java
  Dog myDog = new Dog();
  // 'Dog myDog' - this declaration tells the JVM to allocate space for a reference variable and names it 'myDog'
  // '=' - links the object to the reference
  // 'new Dog();' - tells the JVM to allocate space for a new Dog object on the heap
  myDog.bark();
  // this says 'use the object referenced by the variable myDog to invoke the bark() method'
  ```

## An Object's lifecycle in the garbage collectible heap
New objects that are created automatically live in the garbage collectible heap.
```java
  Book b = new Book();
  Book c = new Book();

  // There are 2 references and 2 objects.
```

Rather than creating a new object through the declaration, assign the value of a variable to the new variable. Both variables will refer to the same object - but hold different copies of the same value. Meaning that one variable will be manipulated but the other variable will not be affected by the change to the Object referenced by that variable.
```java
  Book d = c;

  // there are 2 objects but 3 references, d being the third reference.
```

When you re-assign the value of an existing variable to another variable, the object referenced by the variable is now a new copy.
```java
  c = b;
  // Both b and c refer to the same object.
  // There are two objects and three references.
```

Any object in the garbage collectible heap that is not being referenced by a variable is up for garbage collection grabs. It becomes unreachable.

If a variable holds a value of `null`, this makes that variable a null reference - meaning that it does not refer a program that does anything. However, it is still a reference variable that another object can be assigned to.
