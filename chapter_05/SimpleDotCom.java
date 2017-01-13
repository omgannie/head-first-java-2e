public class SimpleDotCom {
  // DECLARE an int array to hold location cells
  int[] locationCells;
  // DECLARE an in to hold number of hits
  int numOfHits = 0;

  public void setLocationCells(int[] loc) {
    locationCells = loc;
  }

  // check user's guess, return result 'hit', 'miss', or 'kill'
  public String checkGuess(String stringGuess) {
    // convert String guess into an Integer
    int guess = Integer.parseInt(stringGuess);
    // Miss is default result
    String result = "miss";

    // repeat w/ each cell in locationCells array
    for (int cell : locationCells) {
      // compare user guess to element in array
      // if guess is a hit, do this
      if (guess == cell) {
        result = "hit";
        numOfHits++;
        break;
      }
    }

    // if hit 3 times, do this
    if (numOfHits == locationCells.length) {
      result = "kill";
    }

    // print result to screen
    System.out.println(result);

    // return result back to method
    return result;
  }
}
