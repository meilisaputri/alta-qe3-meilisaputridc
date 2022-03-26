package bangunDatar;
class barang {

    public int dimensi;

}
class barangdimensi extends barang{

    void dimensiBarang (int panjang, int lebar, int tinggi, int berat) {

        dimensi = panjang*lebar*tinggi;

        int harga = 0;
        if( dimensi != 0 && berat != 0){

            if (dimensi <= 50 && berat == 1) {
                harga = 5000 * berat;
            } else {
                if (dimensi <= 50 && berat >= 1){
                    harga = 5000 * berat;
                } else {
                    if (dimensi >= 50 && berat >= 1) {
                        harga = 5000 * berat;
                    }
                }
            }
            System.out.println("Harga: Rp " + harga);
        }
    }
}


public class ongkosKirim {
    public static void main(String[] args) {

        barangdimensi obj7 = new barangdimensi();
        obj7.dimensiBarang(5,2,4,1);

    }
}
