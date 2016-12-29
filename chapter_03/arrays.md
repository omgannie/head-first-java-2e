# Arrays in Java
**Arrays are always objects** even if they hold primitive variables or object references

```java
  // declare an int array variable. An array variable references an array object
  int[] nums;

  // create a new int array with a length of 7, assign it to the previously declared 'int[]' variable nums
  nums = new int[7];

  // give each element in the array an int value.
  // note: elements in an int array are just int variables.
  nums[0] = 6;
  nums[1] = 19;
  nums[2] = 44;
  nums[3] = 42;
  nums[4] = 10;
  nums[5] = 20;
  nums[6] = 1;
```

## Creating objects within an array
```java
  Dog[] pets;
  pets = new Dog[7];

  pets[0] = new Dog();
  pets[1] = new Dog();
  // and so and so forth..
```

## Accessing objects within an array
If an object is in an array, we use array notation and use the dot operator on an object at a particular index in the array. (Encapsulation to come next chapter.)
```java
  Dog[] myDogs = new Dog[3];

  myDogs[0] = new Dog();
  myDogs[0].name = "Fido";
  myDogs[0].bark();
```
