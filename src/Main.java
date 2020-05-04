public class Main {
    public static void main(String[] args) {

        mobil mymobil = new mobil();

        mymobil.pemilik = "iin";
        mymobil.merek = "Avanza";
        mymobil.warna = "Silver";
        mymobil.jenis = "Matic";
        mymobil.model = "Terbaru";



        mymobil.info();

        mymobil.maju();
        mymobil.mundur();
        mymobil.belok();
        mymobil.berhenti();
        mymobil.jalan();
    }
}
