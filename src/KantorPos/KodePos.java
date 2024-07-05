package KantorPos;

// Kelas KodePos
public class KodePos {
    // Atribut dengan enkapsulasi
    private String prov; // Atribut untuk menyimpan nama provinsi
    private int kode; // Atribut untuk menyimpan kode, diubah menjadi tipe data int

    // Konstruktor
    public KodePos(String prov, int kode) {
        this.prov = prov; // Inisialisasi atribut prov
        this.kode = kode; // Inisialisasi atribut kode
    }

    // Getter
    public String getProv() {
        return prov; // Mengembalikan nilai atribut prov
    }

    public int getKode() {
        return kode; // Mengembalikan nilai atribut kode
    }

    // Setter
    public void setProv(String prov) {
        this.prov = prov; // Mengatur nilai atribut prov
    }

    public void setKode(int kode) {
        this.kode = kode; // Mengatur nilai atribut kode
    }

    // Polimorfisme (overloading)
    public String DisplayInfo() {
        return "Nama Kantor Pos: " + getProv() + "\nKODE: " + getKode(); // Mengembalikan informasi provinsi dan kode
    }

    public String DisplayInfo(String Asal) {
        return DisplayInfo() + "\nAsal: " + Asal; // Menambahkan informasi asal
    }
}
