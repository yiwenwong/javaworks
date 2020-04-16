package Player;

public class Test {
    public static void main(String [] args){
        EnglishInterface basketballCoach=new BasketballCoach();
        basketballCoach.learning();
        EnglishInterface bas= new Basketballer();
        bas.learning();
        EnglishInterface tt=new TableTennisCoach();
        tt.learning();
        EnglishInterface tter=new TableTennisser();
        tter.learning();
    }
}
