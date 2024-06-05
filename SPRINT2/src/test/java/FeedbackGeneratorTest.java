import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FeedbackGeneratorTest {

    @Test
    void testGenerateFeedback() {
        FeedbackGenerator feedbackGenerator = new FeedbackGenerator();
        String feedback = feedbackGenerator.generateFeedback("java", "jave");

        assertEquals("La palabra tiene 3 letras correctas en la posición correcta.", feedback);
    }
}
