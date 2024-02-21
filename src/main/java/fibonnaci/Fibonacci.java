package fibonnaci;


import java.util.logging.Logger;

public class Fibonacci {

    private static final Logger logger = Logger.getLogger(Fibonacci.class.getName());

    // Main Method
    public static void main(String[] args) {
        // Définir la limite maximale
        int limite = 4000000;

        // Calculer la somme des termes pairs de la suite de Fibonnaci.Fibonacci
        long somme = FibonnaciUtils.somme(limite);

        // Afficher le résultat
        logger.info("La somme des termes pairs de la suite de Fibonacci dont les valeurs ne dépassent pas " + limite + " est " + somme);
    }
}
