
public class FibonacciRecursive {
   public  static int n1=0,n2 = 1,n3 = 0;
   public static void main(String args[]){
       //  Print Fibonacci Series of 10 indexs from 0 to 9       
       int count = 10;
       System.out.print(n1+" "+n2+ " ");
       printFibonacciRecursively(count-2);
   }

   public static void printFibonacciRecursively(int count){
      if(count>0){
          n3 = n1+n2;
      n1 = n2;
      n2 = n3;
      System.out.print(n3 + " ");
      printFibonacciRecursively(count-1);
      }      
  }
}


