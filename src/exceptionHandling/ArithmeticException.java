package exceptionHandling;
import java.util.Scanner;//memanggil library Scanner
public class ArithmeticException {
    public static void main(String args[])//pemanggilan fungsi main
    {
        Scanner console = new Scanner(System.in);//membuat scanner baru

        System.out.println("Enter the value for c");
	int c = console.nextInt();//menggunakan scanner
        try{// blok try atau blok pengujian
        int res=c/0;//variable res yang akan diisi oleh input user dan dibagi 0
        System.out.println(" The result is "+res);//menampilkan variable res
        }

        catch(Exception e) {//blok jika terjadi kesalahan pada ArithmeticException
            System.out.println(e);
        }
    }
    ArithmeticException(String not_Eligible_for_voting) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
