import java.util.*;
public class test{
   public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
  int num=0,temp,len=0;
   do
   {
    System.out.print("请输入一个8位正整数：");
    num = sc.nextInt();
      }
   while (num>99999999);
  int a[]=new int[8];   
   a[0] =  num/10000000;   
   a[1] = (num/1000000)%10; 
   a[2] = (num/100000)%10;  
   a[3] = (num/10000)%10;  
   a[4] = (num/1000)%10;   
   a[5] = (num/100)%10;   
   a[6] = (num/10)%10;   
   a[7] = num%10;    



   for(int j=7;a[j]>0;j--)
  {
      len++;
  }

len--;

for(int j=0;j<len;j++)
  {
        temp = a[j];   
       a[j] = a[len-j];   
       a[len-j] =temp;  
  }




  for(int j=0;j<len;j++)
  {
   a[j]+=5;      
   a[j]%=10;      
  }
   
    temp = a[0];   
       a[0] = a[len];   
       a[len] =temp;  
   
  
  System.out.print("加密后的数字为：");
  for(int j=0;j<len;j++)
  System.out.print(a[j]);
        }
        
}
