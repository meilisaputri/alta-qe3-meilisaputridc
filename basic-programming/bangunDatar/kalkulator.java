package bangunDatar;

class data2 {
    public int hasil;

}

class penjumlahan extends data2 {

    void hasil (int a, int b){

        hasil = a + b;
        System.out.println("Penjumlahan: " + hasil);
    }
}

class pengurangan extends data2 {

    void hasil (int c, int d){

        hasil = c - d;
        System.out.println("Pengurangan: " + hasil);
    }
}

class perkalian extends data2 {

    void hasil (int e, int f){

        hasil = e * f;
        System.out.println("Perkalian: " + hasil);
    }
}

class pembagian extends data2 {

    void hasil (int g, int h){

        hasil = g / h;
        System.out.println("Pembagian: " + hasil);
    }
}

public class kalkulator {
    public static void main(String[] args) {

        penjumlahan tambah = new penjumlahan();
        pengurangan kurang = new pengurangan();
        perkalian kali = new perkalian();
        pembagian bagi = new pembagian();
        tambah.hasil(3,4);
        kurang.hasil(15, 4);
        kali.hasil(10,10);
        bagi.hasil(12,3);

    }
}
