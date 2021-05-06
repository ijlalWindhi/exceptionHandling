package exceptionHandling;
public class ArrayIndexDemo {
    public static void main(String args[])//pemanggilan fungsi main
    {
        int[] nums = {1, 2, 3};//arry dengan 3 elemen
         try{// blok try atau blok pengujian
        nums[4]=3;//mengganti index ke-4 dengan 3
         }
         catch(Exception e){//blok jika terjadi kesalahan pada ArrayIndexOutOfBoundsException
             System.out.println(e);
         }
        System.out.println(""+nums[2]);//menampilkan index ke-2   
    }
}