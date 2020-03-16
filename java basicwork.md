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

 

2.

    int x = 4;

    int y =(x++)+(++x)+(x*10);

System.out.println("x="+x+",y="+y);        

求出x  y的值

 

3.

byte b = 10;

b++;          

b = b + 1;   

求出b的值？

 

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
 

int x = 5, y = 6, z;
   A.z = ++x + y++;
  B.z = ++x + x++;
   C.x = ++x + x++；
  D.z = x > y ? ++x : y++; 
输出ABCD题目中x、y、z的值
 

 

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
 

7.

System.out.println(6 & 3);    

System.out.println(6 & 2);    



System.out.println(6 | 3);   

System.out.println(6 | 2);    



System.out.println(6 ^ 3);   

System.out.println(6 ^ 2);    



System.out.println(~6);      

 

8.Int count=0;

For(int i=0;i<100;i++){

count=count++;

}

求cont输出的值

 

有10长度的字符串数组,根据字符串的长度进行降序排序输出
循环输入10个数(50以内),统计每个数出现的次数
尝试写出杨辉三角
