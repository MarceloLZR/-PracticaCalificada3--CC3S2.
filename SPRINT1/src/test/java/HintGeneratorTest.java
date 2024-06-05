
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HintGeneratorTest {

    @Test
    void testGenerateHint() {
        HintGenerator hintGenerator = new HintGenerator();
        String hint = hintGenerator.generateHint("java", "jave");
        assertEquals("La palabra tiene 3 letras correctas en la posición correcta.", hint);
    }
}
