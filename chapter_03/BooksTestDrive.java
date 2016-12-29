class BooksTestDrive {
  public static void main(String[] args) {

    Books[] myBooks = new Books[3];

    int x = 0;

    myBooks[0] = new Books();
    myBooks[1] = new Books();
    myBooks[2] = new Books();

    myBooks[0].title = "The Grapes of Wrath";
    myBooks[0].author = "John Steinbeck";

    myBooks[1].title = "The Great Gatsby";
    myBooks[1].author = "F. Scott Fitzgerald";

    myBooks[2].title = "Breakfast at Tiffany's";
    myBooks[2].author = "Truman Capote";

    while (x < 3) {
      System.out.print(myBooks[x].title);
      System.out.print(" by ");
      System.out.println(myBooks[x].author);

      x = x + 1;
    }
  }
}
