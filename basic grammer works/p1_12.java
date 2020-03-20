import java.util.*;
public class p1_12{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输人一个大写字母");
        char letter=sc.next().charAt(0);
        letter+=32;        
        System.out.println("他的小写是："+letter);
         
    } 
}