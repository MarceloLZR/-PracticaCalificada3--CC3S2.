import java.util.List;

public class DependencyInjector {
    private WordSelector wordSelector;
    private FeedbackGenerator feedbackGenerator;

    public DependencyInjector() {

        wordSelector = new WordSelector(List.of("marcelo", "desarrollo", "software"));
        feedbackGenerator = new FeedbackGenerator();
    }

    public Game injectDependencies(int maxAttempts) {
        // Crear una instancia de Game e inyectar las dependencias necesarias
        return new Game(wordSelector, feedbackGenerator, maxAttempts);
    }
}
