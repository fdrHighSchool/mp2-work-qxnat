class Main {
  public static void main(String[] args) {
    //rectangle(5, 4);
    //square(5);
    //rightTriangle(20);
    //triangle(5);
  }
  //square method
  public static void square(int a){
    for (int row = 0; row < a; row++){
      for (int column = 0; column < a; column++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  //rectangle method
  public static void rectangle(int a, int b){
    for (int column = 0; column < a; column++){
      for (int row = 0; row < b; row++){
        System.out.print("* ");
      }
    System.out.println();
    }
  }
  //right triangle method 
  public static void rightTriangle(int a){
    for (int column = 0; column < a; column++){
      for (int row = 0; row <= column; row++){
        System.out.print("* ");
      }
    System.out.println();
    }
  }

  //triangle method
  public static void triangle(int a){
    for (int i = 1; i <= a; i++) {
      for (int space = 1; space <= a - i; space++) {
        System.out.print("  ");
      }

      for (int k = 1; k <= 2 * i - 1; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}