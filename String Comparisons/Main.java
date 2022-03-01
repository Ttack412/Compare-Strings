import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer value");
    int original = sc.nextInt(); 
    // The int original will take whatever integer value the user enters into the console. (The console is where your code is displayed after hitting the run button.)
    //Do NOT touch the above code...
//------------------------------------------------------
   
    
    // 1. Create an int variable called copy and assign it to the int variable original.

    int copy = original;

    System.out.println(original + " equals " + copy);
    //Once this step is complete hit the run button and enter an integer value into the console...(Console is where your code output shows. It can be any integer value. For instance if I choose to enter 20 into the console and hit enter the console should show equal i.e 20 equals 20) 
//------------------------------------------------------


  int low = 100;
  int high = 100;

  // 2. Now using the == operator to create an if statement to check if the following two ints low and high are equal. Do this operation in between the () for the if statement provided. 

  // 3. In the if statement print out "They are equal". Replace comments in the below block of code (Note: Be sure to remove /** **/ as that is the symbol for multiline comments). 
  

  if(low == high){
      System.out.println("They are equal");  
  }
    else
  {
    System.out.println("They are false"); 
  }


// Run your code and see if it proves true or false.
//------------------------------------------------------

    String string1 = "Hello World";

    String string2 = new String("Hello World");

// 4. Create a print statement that compares the two strings using the == operator.

    if(string1 == string2){
      System.out.println("true");  
  }
    else
  {
    System.out.println("false"); 
  }
//Once step 4 is complete run the code and see if it proves true or false.

// 5. Now try using the string method .equals() for the same task as above.
    if(string1.equals(string2)){
      System.out.println("true");  
  }
    else
  {
    System.out.println("false"); 
  }
  
    
  }
}