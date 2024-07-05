# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Kantor Pos menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Nama Kantor Pos dan Kode Pos, dan memberikan output berupa informasi detail dari Kode Pos tersebut seperti Provinsi, Kabupaten, Kecamatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `kodePos`, `KodeDetail`, dan `Main` adalah contoh dari class.

```bash
public class KodePos {
    ...
}

public class KodeDetail extends KodePos {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
orang2[i] = new KodeDetail(nama, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `prov` dan `kode` adalah contoh atribut.

```bash
String prov;
int kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KodePos` dan `KodeDetail`.

```bash
public KodePos(String prov, int kode) {
    this.prov = prov;
    this.kode = kode;
}

public KodeDetail(String Prov, int kode) {
    super(prov, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setProv` dan `setKode` adalah contoh method mutator.

```bash
public void setProv(String prov) {
        this.prov = prov; 
    }

    public void setKode(int kode) {
        this.kode = kode;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getProv`, `getkode`, `getKodePro`, `getkodekab`, dan  `getkodekec` adalah contoh method accessor.

```bash
public String getProv() {
    return prov;
}

public String getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `prov` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String prov;
private int kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KodeDetail` mewarisi `KodePos` dengan sintaks `extends`.

```bash
public class KodeDetail extends KodePos {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `KodePos` merupakan overloading method `displayInfo` dan `displayInfo` di `KodeDetail` merupakan override dari method `displayInfo` di `KodePos`.

```bash
public String DisplayInfo(String Asal) {
        return DisplayInfo() + "\nAsal: " + Asal;
    }

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan  seleksi `switch` dalam method .

```bash
public String getKodePro() {
        String kodeStr = String.valueOf(getKode()); 
        String kodePro = kodeStr.length() >= 2 ? kodeStr.substring(0, 2) : "";
        switch (kodePro) {
            case "70":
                return "Provinsi Kalimantan Selatan"; 
            case "80":
                return "Provinsi Kalimantan Timur";
            default:
                return "Provinsi tidak ditemukan";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < orang2.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukan Nama Kantor Pos " + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("Identitas Kode Pos: ");
System.out.println(data.DisplayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KodeDetail[] orang2 = new KodeDetail[2];` adalah contoh penggunaan array.

```bash
KodeDetail[] orang2 = new KodeDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Kesalahan Umum; " + e.getMessage());
}
```
## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Saputra Arjunaidy
NPM: 2110010300
