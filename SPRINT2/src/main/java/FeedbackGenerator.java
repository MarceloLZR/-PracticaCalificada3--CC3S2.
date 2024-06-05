
public class FeedbackGenerator {

    public String generateFeedback(String hiddenWord, String guess) {
        int correctLetters = 0;
        int correctPosition = 0;

        // Verifica cuántas letras están en la posición correcta
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (guess.charAt(i) == hiddenWord.charAt(i)) {
                correctPosition++;
            }
        }

        // Verifica cuántas letras están en la palabra oculta
        for (int i = 0; i < guess.length(); i++) {
            if (hiddenWord.contains(String.valueOf(guess.charAt(i)))) {
                correctLetters++;
            }
        }

        // Construye y retorna la retroalimentación
        return "La palabra tiene " + correctLetters + " letras correctas, " +
                "de las cuales " + correctPosition + " están en la posición correcta.";
    }
}
