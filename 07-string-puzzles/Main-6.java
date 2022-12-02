class Main {
  public static void main(String[] args) {
    System.out.println(firsthalf("abcdef"));
    System.out.println(concat("abc", "cat"));
  }
  public static String firsthalf(String a){
    int num = a.length();
    int div = num / 2;
    return a.substring(0, div);
  }

  public static String concat(String a, String b){
    if((a.substring(a.length() - 1, a.length()).equals(b.substring(0,1)))) {
      return a + b.substring(1,b.length());
    }
    else{
      return a+b;
    }
  }
}
