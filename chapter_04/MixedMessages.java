public class MixedMessages {
  int counter = 0;

  public static void main(String[] args) {
    int count = 0;

    MixedMessages[] mm = new MixedMessages[20];

    int x = 0;

    while (x < 7) {
      mm[x] = new MixedMessages();
      mm[x].counter = mm[x].counter + 1;

      count = count + 1;
      count = count + mm[x].maybeNew(x);
      x = x + 1;
    }

    System.out.println(count + " " + mm[1].counter);
  }

  public int maybeNew(int index) {
    if (index < 7) {
      MixedMessages mm2 = new MixedMessages();

      mm2.counter = mm2.counter + 1;
      return 1;
    }

    return 0;
  }
}
