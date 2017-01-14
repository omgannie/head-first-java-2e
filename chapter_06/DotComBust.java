import java.util.*;

public class DotComBust {
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
  private int numOfGuesses = 0;

  public void setUpGame() {
    DotCom firstDotCom = new DotCom();
    firstDotCom.setName("Pets.com");
    DotCom secondDotCom = new DotCom();
    secondDotCom.setName("eToys.com");
    DotCom thirdDotCom = new DotCom();
    thirdDotCom.setName("Go2.com");

    dotComsList.add(firstDotCom);
    dotComsList.add(secondDotCom);
    dotComsList.add(thirdDotCom);

    System.out.println("Your goal is to sink three dot coms.");
    System.out.println("Pets.com, eToys.com, Go2.com");
    System.out.println("Try to sink them all in the fewest number of guesses");

    for (DotCom dotComToSet : dotComsList) {
      ArrayList<String> newLocation = helper.placeDotCom(3);
      dotComToSet.setLocationCells(newLocation);
    }
  }

  private void startPlaying() {
    while (!dotComsList.isEmpty()) {
      String userGuess = helper.getUserInput("Enter a guess");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  private void checkUserGuess(String userGuess) {
    numOfGuesses ++;
    String result = "miss";

    for (DotCom dotComToTest : dotComsList) {
      result = dotComToTest.checkGuess(userGuess);

      if (result.equals("hit")) {
        break;
      }
      if (result.equals("kill")) {
        dotComsList.remove(dotComToTest);
        break;
      }
    }

    System.out.println(result);
  }

  public void finishGame() {
    System.out.println("All Dot Coms are dead! Your stock is now worthless.");

    if (numOfGuess <= 18) {
      System.out.println("It only took you " + numOfGuesses + " guesses.");
    } else {
      System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
    }
  }

  public static void main (String[] args) {
    DotComBust game = new DotComBust();

    game.setUpGame();
    game.startPlaying();
  }
}
