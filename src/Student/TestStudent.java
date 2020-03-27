package Student;
import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);
        System.out.println("请输入数据:");

    //现在把学生对象存放到数组里面去
    Student [] student=new Student[2];

        for (int i = 0; i <student.length; i++) {
            student[i]=new Student();
            student[i].setName(scanner.next());
            student[i].setAddress(scanner.next());
            student[i].setAge(scanner.nextInt());
            student[i].setScore(scanner.nextInt());
        }

        sort(student);
        System.out.println("排名如下：");
        for (int i = 0; i <student.length; i++) {
            System.out.println(student[i].toString());
        }








}

}
