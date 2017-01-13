public class SimpleDotComGame {
  public static void main(String[] args) {
    // declare an int var to hold number of guesses, default is 0
    int numOfGuesses = 0;

    // game helper
    GameHelper helper = new GameHelper();

    // make a new SimpleDotCom instance
    SimpleDotCom dotcom = new SimpleDotCom();

    // compute a random number between 0 - 4, that will be starting location cell position
    int randomNum = (int) (Math.random() * 5);

    // make an int array with 3 ints using the randomly generated number, numbers after increment by 1 more than previous number
    int[] locations = {randomNum, randomNum+1, randomNum+2};

    // invoke setLocationCells() method on instance
    dotcom.setLocationCells(locations);

    // declare boolean variable representing the state of the game, set to true
    boolean isAlive = true;

    // while game is alive, get user input from command line
    // check users guess
    // increment numOfGuesses by 1
    // check for dotcom death
    // if result if 'kill', set isalive to false, breaking out of the loop
    // print number of user guesses
    while (isAlive == true) {
      String guess = helper.getUserInput("Enter a number");
      String result = dotcom.checkGuess(guess);
      numOfGuesses++;

      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
