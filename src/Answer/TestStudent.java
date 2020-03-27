package Answer;
import java.util.*;

public class TestStudent {
    public static void main{
        Scanner sc=new Scanner(System.in);
        Student [] student=new Student[6];
        for(int j=0;j<6;j++) {
            student[j]=new Student();

            for (int i = 0; i < 10; i++) {
                Question.showTitle();
                Question.getAnswer();
                String a = sc.nextLine();
                if (Question.right(a)) {
                    student[j].addStuScore();
                }

                }
            System.out.println(Student.toString());

            }
        }

    }
}
