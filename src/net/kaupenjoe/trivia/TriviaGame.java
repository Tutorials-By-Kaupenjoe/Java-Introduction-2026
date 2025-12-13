package net.kaupenjoe.trivia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
    private final Random random;
    private final List<TriviaQuestion> questions = new ArrayList<>();

    private int score = 0;

    public TriviaGame() {
        // The constructor initializes everything!
        random = new Random();

        questions.add(new TriviaQuestion("What does WWW stand for?", "World Wide Web"));
        questions.add(new TriviaQuestion("What is the capital of France?", "Paris"));
        questions.add(new TriviaQuestion("What is the world's largest ocean?", "Pacific Ocean"));
        questions.add(new TriviaQuestion("Which planet is known as the Red Planet?", "Mars"));
        questions.add(new TriviaQuestion("What is the chemical symbol for water?", "H2O"));

        questions.add(new TriviaQuestion("Who painted the Mona Lisa?", "Leonardo da Vinci"));
        questions.add(new TriviaQuestion("What is the main ingredient in guacamole?", "Avocado"));
        questions.add(new TriviaQuestion("What is the tallest mountain on Earth?", "Mt. Everest"));
        questions.add(new TriviaQuestion("What is the currency of Japan?", "Yen"));
        questions.add(new TriviaQuestion("What is the largest desert in the world?", "Sahara"));

        questions.add(new TriviaQuestion("What was the Greek equivalent of the Roman god Neptune?", "Poseidon"));
        questions.add(new TriviaQuestion("Who is known as the \"Father of the United States\" and the first President of the country?", "George Washington"));
        questions.add(new TriviaQuestion("Who is the king of the gods in Greek mythology?", "Zeus"));
        questions.add(new TriviaQuestion("What is the capital of Italy?", "Rome"));
        questions.add(new TriviaQuestion("What is the capital of Germany?", "Berlin"));
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int rounds = 5;

        for(int i = 0; i < rounds; i++) {
            askNextQuestion(scanner);
        }

        System.out.println("The game is done! You answered " + score + " correctly out of " + rounds);
    }

    private void askNextQuestion(Scanner scanner) {
        TriviaQuestion question = getRandomQuestion();
        question.outputQuestion();
        String userAnswer = scanner.nextLine();

        if (question.isAnswerCorrect(userAnswer)) {
            System.out.println("Correct Answer!");
            score++;
        } else {
            System.out.println("False, the right answer was " + question.answer());
        }
    }

    public TriviaQuestion getRandomQuestion() {
        int index = random.nextInt(0, questions.size());
        TriviaQuestion toReturn = questions.get(index);

        questions.remove(toReturn);
        return toReturn;
    }
}
