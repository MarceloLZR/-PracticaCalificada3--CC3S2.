
public class HintGenerator implements IHintGenerator {
    @Override
    public String generateHint(String word) {
        return "La palabra tiene " + word.length() + " letras.";
    }
}