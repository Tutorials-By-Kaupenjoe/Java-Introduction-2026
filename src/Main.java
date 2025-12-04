import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* COLLECTIONS */
        // For when an Array is just not enough!

        // Reminder Arrays... But what if we want to EXPAND?
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


        /* LIST */
        // The MUCH BETTER Array
        List<String> moreQuestions = new ArrayList<>(); // Diamond Operator <> for "Generic Types"
        moreQuestions.add("What website hosts the most videos in the world?");
        moreQuestions.add("What is the Capital of Germany?");
        System.out.println(moreQuestions.get(0));

        // List<Integer> numbers = new ArrayList<>();
        // List<Boolean> truthValues;

        // Another type of For Loop (ForEach Loop)
        // For each String question inside of moreQuestions
        for(String question : moreQuestions) {
            System.out.println(question);
        }

        /* SET */
        // Where each element only appears once!
        Set<String> countriesToVisit = new HashSet<>();
        countriesToVisit.add("France");
        countriesToVisit.add("Germany");
        countriesToVisit.add("Spain");
        countriesToVisit.add("France");

        System.out.println(countriesToVisit);


        /* MAP */
        // To Map one Thing to Another (Key-Value Pair)
        Map<String, Integer> countryToPopulationMap = new HashMap<>();
        countryToPopulationMap.put("USA", 331000000);
        countryToPopulationMap.put("United Kingdom", 67330000);
        countryToPopulationMap.put("Austria", 8950000);

        System.out.println(countryToPopulationMap.get("USA"));
        System.out.println(countryToPopulationMap.get("Germany"));

        System.out.println(countryToPopulationMap);


        /* STACK & QUEUE */
        // Stacks => LIFO (Last In, First Out)
        // Queue => FIFO (First In, First Out)
        Stack<String> cards = new Stack<>();
        cards.add("King Of Spades");
        cards.add("Queen of Diamonds");
        cards.add("Three of Clubs");

        // Pop will get (AND REMOVE) the "top" element of the stack (Taking the card off the top of the deck)
        System.out.println(cards.pop());
        // Peek will LOOK at the top element "get it", but not remove (Look at the card, put it back again)
        System.out.println(cards.peek());

        Queue<String> registerQueue = new ArrayDeque<>();

        registerQueue.add("Kaupenjoe");
        registerQueue.add("Moon");
        registerQueue.add("Arch");
        registerQueue.add("Luc");
        registerQueue.add("Nano");

        // Poll will get (AND REMOVE) the "front" element (in the case teh first person at the register!)
        System.out.println(registerQueue.poll());
        // Peek once again will get, but not remove the person at the front!
        System.out.println(registerQueue.peek());

    }
}