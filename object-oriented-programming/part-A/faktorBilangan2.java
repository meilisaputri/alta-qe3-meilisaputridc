import java.util.Scanner;

class faktorBilangan2 {
    public static void main(String[] args) {

        int bilangan;
        int temp;

        Scanner bil = new Scanner(System.in);
        System.out.println("masukan bilangan : ");
        bilangan = bil.nextInt();
        int [] a = new int[bilangan];

        System.out.println("Faktor dari bilangan " + bilangan + " adalah : ");

        for (int i = bilangan; i >= 1; i--) {

            if (bilangan % i == 0)

            {
                System.out.print(i + " ");
            }
        }
    }
}
