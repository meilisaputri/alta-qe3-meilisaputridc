class tabelPerkalian {

  private static String cetakTabelPerkalian(int n) {
      String table = "";
      for (int i = 1; i <= n; i++){
          for (int j = 1; j <= n; j++){
              table += j < n ? i * j + " " : i * j;
          }
          if (i < n) {
              table = table + "\n";
          }
      }
      return table;
  }

  public static void main(String[] args) {
      System.out.println(cetakTabelPerkalian(9));
  }
}
