package exceptionHandling;
public class TestThrow {
    static void validate(int age){
     try{
        if(age<18){
         throw new java.lang.ArithmeticException("not valid");  
        }
        else{
         System.out.println("welcome to vote");
        }
     }
     catch(Exception e){
         System.out.println(e);
     }
   }  
   public static void main(String args[]){  
      validate(13);  
      System.out.println("rest of the code...");  
  }
}