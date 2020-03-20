1.从键盘输入一个班5个学生的分数，求和并输出


import java.util.*;
public class test{
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("请输人第一个成绩");
        int num1=sc.nextInt();
        System.out.println("请输人第二个成绩");
        int num2=sc.nextInt();
        System.out.println("请输人第三个成绩");
        int num3=sc.nextInt();
         System.out.println("请输人第四个成绩");
        int num4=sc.nextInt();
         System.out.println("请输人第五个成绩");
        int num5=sc.nextInt();
        int sum=num1+num2+num3+num4+num5;
        System.out.println("他们的和是："+sum);
         
 
   }
}


2.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。


import java.util.*;
public class test{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		System.out.print("请输入十进制数：");
		int num = sc.nextInt();
		String a = "";
		while(num!=0) { 
			a=num%2+a;
			num=num/2;
		}
		System.out.println(a);
         
 
   }
}




3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。


import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] a=new int[10];
       int max,min,i;
        for(i=0;i<10;i++){
             a[i]=sc.nextInt();

        }
        max=a[0];
        min=a[0];
            
        for(i=0;i<10;i++){
            if(a[i]>max)max=a[i];
        }
             
        for(i=0;i<10;i++){
            if(a[i]<min)min=a[i];
        }
      System.out.println("最大值为："+max);
       System.out.println("最小值为："+min);   
     }
     
    
}



4.找出能被5或6整除，但不能被两者同时整除的数


public class test{
   public static void main(String[] args) {
       int i;
       for(i=0;i<=1000;i++){

           if(i%5==0&&i%6==0&&i%30!=0)
           System.out.println(i);
       }
    
}



5.请输入一个任意年份,判断是否是闰年


import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        boolean flag;
        if(y%100!=0){
            if(y%4==0)flag=true;
            else flag=false;
        }
        else if(y%400==0)flag=true;
        else flag=false;

        if(flag)System.out.println("是闰年");
        else System.out.println("不是闰年");
}


6.30以内的随机数,请输入任意一个数,循环10次,求这个数在随机数范围内出现的次数


import java.util.*;
public class test{
   public static void main(String[] args) {

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (num == (int) (Math.random() * 29)) {
                count++;
            }
        }
        System.out.println(count);
}

7.输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）


import java.util.*;
public class test{
   public static void main(String[] args) {

         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
      String a = "";
		while(num!=0) { 
			a=num%10+a;
			num=num/10;
		}
		System.out.println(a);
}