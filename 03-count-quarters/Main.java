class Main {
  public static void main(String[] args) {
    System.out.println(countQuaters(1239484));
  }

  public static int countQuaters(int a) {
    String quaters = Integer.toString(a);
    if (quaters.length() == 1) {
      return 0;
    }
    String variable = quaters.substring(quaters.length() - 2);
    return (Integer.parseInt(variable)/25);
  }
}