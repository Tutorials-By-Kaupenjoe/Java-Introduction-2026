package net.kaupenjoe.trivia;

public record TriviaQuestion(String question, String answer) {
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
