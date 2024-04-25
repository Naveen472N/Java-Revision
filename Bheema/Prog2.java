import java.util.Scanner;

public class Prog2{
//23 34 66  = 120
	public static void main(String... args){
		  Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
      
     if(a%10<5) {
          a=a/10;

          a=a*10;
}
     else a = (a/10+1)*10;

			if(b%10<5) b = (b/10)*10;
     else b = (b/10+1)*10;

			if(c%10<5) c = (c/10)*10;
     else c = (c/10+1)*10;
         

   System.out.println(a+b+c);



}

}