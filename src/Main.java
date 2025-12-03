public class Main {
    public static void main(String[] args) {
        /* ARRAYS */
        // When you need multiple elements that are loopable

        String question1 = "What does WWW stand for?";
        String question2 = "What is the World's largest Ocean?";
        String question3 = "Which Year did East and West Germany Unify?";

        String answer1 = "World Wide Web";
        String answer2 = "Pacific Ocean";
        String answer3 = "1990";

        // Add a fourth one...
        // Add another 15...
        // NOW LOOP THROUGH THEM

        for(int i = 1; i < 4; i++) {
            // System.out.println(questioni); // THIS DOES NOT WORK
        }

        /* ARRAYS */
        // Think of a "list" of Elements
        // Programmers start to count at 0
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";
        questions[3] = "What is the tallest mountain on Earth?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";
        answers[3] = "Mt. Everest";

        for(int i = 0; i < questions.length; i++) {
            System.out.println("Q: " + questions[i] + " | A: " + answers[i]);
        }

        int[] numbers = new int[3];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 15;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}