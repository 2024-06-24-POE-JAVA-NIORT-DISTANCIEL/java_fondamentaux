package journee_4_04_07_2024.cours.livre;

public class QuestionsCours {
    public static int calculSomme(int a,int b){
        return a+b;
    }

    public static void log(String name){
        System.out.printf("Log 04-07-2024 : %s",name);
    }
    public static void main(String[] args) {
        calculSomme(3,4);
        log("Chris");
    }
}
