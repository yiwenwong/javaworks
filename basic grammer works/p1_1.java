import java.util.*;
public class p1_1{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人第一个数");
        int num1=sc.nextInt();
        System.out.println("请输人第二个数");
        int num2=sc.nextInt();
        System.out.println("请输人第三个数");
        int num3=sc.nextInt();
        int sum=num1+num2+num3;
        System.out.println("他们的和是："+sum);
        int dif1=num1-num2-num3;
        int dif2=num2-num1-num3;
        int dif3=num3-num2-num1;
        System.out.println("他们的差是："+dif1+" "+dif2+" "+dif3);
    } 
}