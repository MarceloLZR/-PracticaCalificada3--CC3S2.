

import java.util.List;
import java.util.Random;

public class WordSelector {
    private List<String> words;

    public WordSelector(List<String> words) {
        this.words = words;
    }

    public String selectWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}

