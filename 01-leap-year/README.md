# Leap Year
#### Respond to the following:

1. Rewrite the following nested `if()` statements in a single line:
  ```
  if ((year % 4 == 0) && (year % 100 != 0)){
      // DO STUFF
  } // end if statement
  ```
  * **YOUR WRITING HERE**


2. Label each as either correct or incorrect syntax. If incorrect, rewrite below:
  * if (x == y) {

    * Correct

  * if [x == 10] {

    * Incorrect syntax

  * if x = 10 then {

    * Incorrect syntax if (x = 10){....} else{...}

  * if (x equals 42) {

    * Incorrect syntax, (x == 42)

  * if (x => y) {

    * Incorrect syntax, (x >= y)


3. Fix the error in the code below:

  ```
  Scanner console = new Scanner(System.in);
  System.out.print("What is your favorite color? ");
  String name = console.next();
  if (name == "blue") {
      System.out.println("Mine, too!");
  }
  ```

  * Scanner console = new Scanner(System.in);
  * System.out.println("What is your favorite color? ");
  * String favcolor = console.nextLine(); //replaced name w/ favcolor
  * if (favcolor == "blue"){
  *     System.out.println("Mine too!");
  * }
