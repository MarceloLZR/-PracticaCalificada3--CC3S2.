
public class HintGenerator {

    public String generateHint(String hiddenWord, String guess) {
        int correctLetters = 0;
        for (int i = 0; i < hiddenWord.length() && i < guess.length(); i++) {
            if (hiddenWord.charAt(i) == guess.charAt(i)) {
                correctLetters++;
            }
        }
        return "La palabra tiene " + correctLetters + " letras correctas en la posición correcta.";
    }
}
