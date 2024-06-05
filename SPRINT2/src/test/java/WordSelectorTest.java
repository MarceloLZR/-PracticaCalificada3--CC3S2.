

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class WordSelectorTest {

    @Test
    void testSelectWord() {
        WordSelector wordSelector = new WordSelector(List.of("marcelo", "desarrollo", "software"));
        String selectedWord = wordSelector.selectWord();
        assertTrue(List.of("marcelo", "desarrollo", "software").contains(selectedWord));
    }

}
