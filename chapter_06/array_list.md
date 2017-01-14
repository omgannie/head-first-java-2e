# ArrayList
It's not an array, it's an **ArrayList**. A class within the core Java Library. Built-in classes are already compiled.

## Some methods in ArrayList
* **add(Obj element)** - Adds obj parameter to the list
* **remove(int index)** - Removes obj at index of parameter
* **remove(Obj element)** - Removes object within ArrayList
* **contains(Obj element)** - Returns 'true' if there's a match for the obj parameter.
* **isEmpty()** - returns 'true' if list has no elements
* **indexOf(Obj element)** - Returns either index of obj parameter, or -1
* **size()** - returns number of elements currently in list
* **get(int index)** - Returns obj currently at the index parameter

## Some things you can do with ArrayList
* You can make one
` ArrayList<Egg> myList = new ArrayList<Egg>();`

* Put something in it
` Egg s = new Egg(); `
` my List.add(s); `

* Put more things into it. ArrayList grows to hold more objects.s

* and more..

## Comparing ArrayList to regular arrays in Java
**ArrayList**
In ArrayList, you're working with an **object** of type **ArrayList**, so you can just invoke methods on the object iself with the dot operator.

ArrayList grows as more objects get added to it, and shrinks as objects are taken out of it.

ArrayLists use **parameterized types** - ArrayList<*typeGoesHere*> and it forces the compiler to only allow a certain type of object in the ArrayList.

```java
  ArrayList<String> myList = new ArrayList<String>();

  String a = new String("hi!");
  myList.add(a);

  String b = new String("Frog");
  myList.add(b);

  int theSize = myList.size();

  Object o = myList.get(1);

  myList.remove(1);

  boolean isIn = myList.contains(b);
```

**regular array**
With regular arrays, you need to use special array syntax. Arrays are objects, but you can't invoke methods on it. You can only access its single instance variable, *length*.

Unlike ArrayList, you need to initialize an array with a specified number of allocated spaces of a certain type.

```java
  String[] myist = new String[2];

  String a = new String("hi!");
  myList[0] = a;

  String b = new String("Frog");
  myList[1] = b;

  int theSize = myList.length;

  String o = myList[1];

  myList[1] = null;

  boolean isIn = false;

    for (String item : myList) {
      if (b.equals(item)) {
        isIn = true;
        break;
      }
    }
```
