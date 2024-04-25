
import java.util.Scanner;
public class AmstrongNumber{

	public static void main(String... args){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
System.out.println(isAmstrong(n));
	}

	private static boolean isAmstrong(int num){
        int org = num;
        int leng = String.valueOf(num).length();
         int sum = 0;
         while(org>0){
          int num1 = org%10;
           sum = sum +(int) Math.pow(num1, leng);
            org = org/10;

}

if(sum==num) return true;


return false;

         

}
}