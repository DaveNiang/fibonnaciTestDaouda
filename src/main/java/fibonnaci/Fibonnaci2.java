package fibonnaci;

import java.util.Scanner;
import java.util.logging.Logger;

public class Fibonnaci2 {

    /*
    private static final Logger logger = Logger.getLogger(Fibonnaci2.class.getName());


    // Définir la méthode principale pour afficher le résultat
    public static void main(String[] args) {
        // Définir la limite maximale
        int limite = 50;

        // Utiliser un bloc try-with-resources pour gérer les exceptions
        try (var scanner = new Scanner(System.in)) {

            // Demander à l'utilisateur de saisir la limite
            logger.info("Entrez la limite maximale des termes de la suite de Fibonacci (par défaut " + limite + "):");

            // Lire la limite saisie par l'utilisateur
            var input = scanner.nextLine();

            // Vérifier si l'input est vide ou non
            if (!input.isEmpty()) {
                // Convertir l'input en entier
                limite = Integer.parseInt(input);
            }
            logger.info("Nouvelle Limite : "+limite);

            // Calculer la somme des termes pairs de la suite de Fibonacci
            long somme = FibonnaciUtils.somme(limite);

            // Afficher le résultat
            logger.info("La somme des termes pairs de la suite de Fibonacci dont les valeurs ne dépassent pas " + limite + " est " + somme);

        } catch (NumberFormatException e) {
            // Afficher un message d'erreur si l'input n'est pas un entier valide
            logger.info("Input invalide: " + e.getMessage());
        } catch (Exception e) {
            // Afficher un message d'erreur si une autre exception se produit
            logger.info("Une erreur s'est produite: " + e.getMessage());
        }
    }
*/
}
