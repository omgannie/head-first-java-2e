## Declaring and Initializing Instance Variables
You don't have to initialize instance variables.

Instance variables always get a default value. If you don't explicitly assign a value to an instance variable, or you don't call a setter method, the instance variable still has a value.

example:
```java
integers = 0;
floating points = 0.0;
booleans = false;
references = null;
```

## Instance & Local variables
Local variables do NOT get a default value. Compiler will error if you attempt to use a local variable before the variable is initialized.

Method variables are local variables.

```java
class Foo {
  public void go() {
    int x;
    int z = x + 3;
    // int z won't compile!
  }
}
```

## Comparing variables (primitives or references)
* To compare two primitives, use the == operator. It will compare or see if two references refer to the *same* object.
* Use the *.equals()* method to see if two different objects are equal.
