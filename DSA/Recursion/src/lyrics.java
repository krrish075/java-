import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class lyrics {

    // The model maps a String (the state) to a List of Characters (possible next characters)
    private Map<String, List<Character>> model;
    private int stateLength;
    private Random random;

    public lyrics(int stateLength) {
        this.stateLength = stateLength;
        this.model = new HashMap<>();
        this.random = new Random();
    }

    /**
     * Builds a Markov Chain model from the given text.
     */
    public void train(String text) {
        // Iterate through the text, looking at 'stateLength' characters at a time
        for (int i = 0; i < text.length() - stateLength; i++) {
            String currentState = text.substring(i, i + stateLength);
            char nextChar = text.charAt(i + stateLength);

            // If the state isn't in the map yet, add it with an empty list
            model.putIfAbsent(currentState, new ArrayList<>());

            // Add the next character to the list of possibilities for this state
            model.get(currentState).add(nextChar);
        }
    }

    /**
     * Generates text using the trained Markov Chain model.
     */
    public String generateText(int outputLength) {
        if (model.isEmpty()) {
            return "Model is empty.";
        }

        // Pick a random starting state from the map's keys
        List<String> states = new ArrayList<>(model.keySet());
        String currentState = states.get(random.nextInt(states.size()));

        StringBuilder output = new StringBuilder(currentState);

        for (int i = 0; i < outputLength; i++) {
            List<Character> possibleNextChars = model.get(currentState);

            // If we hit a dead end (a state not in our model), stop generating
            if (possibleNextChars == null || possibleNextChars.isEmpty()) {
                break;
            }

            // Randomly choose the next character from the list of possibilities
            char nextChar = possibleNextChars.get(random.nextInt(possibleNextChars.size()));
            output.append(nextChar);

            // Update the current state by dropping the first character and adding the new one
            currentState = currentState.substring(1) + nextChar;
        }

        return output.toString();
    }

    public static void main(String[] args) {
        // 1. Provide your training data
        String trainingText =
                "Ho Manne Sambh-Sambh Rakhe Tere Jhanjran Ke Jode\n" +
                        "Meri Gail Ro-Ro Ye Bhi Chhori Bawle Se Hore\n" +
                        "Manne Aaye Jaave Khayal Tere Khaye Jaave Khayal Tere\n" +
                        "Jeene Koni Deti Haaye Bairan Teri Aayi\n";

        // 2. Initialize and train the model
        // Using stateLength=3 because our training text is very small.
        // For a full song dataset, use 4 or 5.
        lyrics generator = new lyrics(3);
        System.out.println("Learning model...");
        generator.train(trainingText);

        // 3. Generate new text
        System.out.println("\nGenerating Lyrics:\n");
        String generatedLyrics = generator.generateText(150);
        System.out.println(generatedLyrics);
    }
}