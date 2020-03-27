package Answer;

public class Student {
    private int   StuNum;
    private String StuName;
    private String StuGrade;
    public int   StuScore=0;

    public void addStuScore() {
        this.StuScore += 10;
    }

    public String toString() {
        return "Student{" +
                "number='" + StuNum + '\'' +
                ", name='" + StuName + '\'' +
                ", Grade=" + StuGrade +'\''+
                ", score=" + StuScore +'\''+
                '}';
    }
}
