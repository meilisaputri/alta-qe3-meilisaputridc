import java.util.Scanner;

public class cetakMean {

        public static void main(String[] args) {


                Scanner myObj = new Scanner(System.in);
                System.out.println("masukan list bilangan dengan tanda koma : ");
                String inputan =  myObj.nextLine();
                String[] list_angka = inputan.split(",");
                System.out.println(list_angka);

                int n = list_angka.length;
                float jumlah = 0;
                for (String i : list_angka) {
                    float angka = Float.parseFloat(i);
                    jumlah = jumlah + angka;
                    System.out.println(i);
                }

                System.out.println("Mean " + jumlah / n);
            }
        }
