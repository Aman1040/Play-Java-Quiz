import java.util.Scanner;

public class QuestionServices {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    int i = 0;

    public QuestionServices() {
        questions[0] = new Question(1, "Size of Int", "2", "4", "6", "8", "4");
        questions[1] = new Question(2, "Size of Double", "2", "4", "6", "8", "8");
        questions[2] = new Question(3, "Size of Character", "2", "4", "6", "8", "2");
        questions[3] = new Question(4, "Size of Long", "2", "4", "6", "8", "8");
        questions[4] = new Question(5, "Size of boolean", "2", "4", "6", "8", "1");
    }

    public void displayQuestions() {
        for (Question q : questions) {
            System.out.println(q);
        }
    }

    /**
     * 
     */
    public void playQuiz() {
        for (Question q : questions) {
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sh = new Scanner(System.in);
            selection[i] = sh.nextLine();
            i++;

        }
        System.out.println("Answer Sheet !");
        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {

            String correctAnswer = questions[i].getAns();
            String userAnswer = selection[i];
            if (userAnswer.equals(correctAnswer))
                score++;
        }
        System.out.println("Your score is : " + score);
    }

}
