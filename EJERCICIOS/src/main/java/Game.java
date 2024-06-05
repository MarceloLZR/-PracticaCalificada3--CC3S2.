import java.util.Arrays;
import java.util.List;

public class Game {
    private IWordSelector wordSelector;
    private IHintGenerator hintGenerator;

    public Game(IWordSelector wordSelector, IHintGenerator hintGenerator) {
        this.wordSelector = wordSelector;
        this.hintGenerator = hintGenerator;
    }

    public void start() {
        String word = wordSelector.selectWord();
        String hint = hintGenerator.generateHint(word);
        System.out.println("Hint: " + hint);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("marcelo", "desarrollo", "software");
        IWordSelector wordSelector = new WordSelector(words);
        IHintGenerator hintGenerator = new HintGenerator();
        Game game = new Game(wordSelector, hintGenerator);
        game.start();
    }
}
