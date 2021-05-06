package exceptionHandling;
public class RuntimeException {
    public static void main(String[] args) { // pemanggilan fungsi main
        int a = 35; // deklarasi tipe data
        int b = 5; // deklarasi tipe data
        try { // blok try atau blok pengujian
            int x = a / b;
            System.out.println("Hasil: " + x); // tampilan keluaran nilai hasil
            int[] angka = {1, 2, 3, 4, 5}; // array dengan 5 elemen
            angka[24] = 72; // mengakses indek ke 24
        }catch (Exception e) {//blok jika terjadi kesalahan pada ArrayIndexOutOfBoundsException
            System.out.println("Salah");
            System.out.println(e);
        }
        System.out.println("Selesai");
    }
}