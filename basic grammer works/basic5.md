1.你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
	输入格式:一系列正整数，整数的范围是（0,100000）。如果输入-1则表示输入结束。
	输出格式：两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的个数。两个整数之间以空格分隔。



import java.util.*;
public class test{
   public static void main(String[] args) {

         
             Scanner sc=new Scanner(System.in);
             int x,count1,count2;

             while(1){
                 x=sc.nextInt();
                 if(x==-1)break;
                 if(x>0&&x<100000){
                 if(x%2==0)count2++;
                 else count1++;
                 }
             }
             System.out.println(count1+" "+count2);
        }
        
}



2:数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数(默认8位)，为了确保安全，
		在传递过程中需要加密，加密规则如下：
			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字， 87654321   8+5=13%10=3  
			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
			然后，把加密后的结果在控制台打印出来




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





3.公司年销售额求和
某公司按照季度和月份统计的数据如下：单位(万元)
第一季度：22,66,44
第二季度：77,33,88
第三季度：25,45,65
第四季度：11,66,99


import java.util.*;
public class test{
   public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] a=new int[12];         

           for(i=0;i<12;i++){
               a[i]=sc.nextIn();
           }
             int sum=0;

             for(i=0;i<12;i++){
               sum+=a[i];
           }
           System.out.println("年收入为"+sum);

        }
        
}
