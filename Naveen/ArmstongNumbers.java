import java.util.Scanner;
class ArmstongNumbers{


public static void main(String args[]){

 Scanner scan = new Scanner(System.in);
int num =scan.nextInt();

boolean status=checkNumber(num);
  if(status){
   System.out.println("Yes");
   }else{
System.out.println("NO");
}

}

public static boolean checkNumber(int num){
  int sum=0;
  int tem=num;
boolean check=false;
String value=String.valueOf(num);
   int power = value.length();
while(num>0){
int rem= num%10;
 sum= sum+ (int) Math.pow(rem,power);
 num= num/10;
}

if(tem==sum){
check=true;
}
  return check;
}

}