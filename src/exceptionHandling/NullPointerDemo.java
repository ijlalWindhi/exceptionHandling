package exceptionHandling;
public class NullPointerDemo {
    public static void main(String[] args) {//pemanggilan fungsi main
       String name=null;
       try{// blok try atau blok pengujian
       System.out.print("Length of the string"+name.length());
       }
       catch (Exception e){//blok jika terjadi kesalahan pada NullPointerException
           System.out.println(e+"\nSALAH");
       }
    }
}