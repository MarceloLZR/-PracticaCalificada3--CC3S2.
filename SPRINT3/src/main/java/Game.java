import java.util.Scanner;

public class Game {
    private WordSelector wordSelector;
    private FeedbackGenerator feedbackGenerator;
    private String hiddenWord;
    private int maxAttempts;
    private int attempts;

    public Game(WordSelector wordSelector, FeedbackGenerator feedbackGenerator, int maxAttempts) {
        this.wordSelector = wordSelector;
        this.feedbackGenerator = feedbackGenerator;
        this.maxAttempts = maxAttempts;
        this.hiddenWord = wordSelector.selectWord();
        this.attempts = 0;
    }

    public void start() {
        displayWelcomeMessage();

        Scanner scanner = new Scanner(System.in);

        while (attempts < maxAttempts) {
            String guess = getPlayerGuess(scanner);
            processGuess(guess);

            if (isCorrectGuess(guess)) {
                displaySuccessMessage();
                return;
            } else {
                displayAttemptsRemaining();
            }
        }

        displayFailureMessage();
    }

    private void displayWelcomeMessage() {
        System.out.println("Bienvenido a Adivina la Palabra!");
        System.out.println("Tienes " + maxAttempts + " intentos para adivinar la palabra.");
    }

    private String getPlayerGuess(Scanner scanner) {
        System.out.print("Ingresa tu adivinanza: ");
        return scanner.nextLine();
    }

    private void processGuess(String guess) {
        attempts++;
        String feedback = feedbackGenerator.generateFeedback(hiddenWord, guess);
        System.out.println(feedback);
    }

    private boolean isCorrectGuess(String guess) {
        return guess.equals(hiddenWord);
    }

    private void displaySuccessMessage() {
        System.out.println("¡Felicidades! Adivinaste la palabra.");
    }

    private void displayAttemptsRemaining() {
        System.out.println("Intentos restantes: " + (maxAttempts - attempts));
    }

    private void displayFailureMessage() {
        System.out.println("Lo siento, se te acabaron los intentos. La palabra era: " + hiddenWord);
    }

    // Métodos adicionales
    public String getHiddenWord() {
        return hiddenWord;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }
}
