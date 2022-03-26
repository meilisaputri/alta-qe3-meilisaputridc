import java.util.Scanner;

class faktorBilangan {

    public static void main(String[] args) {

        int bilangan;

        Scanner bil = new Scanner(System.in);
        System.out.print("masukan bilangan : ");
        bilangan = bil.nextInt();

        System.out.println("Faktor dari bilangan " + bilangan + " adalah : ");

        for (int i = 1; i <= bilangan; i++) {
                if (bilangan % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
