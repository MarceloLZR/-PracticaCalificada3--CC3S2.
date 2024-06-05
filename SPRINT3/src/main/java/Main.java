import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de DependencyInjector
        DependencyInjector dependencyInjector = new DependencyInjector();

        // Crear instancia de Game usando DependencyInjector
        Game game = dependencyInjector.injectDependencies(5);

        // Iniciar el juego
        game.start();
    }
}
