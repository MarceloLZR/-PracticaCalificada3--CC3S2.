

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void testHiddenWordSelection() {
        WordSelector wordSelector = new WordSelector(List.of("marcelo", "desarrollo", "sotware"));
        HintGenerator hintGenerator = new HintGenerator();
        Game game = new Game(wordSelector, hintGenerator, 5);

        assertNotNull(game.getHiddenWord());
    }
}
