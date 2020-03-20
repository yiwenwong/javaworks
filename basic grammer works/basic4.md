1.任意输入 n行 n列的乘法口诀表


import java.util.*;
public class test{
   public static void main(String[] args) {
        System.out.println("请输入n行n列：");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         
            int mul=0;
            for (int i=1;i<=n;i++)
            {            
 
                for (int j=1;j<=i;j++)
                {
                    mul=i*j;
                    System.out.print(j+"*"+i+"="+mul+"\t");
 
                      }

            }
        }
}




2.输入三个班，每班10个学生的成绩，求每个班的总分和平均分



import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,sum1=0,sum2=0,sum3=0;
        System.out.println("请输人第一个班的成绩");

        for(i=0;i<10;i++){
          num1=sc.nextInt();
            sum1+=num1;
        }
         
        System.out.println("请输人第二个班的成绩");

        for(i=0;i<10;i++){
          num2=sc.nextInt();
            sum2+=num2;
        }

        System.out.println("请输人第三个班的成绩");

        for(i=0;i<10;i++){
          num3=sc.nextInt();
            sum3+=num3;
        }


        System.out.println("第一个班的总分是："+sum1);
         System.out.println("第二个班的总分是："+sum2);
          System.out.println("第三个班的总分是："+sum3);

          double ave1=sum1/10,ave2=sum2/10,ave3=sum3/10;

         System.out.println("第一个班的均分是："+ave1);
         System.out.println("第二个班的均分是："+ave2);
          System.out.println("第三个班的均分是："+ave3);
        }
}




5.打印出下面的图案
54321
5432
543
54
5



public class test{
   public static void main(String[] args) {
         System.out.println("54321\n5432\n543\n54\n5\n");
        }
}




定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出


public class test{
   public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3, 4, 5, 6, 0};
        int max = n[0];
        int index=0;
        for (int i = 0; i < n.length;i++){
            if(max<n[i]){
                max=n[i];
                index=i;
            }
        }
        System.out.println("最大值："+max);
        System.out.println("下标："+index);
 
        }
}

输入10个整数存入数组，然后复制到b数组中输出

import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int i,num;
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }

          for(i=0;i<10;i++){
            b[i]=a[i];
        }
 
        for(i=0;i<10;i++){
            System.out.println(b[i]);
        }
        }
}



声明一个int型的数组，循环接收8个学生的成绩，计算这8个学生的总分及平均分、最高分和最低分


import java.util.*;
public class test{
   public static void main(String[] args) {
        double arr[]= new double [8];
   
    double max= 0,avg = 0,min = 150,sum = 0;
    System.out.println("请输入8人的成绩：");
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 8; i++) {
       
         arr[i] = sc.nextInt();
        
         sum += arr[i];
    }
     System.out.println("总分为:"+sum);
    avg = sum/8;
    System.out.println("平均分:"+avg);
      
    for (int i = 0; i < 8; i++) {
        if (max<arr[i]) {
            max = arr[i];
        }
        min = min>arr[i]?arr[i]:min;
    }
    System.out.println("最大值:"+max);
    System.out.println("最小值:"+min);
        }
}



定义一个长度为10的整型数组，循环输入10个整数。 然后将输入一个整数，查找此整数，找到 输出下标，没找到给出提示。


import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] a=new int[10];
       int i;
       boolean flag=false;
        for(i=0;i<10;i++){
             a[i]=sc.nextInt();
        }
        int x=sc.nextInt();

        for(i=0;i<10;i++){
             if(x=a[i]){
                 flag=true;
                 System.out.println("下标为："+i);
             }
                   
        }

       if(flag=false)System.out.println("不存在");
        }
}



在一个数组中找出最大和最小值，并输出它们的位置


import java.util.*;
public class test{
   public static void main(String[] args) {
      int i,min,max;
    int []A=new int[10] ;  
    for(i=0;i<10;i++){
             A[i]=sc.nextInt();
        }


    min=max=A[0];
    System.out.print("数组A的元素包括：");
    int j =0;
    int n =0 ;
    for(i=0;i<A.length;i++)
{
    System.out.print(A[i]+" ");
    if(A[i]>max)  
    j =i;
    max=A[i];
    if(A[i]<min)  
    min=A[i];
    n =i;
}
        System.out.println("\n数组的最大值是："+max+".数组的位置是："+（j+1）);  
        System.out.println("数组的最小值是："+min+".数组的位置是："+（n+1）);  
        }
}




  有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
0  1  2  3  4  5  6  7  8  9 

   随机30个数字 

public class test{
   public static void main(String[] args) {

         public static void main(String[] args) {
             int i,num;
             int []A=new int[10] ;  
            for(i=0;i<10;i++){
             A[i]=0;
        }
     
        
        for (int i = 0; i < 30; i++) {
            num = (int) (Math.random() * 9) {
                A[num]++;
            }
        }

         for(i=0;i<10;i++){
              System.out.println("数字"+i+"出现了"+A[i]+"次");
        }
        
}


