# Encapsulation is IMPORTANT to hide our data
Encapsulation makes sure we are not exposing our data. It is dangerous to expose our data because others can easily manipulate it when it should not be.

* We can hide our data with **public** and **private** access modifiers.
* Starter rule of thumb: **Mark instance variables private** and **Mark getters and setters public**.

Encapsulation sets boundaries by forcing other code to go thru setter methods. Setter methods can validate the parameter and decide if it is do-able. The method will either reject it and do nothing or throw an Exception, or even round the parameter sent in to the nearest possible value.

example:
```java
  class GoodDog {
    // instance variable 'size' is set to private
    private int size;

    // getters / setters are public
    public int getSize() {
      return size;
    }

    public void setSize(int s) {
      size = s;
    }

    void bark() {
      ...
    }
  }
```
