

public class Game {
    private WordSelector wordSelector;
    private HintGenerator hintGenerator;
    private String hiddenWord;
    private int maxAttempts;

    public Game(WordSelector wordSelector, HintGenerator hintGenerator, int maxAttempts) {
        this.wordSelector = wordSelector;
        this.hintGenerator = hintGenerator;
        this.maxAttempts = maxAttempts;
        this.hiddenWord = wordSelector.selectWord();
    }

    public void start() {
        // Se implementara la logica del juego aca en el sprint 2
    }

    public String getHiddenWord() {
        return hiddenWord;
    }
}
