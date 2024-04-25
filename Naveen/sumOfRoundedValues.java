import java.util.Scanner;

class sumOfRoundedValues{

public static void main(String args[]){

Scanner scan = new Scanner(System.in);
int num1= scan.nextInt();
int num2= scan.nextInt();
int num3= scan.nextInt();
int sumofRounded=sum(num1,num2,num3);

System.out.println(sumofRounded);


}

public static int sum(int num1,int num2,int num3){


  int a = num1%10;
  int b = num2%10;
  int c = num3%10;
  int sum=0;

  if(a<5){
   sum=sum+(num1/10) * 10;
   }else{
   sum=sum+ (num1/10 + 1)*10;
  } 

  if(b<5){
   sum=sum+(num2/10) * 10;
    }else{
   sum=sum+ (num2/10 + 1)*10;
  } 

  if(c<5){
   sum=sum+(num3/10) * 10;
      }else{
   sum=sum+ (num3/10 + 1)*10;
  } 

return sum;

}

}