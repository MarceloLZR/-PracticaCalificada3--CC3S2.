
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class GameTest {

    @Test
    void testHiddenWordSelection() {
        WordSelector wordSelector = new WordSelector(List.of("marcelo", "desarrollo", "software"));
        HintGenerator hintGenerator = new HintGenerator();
        FeedbackGenerator feedbackGenerator = new FeedbackGenerator();
        Game game = new Game(wordSelector, hintGenerator, feedbackGenerator, 5);

        assertNotNull(game.getHiddenWord());
    }

    @Test
    void testGameFlow() {
        WordSelector wordSelector = new WordSelector(List.of("java"));
        HintGenerator hintGenerator = new HintGenerator();
        FeedbackGenerator feedbackGenerator = new FeedbackGenerator();
        Game game = new Game(wordSelector, hintGenerator, feedbackGenerator, 5);

        // Simulate guesses
        game.start();

        assertEquals(5, game.getMaxAttempts());

    }
}
