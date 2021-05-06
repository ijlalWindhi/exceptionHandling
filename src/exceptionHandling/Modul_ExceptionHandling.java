package exceptionHandling;
import java.util.Scanner;//memanggil library scanner
public class Modul_ExceptionHandling {
    public static void main(String[] args) {//pemanggilan fungsi main

        int[] array = {0,1,2,3};//arry dengan 4 elemen
        Scanner userInput = new Scanner(System.in);//membuat scanner baru
        
        System.out.print("Nilai Array ke = ");
        int index = userInput.nextInt();//menggunakan scanner
        
        try{// blok try atau blok pengujian
            System.out.printf("Index ke %d, adalah %d\n", index, array[index]);
        }
        catch(Exception x){//blok jika terjadi kesalahan pada ArrayIndexOutOfBoundsException
            System.out.println("SALAH");
        }
        System.out.println("Akhir program ");
    }   
}