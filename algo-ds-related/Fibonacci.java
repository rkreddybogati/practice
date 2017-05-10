
public class Fibonacci {
  
   public static void main(String args[]){
       //  Print Fibonacci Series of 10 indexs from 0 to 9
       for(int i=0; i<10; i++){
             printFibonacci(i);
       }
   }

   public static void printFibonacci(int febNumber){
      int n1 = 0;
      int n2 = 1;
      int n3 = 0;
      if(febNumber==0){
          n3 = 0;
      } else if (febNumber==1){
          n3 = 1;
      } else {
          for(int i=2; i<=febNumber; i++){
             n3 = n1+n2;
             n1 = n2;
             n2 = n3;
          }  
      }
      
      System.out.println("febNumber: "+febNumber+", febVaue: "+n3);
  }
}


