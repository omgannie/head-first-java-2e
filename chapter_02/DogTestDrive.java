public class DogTestDrive {
  public static void main (String[] args) {
    Dog d = new Dog();

    d.size = 40;
    d.bark();

    System.out.print("d's size is " + d.size);
  }
}
