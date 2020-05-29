package Exam;
import java.util.*;

public class Test {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        List <Student> studentArraylist=new ArrayList<Student>();
        List <Question> questionList=new ArrayList<Question>(5);


        studentArraylist.add(new Student("李四"));
        System.out.println("请输入密码");
        if(studentArraylist.get(0).comparePass(sc.next())){
            for (int i=0;i<5;i++){
                if(questionList.get(i).correct(sc.next()))
                    studentArraylist.get(0).right();
            }
        }
        System.out.println(studentArraylist.get(0).toString());


    }
}
