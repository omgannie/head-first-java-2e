class Hobbits {
  String name;

  public static void main(String[] args) {
    Hobbits[] h = new Hobbits[3];

    int x = -1;

    while (x < 2) {
      x = x + 1;
      h[x] = new Hobbits();
      h[x].name = "bilbo";

      if (x == 1) {
        h[x].name = "frodo";
      }
      if (x == 2) {
        h[x].name = "sam";
      }

      System.out.println(h[x].name + " is a good Hobbit name");
    }
  }
}
