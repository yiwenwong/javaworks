package Exam;

public class Student {
    private int number;
    private String name;
    private String pass="888";
    private int score;

    public Student(String name) {
        this.name = name;
    }

    public void right(){
        score+=10;
    }



    public boolean comparePass(String p){
        if (p==pass)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
