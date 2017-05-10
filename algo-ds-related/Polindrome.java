
public class Polindrome {

    public static void main(String []args){
       int num = 191;       
       checkPolyndrome(num);
    }

    public static void checkPolyndrome(int num){
        int temp = num;
	    int sum = 0;
        while(num > 0){
            int j = num%10;
            sum = (sum*10) + j;    
            num = num/10;
         }       
         if(sum == temp){
		    System.out.println("Number "+temp+" is polindrome.");
         }
    }
}
