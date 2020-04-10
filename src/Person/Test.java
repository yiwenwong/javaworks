package Person;


public class Test {
    public static void main(String [] args){
       Person stu=new Student();
       Person wor=new Worker();
       Person lea=new StudentLeader();

       stu.eat();
       stu.sleep();
       stu.work();
       wor.work();
       lea.eat();
       ((StudentLeader)lea).meeting();
    }
}
