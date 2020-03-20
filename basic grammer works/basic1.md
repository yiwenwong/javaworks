1.手动输入任意三个数，求三个数的和，差

Scanner sc=new  Scanner(System.in);
System.out.println("请输人第一个数");
int  num1=sc.nextInt();

答：见p1_1.java

2.求BCD+2F的值
  BCD
   2F
------
答：BFC

3.10011101  转换成八进制  和十六进制

答：八进制为235，十六进制为9D

4.变量的特点
答：在Java中，每个变量都有一个类型(type)。在声明变量时，变量的类型位于变量名之前。
 变量名必须是一个以字母开头并由字母或数字构成的序列。变量名中所有的字符都是有意义的，并且大小写敏感。变量名的长度基本上没有限制。不能使用 Java 保留字作为变量名。

6. 基本类型的运算）一家商场在举行打折促销，所有商品都进行8 折优惠。一
位程序员把这个逻辑写成：
short price = ...; // 先计算出原价
short realPrice = price * 8 / 10; //再计算出打折之后的价格

问：这段代码是否正确？
如果正确，假设price  为100 ，那计算之后的
realPrice值为多少？如果不正确，应该怎么改正？

答：不正确，price * 8 / 10自动转换成int，再赋值给short类型会报错
要用short realPrice= （short）（price * 8 / 10）; 





7.找错
	void public main(){   //1   

			int i=1,j;  // 

			float f1=0.1;  //f
			float f2=123;   //f
			long  l1=123141L,l2=88888888888;
			double d1=2e20,d2=124;
			byte b1=1,b2=2,b3=129;
			j=j+10;
			i=i/10;
			i=i*0.1;

			char c1='a',c2=125;

			byte b=b1-b2;

			char c=c1+c2-1;   
			float f3=f1+f2;

			float f4=f1+f2*0.1;

			double d=d1*i+j;

			float f=(float)(d1*5+d2);
	
		}
	
答：	 void public main(){ 改为public  static void main(String[] args){ 
		l2=88888888888后加L
		float f1=0.1;  //f    float f2=123;   //f float类型后加F
		byte最大不超过127，删去b3=129
		从double转换到int可能会有损失,i=i*0.1改为i*=0.1
		int转换到byte可能会有损失,byte b=b1-b2改为byte b=(byte)(b1-b2)
		从int转换到char可能会有损失,char c=c1+c2-1改为char c=(char)(c1+c2-1)
		从double转换到float可能会有损失,float f4=f1+f2*0.1改为float f4=(float)(f1+f2*0.1)



8.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
int   a=2;
int  b=3;
int  c=a;

a=b;
b=c;


a=a+b;
b=a-b;

答：见p1_8.java

9.写出下列变量a和b的运算结果。

int a = 9 / 3;

int b = 9 % 2;

答：a=3,b=1


10.判断代码是否有错误，如有，请修改。

float a = 2.1;

float b = (double)20.9;

int b3 = 210.9f +2.51;

int b4 = (int)20.9 + (int)2.51;

答: float a = 2.1F;
	float b = (float)20.9;
	 int b3 = (int)(210.9f +2.51);

12.给定一个任意的大写字母A~Z，转换为小写字母
答：见p1_12.java

13.java的命名规范
       
变量名必须是一个以字母开头并由字母或数字构成的序列。变量名中所有的字符都是有意义的，并且大小写敏感。变量名的长度基本上没有限制。不能使用 Java 保留字作为变量名。

















		