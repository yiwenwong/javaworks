  1.

int a = 10;

    int b = 10;

    int c = 10;

    a = b++;    

    c = --a;    

    b = ++a;    

    a = c--;    

System.out.println("a="+a+",b="+b+",c="+c);

求出a  b  c的值

 a=9,b=10,c=8

2.

    int x = 4;

    int y =(x++)+(++x)+(x*10);

System.out.println("x="+x+",y="+y);        

求出x  y的值
 
x=6,y=70

3.

byte b = 10;

b++;          

b = b + 1;   

求出b的值？

 b=12




public static void main(String[] args) {
          int i = 0;
          test(i);
          i = ++i;
         System.out.println("----" + i);
         i = i++;
         System.out.println("****" + i);         
     }
     
     public static void test(int i){
         i++;
         System.out.println("++++" + i);
     }
 

++++1
----1
****1




int x = 5, y = 6, z;
   A.z = ++x + y++;
  B.z = ++x + x++;
   C.x = ++x + x++；
  D.z = x > y ? ++x : y++; 
输出ABCD题目中x、y、z的值
 

 A.x=6,y=7,z=12
 B.x=7,y=6,z=12
 C.x=12,y=6,z出错
 D.x=5,y=7,z=6







String a ="aa";  
int c = 555;  
String b = a+"bbb"+c;  
double d = 5.66600;  
int e = (int) d;  
int f = 3;  
double g = 3.53; 
float h = 1.7f;  
int i = 1;  
System.out.println(b); 
System.out.println(e);  
System.out.println( f/i );  
System.out.println( g/f);  
System.out.println( h/f );
System.out.println(  9.5<8 );  
System.out.println( (int)'a' +  (int)'z' );  
System.out.println("A~Z："+((int)'A')+"~"+((int)'Z'));  
System.out.println("'A' < 'a':"+('A' < 'a'));
 
aabbb555
5
3
1.1766666666666665
0.56666666
false
219
A~Z：65~90
'A' < 'a':true



7.

System.out.println(6 & 3);    

System.out.println(6 & 2);    



System.out.println(6 | 3);   

System.out.println(6 | 2);    



System.out.println(6 ^ 3);   

System.out.println(6 ^ 2);    



System.out.println(~6);      

 
2
2
7
6
5
4
-7


8.Int count=0;

For(int i=0;i<100;i++){

count=count++;

}

求cont输出的值

 count=0




有10长度的字符串数组,根据字符串的长度进行降序排序输出


import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.next();
        StringBuffer a=new StringBuffer();
         int i=p.length()-1;
          
        for( ;i>=0;i--){
           a.append(p.charAt(i));
        }

         System.out.println(a);
     }
     
    
}



循环输入10个数(50以内),统计每个数出现的次数

import java.util.*;
public class test{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] a=new int[50];
       int p,i;
        for(i=0;i<50;i++){
             a[i]=0;

        }
        
            
        for(i=0;i<10;i++){
            p=sc.nextInt();
            if(p>=0&&p<=50)
            a[p]++;

        }
        
        for(i=0;i<50;i++){
            if(a[i]>0)
            System.out.println("数字"+i+"出现的次数为："+a[i]);

        }
          
     }
     
    
}

尝试写出杨辉三角

public class test{
   public static void main(String[] args) {
       int rows = 10;
 
		for (int i = 0; i < rows; i++) {
			int number = 1;
			 
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}

 
   }
}