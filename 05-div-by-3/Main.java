class Main {
  public static void main(String[] args) {
    System.out.println(divby3(123456));
  }

  public static int divby3(int a){
    if (a % 3 == 0){
      System.out.println("The number " + a + " is divisible by 3");
      return(a);
    }
    else{
      System.out.println("The number " + a + " is not divisible by 3");
      return(a);
    }
  }
}