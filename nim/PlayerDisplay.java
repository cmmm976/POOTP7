/**
 * Méthodes de visualisation des opérations d'un joueur
 */
public interface PlayerDisplay {

  /**
   * Visualise le nombre d'allumettes prise par le joueur
   * @param taken nombre d'allumettes prises  
   */
  void showMove(int taken);
  
  /**
   * Visualise l'entrée du joueur dans la partie
   */
  void showPlayer();

  /**
   * Visualise le joueur gagnant
   */
  void showWinner();
  
}
