package Student;

public class Student {
    private String name;
    private String address;
    private int   age;
    public int  score;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +'\''+
                ", score=" + score +'\''+
                '}';
    }
}
