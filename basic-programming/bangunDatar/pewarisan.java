package bangunDatar;

class animals {

    String nama1;
    String nama2;


        void identify_myself () {

            System.out.println("Hi, I'm " + this.nama1 + " of All Animal, " + "My name is " + this.nama2 + "\n");
        }
}

class herbivor extends animals {

    String makanan;
    String gigi;

    @Override
    void identify_myself (){

            System.out.println("Hi, I'm " + this.nama1 + ", My name is " + this.nama2 +
                    ", My Food is " + this.makanan + ", I have " + this.gigi + " teeth");
    }
}

class carnivor extends animals {

    String makanan;
    String gigi;

    @Override
    void identify_myself (){

        System.out.println("Hi, I'm " + this.nama1 + ", My name is " + this.nama2 +
                ", My Food is " + this.makanan + ", I have " + this.gigi + " teeth");

    }

}

class omnivor extends animals {

    String makanan;
    String gigi;

    @Override
    void identify_myself (){

        System.out.println("Hi, I'm " + this.nama1 + ", My name is " + this.nama2 +
                ", My Food is " + this.makanan + ", I have " + this.gigi + " teeth" + "\n");
    }
}

public class pewarisan {
    public static void main(String[] args) {
        animals anm = new animals();
        anm.nama1 = "Parent";
        anm.nama2 = "Binatang";
        anm.identify_myself();

        herbivor h = new herbivor();
        h.nama1 = "Herbivore";
        h.nama2 = "Kambing";
        h.makanan = "'tumbuhan'";
        h.gigi = "tumpul";
        h.identify_myself();

        carnivor c = new carnivor();
        c.nama1 = "Carnivore";
        c.nama2 = "Singa";
        c.makanan = "'daging'";
        c.gigi = "tajam";
        c.identify_myself();

        omnivor o = new omnivor();
        o.nama1 = "Omnivore";
        o.nama2 = "Ayam";
        o.makanan = "'semua'";
        o.gigi = "tajam and tumpul";
        o.identify_myself();
    }
}
