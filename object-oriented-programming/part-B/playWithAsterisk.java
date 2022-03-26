class playWithAsterisk {
  private static void asterisk (int n) {

      int a,b,c;
      for(a = 1; a <= n; a++)
      {
          for(b = n; b >= a; b--)
          {
              System.out.print(" ");
          }
          for( c = 1; c <= a; c++)
          {
              System.out.print("* ");
          }
          System.out.println("");
      }
      System.out.println("");

  }

  public static void main(String[] args) {
      asterisk(5);
  }
}
