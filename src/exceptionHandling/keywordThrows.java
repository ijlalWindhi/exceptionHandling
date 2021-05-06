package exceptionHandling;
public class keywordThrows {
    public static void test(int n)
            throws NullPointerException, java.lang.ArithmeticException {
        if (n < 0) {
            throw new NullPointerException(
                    "KESALAHAN: null pointer");
        } else {
            throw new java.lang.ArithmeticException(
                    "KESALAHAN: arithmetic exception");
        }
    }
    public static void main(String[] args) {
    try {
//test(-12); // menimbulkan eksepsi NullPointerException
        test(-12); // menimbulkan eksepsi ArithmeticException
    } catch (Exception e) {
        System.out.println("Eksepsi ditangkap di sini...");
        System.out.println(e.getMessage());
    }
    System.out.println("Statemen setelah blok try-catch");
    String[] cars = {"Volvo", "BMW", "Ford"};
    for (String i : cars
    ) {
      System.out.println(i);
    }
    }
}