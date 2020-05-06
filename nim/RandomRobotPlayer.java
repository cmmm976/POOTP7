
/**
 * Robot prenant systématiquement un nombre aléatoire d'allumettes
 *
 * @author Charles-Meldhine Madi Mnemoi
 * @version 0.1
 */

import java.util.Random;

public class RandomRobotPlayer extends Robot
{

    /**
     * Constructeur d'objets de classe RandomRobotPlayer
     */
    public RandomRobotPlayer()
    {  
        showPlayer();
    }

    /**
     * Choix du nombre d'allumettes à retirer
     * Un nombre aléatoire à chaque tour
     *
     * @param  m   le nombre d'allumettes restant
     * @return un nombre aléatoire entre 1 et 3
     */
    public int move(int m)
    {
        Random r = new Random();
        takes = 1 + r.nextInt(2);
        return takes;
    }
}
