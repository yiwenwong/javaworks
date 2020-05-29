package Exam;

public class Question {
    static int number;
    private String name;
    private String a="a";
    private String b="b";
    private String c="c";
    private String d="d";
    private String answer=this.a;

    public Question(String name) {
        this.name = name;
        number+=1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean correct(String ans){
        if(ans==answer)return true;
        else return false;
    }

}
