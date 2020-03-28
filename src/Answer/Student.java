package Answer;

public class Student {
    private int   StuNum;
    private String StuName;
    private String StuGrade;
    public int   StuScore=0;

    public void addStuScore() {
        this.StuScore += 10;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "StuNum=" + StuNum +
                ", StuName='" + StuName + '\'' +
                ", StuGrade='" + StuGrade + '\'' +
                ", StuScore=" + StuScore +
                '}';
    }
}
