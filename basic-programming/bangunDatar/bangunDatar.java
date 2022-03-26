package bangunDatar;

class data {
    public int luas;
    public int keliling;

}

class persegi extends data {

    void luas(int sisi){

        int luas = sisi*sisi;
        System.out.println("Persegi: " + luas);

    }

    void keliling(int sisi){

        int keliling = 4*sisi;
        System.out.println("Persegi: " + keliling);
    }


}

class segitiga extends data {

    void luas(int alas, int tinggi){

        int luas = (alas*tinggi)/2;
        System.out.println("Segitiga: " + luas);
    }

    void keliling(int alas, int tinggi){

        double m = Math.sqrt( Math.pow (alas,2) + Math.pow(tinggi,2));
        double keliling = alas+tinggi+m;
        System.out.println("Segitiga: " + keliling);
    }

}

class persegiPanjang extends data {

    void luas (int panjang, int lebar){

        int luas = panjang*lebar;
        System.out.println("Persegi Panjang: " + luas);
    }

    void keliling (int panjang, int lebar){

        int keliling = 2*(panjang+lebar);
        System.out.println("Persegi Panjang: " + keliling);
    }
}

public class bangunDatar {

    public static void main(String[] args) {

        persegi obj1 = new persegi();
        segitiga obj2 = new segitiga();
        persegiPanjang obj3 = new persegiPanjang();
        System.out.println("Luas");
        obj1.luas(4);
        obj2.luas(3, 4);
        obj3.luas(7,8);

        System.out.println("\n");
        System.out.println("Keliling");
        obj1.keliling(4);
        obj2.keliling(3, 4);
        obj3.keliling(7,8);

    }




}
