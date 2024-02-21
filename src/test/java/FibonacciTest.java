import fibonnaci.FibonnaciUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Définir la classe de tests unitaires pour la classe Fibonnaci.Fibonacci
class FibonacciTest {


    // Définir une méthode de test pour vérifier que la fonction somme retourne la bonne valeur pour une limite positive
    @Test
    void testSommePositive() {
        // Définir la limite et la valeur attendue
        int limite = 4000000;
        long expected = 4613732;
        // Appeler la fonction somme avec la limite et comparer le résultat avec la valeur attendue
        assertEquals(expected, FibonnaciUtils.somme(limite), "La somme des termes pairs de la suite de Fibonnaci.Fibonacci dont les valeurs ne dépassent pas " + limite + " devrait être " + expected);
    }

    // Définir une méthode de test pour vérifier que la fonction somme retourne zéro pour une limite négative
    @Test
    void testSommeNegative() {
        // Définir la limite et la valeur attendue
        int limite = -10;
        long expected = 0;
        // Appeler la fonction somme avec la limite et comparer le résultat avec la valeur attendue
        assertEquals(expected, FibonnaciUtils.somme(limite), "La somme des termes pairs de la suite de Fibonnaci.Fibonacci dont les valeurs ne dépassent pas " + limite + " devrait être " + expected);
    }

    // Définir une méthode de test pour vérifier que la fonction somme retourne zéro pour une limite nulle
    @Test
    void testSommeZero() {
        // Définir la limite et la valeur attendue
        int limite = 0;
        long expected = 0;
        // Appeler la fonction somme avec la limite et comparer le résultat avec la valeur attendue
        assertEquals(expected, FibonnaciUtils.somme(limite), "La somme des termes pairs de la suite de Fibonnaci.Fibonacci dont les valeurs ne dépassent pas " + limite + " devrait être " + expected);
    }
}