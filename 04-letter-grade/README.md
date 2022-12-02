# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * // start of pos/neg
    if ((a % 10 == 0) || (a % 10 == 1) || (a % 10 == 2)){
      grade += "-"; //supposed to give negative symbol
    } else if ((a % 10 == 7) || (a % 10 == 8) || (a % 10 == 9)){
      grade += "+"; //supposed to give positive symbol
    } // end of neg/pos


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  * Maybe make an (a > 100) return grade with an "A+" and stop program


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  * make the pos/neg if and else statements before if statement for F.
