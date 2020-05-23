package Collection;

import java.util

public class Student{
    private String name;
    private int age;
    private int score;
    private int average;


    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.average= score/3;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public int getAverage() {
        return average;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", average=" + average +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        int num = this.average - o.getAverage();

        int key = num == 0 ? this.name.length() - o.getName().length() : num;

        int num1 = key == 0 ? this.name.compareTo(o.getName()) : key;

        return num1;
    }

}





public class print{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> student = new TreeSet();

        for(i=0;i<5;i++){
            student.add(new Student(sc.next(),sc.nextInt(),sc.nextInt() ));
        }

        System.out.println(student);


    }
}
