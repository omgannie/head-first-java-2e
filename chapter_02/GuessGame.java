// Guessing game has a game object and three player objects
// Game generates a random number from 0 to 9 and the three player objects try to guess the number

public class GuessGame {
  // GuessGame has three instance variables for the three Player objects
  Player p1;
  Player p2;
  Player p3;

  // GuessGame has a method called startGame()
  public void startGame() {
    // create three Player objects and assign them to the three Player instance variables
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    // declare three integers for each player
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    // create target number that players must guess
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("I'm thinking of a number between 0 and 9...");

    while (true) {
      System.out.println("Number to guess is " + targetNumber);

      // tell each instance of Player to 'guess'
      p1.guess();
      p2.guess();
      p3.guess();

      // assign each player's guess to the guess variable
      guessp1 = p1.number;
      System.out.println("Player one guessed " + guessp1);

      guessp2 = p2.number;
      System.out.println("Player two guessed " + guessp2);

      guessp3 = p3.number;
      System.out.println("Player three guessed " + guessp3);

      if (guessp1 == targetNumber) {
        p1isRight = true;
      }
      if (guessp2 == targetNumber) {
        p2isRight = true;
      }
      if (guessp3 == targetNumber) {
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("We have a winner!");

        if (p1isRight) {
          System.out.println("Player 1 is correct!");
          break;
        }
        if (p2isRight) {
          System.out.println("Player 2 is correct!");
          break;
        }
        if (p3isRight) {
          System.out.println("Player 3 is correct!");
          break;
        }
      } else {
        System.out.println("Please try again");
      }
    }
  }
}
