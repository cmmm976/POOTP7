/**
 * Tas d'allumettes
 */
public class Matches implements MatchesDisplay {

  /**
   * nombre d'allumettes présentes dans le tas
   */
  private int number;
  
  /**
   * Construction du tas d'allumettes
   * @param n nombre initial d'allumettes
   */
  Matches(int n){
    number= n;
  }
  
  /**
   * Retire des allumettes au tas
   * @param x nombre d'allumettes retirées
   */
  public void takes(int x){
    number -= x;
  }
  
  /**
   * Nombre d'allumettes dans le tas
   * @return le nombre d'allumettes dans le tas
   */
  public int quantity(){
    return number;
  }
  
  /**
   * Visualise le nombre d'allumettes dans le tas
   */
  public void showQuantity() {
    System.out.println("il reste "+number+" allumettes");
  }

}
