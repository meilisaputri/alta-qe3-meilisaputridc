package bangunDatar;

class data1 {

    public int volume;
}

class kubus extends data1 {
    void volume (int sisi){

        int volume = sisi*sisi*sisi;
        System.out.println("Kubus: " + volume);

    }
}

class balok extends data1 {
    void volume (int panjang, int lebar, int tinggi) {

        int volume = panjang*lebar*tinggi;
        System.out.println("Balok: " + volume);
    }
}

class tabung extends data1 {
    void volume (double radius, double tinggi) {
        double phi = 22.0 / 7.0;
        double volume = phi*radius*radius*tinggi;
        System.out.println("Tabung: " + volume);
    }
}


public class bangunRuang {

    public static void main(String[] args) {

        kubus obj4 = new kubus();
        balok obj5 = new balok();
        tabung obj6 = new tabung();
        System.out.println("Volume");
        obj4.volume(10);
        obj5.volume(3, 6, 10);
        obj6.volume(7, 10);
    }
}
