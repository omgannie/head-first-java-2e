# Getters & Setters
Kinda self-explanatory. Getters and Setters work similarly to Ruby getters/setters. Follow the naming conventions for getting and setting methods.

example:
```java
  class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockstarUsesIt;

    String getBrand() {
      return brand;
    }

    void setBrand(String aBrand) {
      brand = aBrand;
    }

    int getNumOfPickups() {
      return numOfPickups;
    }

    void setNumOfPickups(int num) {
      numOfPickups = num;
    }

    boolean getRockstarUsesIt() {
      return rockstarUsesIt;
    }

    void setRockstarUsesIt(boolean yesOrNo) {
      rockstarUsesIt = yesOrNo;
    }
  }
```
