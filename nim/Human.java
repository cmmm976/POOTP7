
/**
 * Cette classe décrit un joueur humain (vous ! :))
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 28/11/2019
 */
public class Human extends Player
{
    /**
     * Constructeur d'objets de classe Human, prend son nom comme argument
     */
    public Human(String name)
    {
        this.name = name;
        takes = 1;
        showPlayer();
    }
    /**
   * Choix du nombre d'allumettes à retirer
   * Sélectionné par l'utilisateur
   * @param m le nombre d'allumettes restantes
   * @return takes le nombre d'allumettes choisi par l'utilisateur
   */
  public int move(int m) {
    Terminal t = new Terminal();
    do
    {
        System.out.println("Combien veux-tu prendre d'allumettes, "+name+ " ?!");
        takes = t.readInt();
        if(takes > m)
        {
            System.out.println("Tu ne peux physiquement pas prendre plus de " +m+" allumettes,"+name+" ! Recommence.");
        }
        if(takes > 3)
        {
            System.out.println("Tu es un odieux tricheur, "+name+" ! Tu ne peux pas prendre plus de 3 allumettes.");
        }
        if(takes < 1)
        {
            System.out.println("Tu ne peux physiquement pas prendre moins d'une allumette, "+name+" ! Recommence.");
        }
    }while(takes > m || takes > 3 || takes < 1);
    
    return takes;
  }
  
}
