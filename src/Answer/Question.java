package Answer;

public class Question {
    private int number;
    private String title="这是一道题";
    private String answerA="a";
    private String answerB="b";
    private String answerC="c";
    private String answerD="d";
    private String Answer;

    public void showTitle(){
        System.out.println(title);
    }

    public String getAnswer(){
        int i=(int)(Math.random()*4);
        switch (i):
        case 0:this.Answer=answerA;
        break;
        case 1:this.Answer=answerB;
        break;
        case 2:this.Answer=answerC;
        break;
        case 3:this.Answer=answerD;
        break;
    }
    public boolean right(String answer){
        if(answer=this.Answer)
            return True;
        else
            return False;
    }



}
