public class mobil {
    public String pemilik;
    public String merek;
    public String warna;
    public String jenis;
    public String model;
    int tahunProduksi;

    public void Mobilku (String pemilik, String merek, String warna, String jenis, String model, int tahunProduksi )
    {this.pemilik = pemilik;
    this.merek = merek;
    this.warna = warna;
    this.jenis = jenis;
    this.model = model;
    this.tahunProduksi = tahunProduksi;
    }

    public void info(){
        System.out.println ("Aku punya mobil keren");
        System.out.println ("pemiliknya" + this.pemilik);
        System.out.println ("mereknya" + this.merek);
        System.out.println ("Warnanya" + this.warna);
        System.out.println ("jenisnya" + this.jenis);
        System.out.println ("modelnya" + this.model);
        System.out.println ("tahunProduksinya" + this.tahunProduksi);

    }

    public void maju(){
        System.out.println("Mobil Maju");

    }

    public void mundur(){
        System.out.println("Mobil Mundur");

    }

    public void belok(){
        System.out.println("Mobil Belok");

    }

    public void berhenti(){
        System.out.println("Mobil Berhenti");

    }
    public void jalan(){
        System.out.println("Mobil Jalan");

    }
}
