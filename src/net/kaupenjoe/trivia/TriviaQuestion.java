package net.kaupenjoe.trivia;

public class TriviaQuestion {
    private final String question;
    private final String answer;

    public TriviaQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void outputQuestion() {
        System.out.println(question);
    }

    public void outputAnswer() {
        System.out.println(answer);
    }

    public boolean isAnswerCorrect(String userAnswer) {
        return userAnswer.toLowerCase().equals(answer.toLowerCase());
    }
}
