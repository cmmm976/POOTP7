
/**
 * Décris un joueur générique
 *
 * @author  Charles
 * @version 0.1
 */
public abstract class Player implements PlayerDisplay
{
    /**
     * Nom du joueur
     */
    protected String name = this.getClass().getName();
    /**
     * Nombre d'allumettes prises 
     */
    protected int takes = 1;

    /**
     * Permet de retirer un certain nombre d'allumettes
     *
     * @param  m    nombre d'allumettes restantes
     * @return nombre d'allumettes choisi (à définir selon la stratégie)
     */
    abstract public int move(int m);
    
   /**
   * Visualise ce joueur comme le gagnant
   */
    public void showWinner() {
        System.out.println(name+" a gagné !");
    }

  /**
   * Visualise le nombre d'allumettes retirées
   * @param le nombre d'allumettes retirées
   */
    public void showMove(int taken) {
        System.out.println(name+" prend "+taken+" allumettes");
    }

  /**
   * Visualise l'entrée du joueur dans la partie
   */
  public void showPlayer() {
      System.out.println(name+ " entre dans la partie");
  }
}
