public class ExtendedHintGenerator extends HintGenerator {
    @Override
    public String generateHint(String word) {
        // Nueva implementación para generar una pista extendida
        return "La palabra comienza con la letra '" + word.charAt(0) + "'.";
    }
}
