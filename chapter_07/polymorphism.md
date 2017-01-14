# Polymorphism
Implementing inheritance in your code allows you to take advantage of Polymorphism.

```java
// how we normally declare a reference and create an object
Dog myDog = new Dog();
// both reference and variable are the same type

// how we would with Polymorphism
Animal myDog = new Dog();
// with polymorphism, the reference type can be a superclass of the actual object type.

// more examples..
Animal[] animals = new Animal[5];
animals[0] = new Dog();
animals[1] = new Cat();
animals[2] = new Wolf();
animals[3] = new Hippo();
animals[4] = new Lion();

for (int i = 0; i < animals.length; i++) {
  // we iterate through all of the different Animal objects
  // and tell them to do the same things
  // because each different Animal object (Dog, Cat, etc..) inherits methods from the Animal superclass
  animals[i].eat();
  animals[i].roam();
}
```

## Polymorphic Arguments and Return Types
example:
```java
  // the Animal parameter can take ANY Animal type as the argument
  class Vet {
    public void giveShot(Animal a) {
      // checkup methods..
      a.makeNoise();
    }
  }

  class PetOwner {
    public void start() {
      Vet v = new Vet();

      Dog d = new Dog();

      Hippo h = new Hippo();

      v.giveShot(d);
      v.giveShot(h);
    }
  }
```
