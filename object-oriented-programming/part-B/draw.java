public class draw {

  private static void drawXYZ(int n) {
      
      //int a = 1;

      for (int i = 1; i <= n; i++) {
          for (int j = 1; j < i + n; j++) {



              if (i % 2 == 0 || j % 2 == 0) {
                  System.out.println("Z");
              } else if (i % 2 != 0 || j % 2 != 0) {
                  System.out.println("Y");
              } else if (i % 3 == 0 || j % 3 == 0) {
                  System.out.println("X");
              } else {
                  System.out.println(" ");
              }
          }
      }
  }

      public static void main (String[]args){
          drawXYZ(1);

      }

}
