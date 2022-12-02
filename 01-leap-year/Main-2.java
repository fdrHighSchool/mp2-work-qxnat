class Main {
  public static void main(String[] args) {
    isLeapYear(2024);
  }

  public static boolean isLeapYear(int year) {
  if (year % 4 != 0) {
    System.out.println("false"); return false;
  } else if (year % 400 == 0) {
    System.out.println("true"); return true;
  } else if (year % 100 == 0) {
    System.out.println("false"); return false;
  } else {
    System.out.println("true"); return true;
  }
  }
}
