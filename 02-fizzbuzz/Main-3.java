class Main {
  public static void main(String[] args) {
    fizzybuzzy(30);
  }
  public static int fizzybuzzy(int a) {
    if (a % 15 == 0){
      System.out.println("fizzbuzz");
    } else if (a % 5 == 0){
      System.out.println("fizz");
    } else if (a % 3 == 0){
      System.out.println("buzz");
    } else {
      System.out.println(a);
    } return(a);
  }
}
