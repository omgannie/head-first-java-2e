// An exercise to gain a simple understanding of what each line of code in Java is doing.
// Making comments and ending lines of code in Java is similar to JavaScript! Cool!

// declare an integer variable named 'size', with value of 27
int size = 27;

// declare string variable named 'name', with value of 'Fido'
String name = Fido;

// declare a new instance of the 'Dog' class called 'myDog', create with name and size variables ("Fido", 27)
Dog myDog = new Dog(name, size);

// declaring new variable 'x' as an operation. size variable from before is 27, so x = 27 - 5 = 22
x = size - 5;

// conditional statement: if x (value of 22) is less than 15, tell myDog to bark 8 times.
if (x < 15) myDog.bark(8);

// while loop: keep telling myDog to 'play' while x is greater than 3... (so it's an infinite loop)
while (x > 3) {
  myDog.play();
}

// declare a list of integers variable called 'numList'; add 2,4,6,8 to list
int[] numList = {2,4,6,8};

// print "Hello" to command line
System.out.print("Hello");

// print "Dog: Fido" at command line
System.out.print("Dog: " + name);

// declare new string variable called 'num' with value of 8 as a string
String num = "8";

// convert the num string to an integer, save at z as an integer
int z = Integer.parseInt(num);

// try to do read this particular file; if the file doesn't exist or can't find it, print this to command line
try {
  readTheFile("myFile.txt");
}
catch(FileNotFoundException ex) {
  System.out.print("File not found");
}
