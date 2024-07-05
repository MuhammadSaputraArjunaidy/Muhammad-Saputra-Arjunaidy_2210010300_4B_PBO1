package KantorPos;

// Pewarisan (inheritance)
public class KodeDetail extends KodePos {
    // Polimorfisme (override)
    public KodeDetail(String prov, int kode) {
        super(prov, kode); // Memanggil konstruktor kelas induk (KodePos) untuk menginisialisasi atribut
    }

    // Seleksi
    // Metode untuk mendapatkan kode provinsi berdasarkan dua digit pertama dari 'kode'
    public String getKodePro() {
        String kodeStr = String.valueOf(getKode()); // Mengubah 'kode' menjadi string
        String kodePro = kodeStr.length() >= 2 ? kodeStr.substring(0, 2) : ""; // Mengambil dua digit pertama dari 'kode'
        switch (kodePro) {
            case "70":
                return "Provinsi Kalimantan Selatan"; // Jika 'kodePro' adalah "70"
            case "80":
                return "Provinsi Kalimantan Timur"; // Jika 'kodePro' adalah "80"
            default:
                return "Provinsi tidak ditemukan"; // Jika tidak ada yang cocok
        }
    }

    // Metode untuk mendapatkan kode kabupaten berdasarkan digit ketiga dari 'kode'
    public String getKodeKab() {
        String kodeStr = String.valueOf(getKode()); // Mengubah 'kode' menjadi string
        String kodeKab = kodeStr.length() >= 3 ? kodeStr.substring(2, 3) : ""; // Mengambil digit ketiga dari 'kode'
        switch (kodeKab) {
            case "6":
                return "Kabupaten Tanah Laut"; // Jika 'kodeKab' adalah "6"
            case "8":
                return "Kabupaten Tanah Bumbu"; // Jika 'kodeKab' adalah "8"
            default:
                return "Kabupaten tidak ditemukan"; // Jika tidak ada yang cocok
        }
    }

    // Metode untuk mendapatkan kode kecamatan berdasarkan dua digit keempat dan kelima dari 'kode'
    public String getKodeKec() {
        String kodeStr = String.valueOf(getKode()); // Mengubah 'kode' menjadi string
        String kodeKec = kodeStr.length() >= 5 ? kodeStr.substring(3, 5) : ""; // Mengambil dua digit keempat dan kelima dari 'kode'
        switch (kodeKec) {
            case "11": 
                return "Kecamatan Pelaihari"; // Jika 'kodeKec' adalah "11"
            case "81":
                return "Kecamatan Takisung"; // Jika 'kodeKec' adalah "81"
            default:
                return "Kecamatan tidak ditemukan"; // Jika tidak ada yang cocok
        }
    }
    
    

    // Polimorfisme (override)
    @Override
    public String DisplayInfo() {
        return super.DisplayInfo() + // Memanggil metode DisplayInfo dari kelas induk (KodePos)
                    "\nKode Provinsi: " + getKodePro() + // Menambahkan informasi kode provinsi
                    "\nKode Kabupaten: " + getKodeKab() + // Menambahkan informasi kode kabupaten
                    "\nKode Kecamatan: " + getKodeKec(); // Menambahkan informasi kode kecamatan
    }
}
