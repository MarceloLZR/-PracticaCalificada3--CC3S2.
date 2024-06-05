import java.util.List;
import java.util.Random;

public class WordSelector implements IWordSelector {
    private List<String> words;

    public WordSelector(List<String> words) {
        this.words = words;
    }

    @Override
    public String selectWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}