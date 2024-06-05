public class DependencyInjector {
    private final IWordSelector wordSelector;
    private final IHintGenerator hintGenerator;

    public DependencyInjector(IWordSelector wordSelector, IHintGenerator hintGenerator) {
        this.wordSelector = wordSelector;
        this.hintGenerator = hintGenerator;
    }

    public Game createGame() {
        return new Game(wordSelector, hintGenerator);
    }
}
