class Dog {
  String name;

  public static void main(String[] args) {
    // make a Dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart";

    // make a Dog array
    Dog[] myDogs = new Dog[3];

    // add dogs to the array
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = dog1;

    // access the Dogs using the array references
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";

    // Check myDog[2]'s name
    System.out.print("last dog's name is " + myDogs[2].name);

    // loop through objects in array, tell objects to do something
    int x = 0;
    while (x < myDogs.length) {
      myDogs[x].bark();
      x = x + 1;
    }
  }

  public void bark() {
    System.out.println(name + " says Ruff!");
  }

  public void eat() {}

  public void chaseCat() {}
}
