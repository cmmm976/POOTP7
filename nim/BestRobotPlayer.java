
/**
 * Cette classe implémente un robot imbattable.
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 28/11/2019
 */
public class BestRobotPlayer extends Robot
{
    /**
     * Constructeur d'objets de classe BestRobotPlayer
     */
    public BestRobotPlayer()
    {
        showPlayer();
    }

    /**
     * Permet de retirer un certain nombre d'allumettes
     *
     * @param  m    nombre d'allumettes restantes
     * @return takes    tel que m-takes est congru à 1 modulo 4 
     */
    public int move(int m)
    {
        for(int i=1;i<=3;++i)
        {
            if((m-i)%4 == 1)
            {
                takes = i;
            }
        }
        return takes;
    }
}
