# Understanding Inheritance
Designing with inheritance means you put common code in an abstract class (the superclass), and assign more specific responsibilities to specific classes (subclasses). Subclasses inherit from (or extends) the superclass.

Instance variables are not overridden because they don't need to be. Methods can be overridden in subclasses if need be.

Using inheritance allows us to avoid writing duplicate code in subclasses.

Consider inheritance when you have behavior that should be shared amoung multiple classes of the same general type.

inheritance example:
```java
  // doctor is the superclass
  public class Doctor {
    boolean worksAtHospital;

    void treatPatient() {
      ...
    }
  }
```
```java
  public class FamilyDoctor extends Doctor {
    boolean makesHouseCalls;

    void giveAdvice() {
      ...
    }
  }
```
```java
  public class Surgeon extends Doctor {
    void treatPatient() {
      // override treatPatient method from Doctor class
    }

    void makeIncision() {
      // a new method for Surgeon
    }
  }
```

## Example using Animals
* Animal class
  * Feline extends Animal
    * Cat extends Feline
    * Tiger extends Feline
    * Lion extends Feline
  * Canine extends Animal
    * Dog extends Canine
    * Wolf extends Canine
  * Hippo extends Animal

## Apply the IS-A rule, if unsure about inheritance

## To add more to the super class method, use super
```java
public void roam() {
  super.roam();
  // calls the inherited version of roam(), then returns to sub-class specific code
}
```

## Rules on Overriding
1. Arguments must be the same, and return types must be compatible.
2. The method can't be less accessible. If a superclass method is originally public, you can't make the override method private.

## Overloading a method
Method overloading is having two methods with the same name but with different argument lists. Theres no polymorphism involved with overloaded methods. Overloading allows you to make multiple versions of a method.

1. Return types can be different, as long as argument lists are different.
2. Can't change ONLY return type. It isn't a valid overload if only return type is different, the compiler will assume you're trying to override the method.
3. You can vary the access levels in any direction - meaning you can overload a method with a method that's more restrictive.

examples of method overloading:
```java
public class Overloads {
  String uniqueID;

  public int addNums(int a, int b) {
    return a + b;
  }

  public double addNums(double a, double b) {
    return a + b;
  }

  public void setUniqueID(String theID) {
    uniqueID = theID;
  }

  public void setUniqueID(int ssNumber) {
    String numString = "" + ssNumber;
    setUniqueID(numString);
  }
}
```
