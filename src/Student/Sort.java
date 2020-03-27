package Student;

public class Sort {
    public void sort(Student student[]){
        for(int i=0;i<student.length;i++){
            int index=i;
            Student temp;
            for(int j=i;j<student.length;j++){
                if(student[index].score<student[j].score){
                    index=i;
                }
            }
            if(index!=i){
                temp=student[i];
                student[i]=student[index];
                student[index]=temp;
            }
        }
    }
}
