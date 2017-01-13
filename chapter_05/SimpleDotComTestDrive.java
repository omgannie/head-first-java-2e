public class SimpleDotComTestDrive {
  public static void main(String[] args) {
    // instantiate a SimpleDotCom obj
    SimpleDotCom dot = new SimpleDotCom();

    // assign it locations in an int array
    int[] locations = {2,3,4};
    dot.setLocationCells(locations);

    // create a string to represent a fake user guess
    String userGuess = "2";

    // invoke checkguess method passing it fake user guess
    String result = dot.checkGuess(userGuess);

    // print out result to see if its correct (passed or failed)
    String testResult = "failed";

    if (result.equals("hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}
