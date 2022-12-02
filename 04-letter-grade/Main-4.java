class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(29));
  }
  public static String letterGrade(int a){
    String grade = "";
    //start of letter grade
    if (a >= 90){
      grade = "A";
    } else if (80 <= a){
      if (a < 90){
        grade = "B";
      }
    } else if (70 <= a){
      if (a < 80){
        grade = "C";
      }
    } else if (60 <= a){
      if (a < 70){
        grade = "D";
      }
    } // end of A-D
    // start of pos/neg
    if ((a % 10 == 0) || (a % 10 == 1) || (a % 10 == 2)){
      grade += "-"; //supposed to give negative symbol
    } else if ((a % 10 == 7) || (a % 10 == 8) || (a % 10 == 9)){
      grade += "+"; //supposed to give positive symbol
    } // end of neg/pos

    if (a < 60){
      grade = "F";
    } //end of method
    return grade;
  }
}