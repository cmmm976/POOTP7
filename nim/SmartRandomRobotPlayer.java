
/**
 * Ce robot prend un nombre d'allumettes aléatorie à chaque tour, sauf quand lil reste moins de 4 allumettes
 *
 * @author Charles
 * @version 0.1
 */
public class SmartRandomRobotPlayer extends RandomRobotPlayer
{
    /**
     * Constructeur d'objets de classe SmartRandomRobotPlayer
     */
    public SmartRandomRobotPlayer()
    {
        super();
    }

    /**
     * Choix du nombre d'allumettes à retirer
     * Un nombre aléatoire à chaque tour sauf s'il reste moins de 4 allumettes
     *
     * @param  m   le nombre d'allumettes restante
     * @return takes un nombre aléatoire sauf au dernier tour
     */
    public int move(int m)
    {
        
        if(m > 4)
        {
            super.move(m);
        }
        else
        {
            takes = m-1;
        }
        
        return takes;
    }
}
