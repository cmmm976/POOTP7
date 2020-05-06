/**
 * Robot prenant toujours un nombre constant d'allumettes
 */
public class DumbRobotPlayer extends Robot {

  /**
   * Robot à nombre d'allumettes retiré constant
   * @param n nb d'allumettes prises systématiquement (>0 et <4)
   */
  public DumbRobotPlayer(int n) {
    this.name = this.name + "("+n+")";
    takes= n;    
    showPlayer();
  }
  
  /**
   * Choix du nombre d'allumettes à retirer
   * Le maximum possible pour cette stratégie de jeu
   * @param m le nombre d'allumettes restantes
   * @return le nombre d'allumettes choisi (>0 et <4)
   */
  public int move(int m) {
    if(m <= takes)
    {
        return m;
    }
    else
    {
        return takes;
    }
  }

  

}
