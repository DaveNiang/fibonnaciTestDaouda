package fibonnaci;

import java.util.Optional;
import java.util.stream.Stream;

public class FibonnaciUtils {
    private FibonnaciUtils() {
    }

    // Définir la formule mathématique pour générer le n-ième terme de la suite de Fibonnaci.Fibonacci
    // Source: https://fr.wikipedia.org/wiki/Suite_de_Fibonacci#Formule_de_Binet
    public static Optional<Long> terme(int n) {
        if (n < 0) {
            return Optional.empty(); // Retourner un Optional vide si n est négatif
        }
        double racine5 = Math.sqrt(5);
        double phi = (1 + racine5) / 2;
        double psi = (1 - racine5) / 2;
        return Optional.of(Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / racine5)); // Retourner un Optional contenant le n-ième terme
    }

    // Méthode pour calculer la somme des termes pairs de la suite de Fibonnaci.Fibonacci dont les valeurs ne dépassent pas une limite
    public static long somme(int limite) {
        // Créer un stream infini de termes de la suite de Fibonnaci.Fibonacci en utilisant la formule mathématique
        var stream = Stream.iterate(0, n -> n + 1).map(FibonnaciUtils::terme);

        // Filtrer les termes qui sont présents, pairs et inférieurs ou égaux à la limite
        var pairs = stream.takeWhile(Optional::isPresent)
                .map(Optional::get)
                .filter(t -> t % 2 == 0)
                .takeWhile(t -> t <= limite);

        // Retourner la somme des termes pairs
        return pairs.mapToLong(Long::longValue).sum();
    }
}
