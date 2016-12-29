public class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Casablanca";
    one.genre = "Romance";
    one.rating = 5;
    System.out.println(one.title + " is a " + one.genre + " movie and has a rating of " + one.rating);

    Movie two = new Movie();
    two.title = "Star Wars: A New Hope";
    two.genre = "Action";
    two.rating = 5;
    System.out.println(two.title + " is a " + two.genre + " movie and has a rating of " + two.rating);
    two.playIt();

    Movie three = new Movie();
    three.title = "Tarzan";
    three.genre = "Family";
    three.rating = 4;
    System.out.println(three.title + " is a " + three.genre + " movie and has a rating of " + three.rating);
    three.playIt();
  }
}
