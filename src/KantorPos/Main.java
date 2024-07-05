package KantorPos;

import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class Main {
    public static void main(String[] args) {
        // Membuat objek Identitas
        // KodeDetail orang1 = new KodeDetail("Kantor Pos ", 70611);

        // Menampilkan informasi objek Identitas
        // System.out.println(orang1.DisplayInfo());
        // System.out.println(orang1.DisplayInfo("Tanah Laut"));

        // Penanganan kesalahan (error handling)
        try {
            // IO Sederhana
            Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna

            // Array
            KodeDetail[] orang2 = new KodeDetail[2]; // Membuat array objek KodeDetail dengan panjang 2

            // Perulangan untuk mengisi array
            for (int i = 0; i < orang2.length; i++) {
                System.out.print("Masukan Nama Kantor Pos " + (i + 1) + ": "); // Meminta pengguna memasukkan nama kantor pos
                String nama = scanner.nextLine(); // Membaca input nama dari pengguna
                System.out.print("Masukan Kode Pos " + (i + 1) + ": "); // Meminta pengguna memasukkan kode pos
                int kode = scanner.nextInt(); // Membaca input kode pos dari pengguna
                scanner.nextLine(); // Menangkap newline character setelah nextInt()

                // Membuat objek KodeDetail dengan nama dan kode pos yang dimasukkan pengguna
                orang2[i] = new KodeDetail(nama, kode);
            }

            // Perulangan untuk menampilkan informasi dari array
            for (KodeDetail data : orang2) {
                System.out.println("================="); // Menampilkan garis pemisah
                System.out.println("Identitas Kode Pos: "); // Menampilkan teks statis "Identitas Kode Pos"
                System.out.println(data.DisplayInfo()); // Menampilkan informasi objek KodeDetail
            }
        } catch (Exception e) {
            // Menangani kesalahan umum dan menampilkan pesan kesalahan
            System.out.println("Kesalahan Umum; " + e.getMessage());
        }
    }
}
