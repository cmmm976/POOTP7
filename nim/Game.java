import java.util.List;
import java.util.ArrayList;

/**
 * Jeu des 21 allumettes
 * Gère une partie entre deux joueurs en les faisant jouer tour à tour.
 */
public class Game {

  /** le tas d'allumettes */ 
  private Matches matches;
  
  /** la liste des joueurs inscrits à la partie (au plus deux joueurs) */
  private List<Player> players;
  
  /** 
   * le tour de jeu : 
   * si turn=0 alors c'est au premier joueur de jouer
   * si turn=1 alors c'est au second joueur de jouer
   * Attention : à chaque tour on commence par inverser le tour de jeu
   */
  private int turn;
  
  /**
   * Création et initialisation d'une nouvelle partie
   */
  public Game(){
    matches = new Matches(21);
    turn = 0;
    players = new ArrayList<Player>();
  }

  /**
   * Inscrit un joueur à la partie
   * @param p joueur à inscrire
   */
  public void addPlayer(Player p){
      if(p ==null){
          System.out.println("CE JOUEUR EST NULL !!!!!! IL N'EXISTE PAS !!!");
      }
      else if(players.size() > 2)
      {
          System.out.println("Cette partie est complète ! COMPLETE !!!!");
      }
      else
      {
          players.add(p);
      }
       
       
  }
  
  /**
   * Fait jouer chaque joueur tour à tour
   * tant qu'il reste plus d'une allumette.
   * Affiche le nom du gagnant.
   */
  public void play(){
    if(players.size()<2)
    {
        System.out.println("Il n'y a pas assez de joueurs pour jouer !!!! :'(");
    }
      
    while(matches.quantity() > 1){
      turn= nextTurn(); 
      Player player= players.get(turn); // joueur courant
      matches.showQuantity();
      int taken= player.move(matches.quantity()); // nb d'allumettes à retirer
      player.showMove(taken); 
      matches.takes(taken);
    }
    if (matches.quantity() == 0) players.get(nextTurn()).showWinner();
    else players.get(turn).showWinner();
  }

  /**
   * Numéro du joueur suivant
   * @return le numéro dans la liste du prochain joueur
   */ 
  private int nextTurn(){
    return (turn+1) % 2;
  }
  
  /**
   * Test du programme avec deux joueurs "dumb robot"
   */
  public static void main(String argv[]){
    Game game= new Game();
    game.addPlayer(new DumbRobotPlayer(2));
    game.addPlayer(new DumbRobotPlayer(1));
    game.play();
  }
  
  /**
   * réinitialise la partie pour en lancer rapidement une nouvelle (ie. remet le nombre d'allumettes à 21)
   */
  public void restart()
  {
      matches = new Matches(21);
  }
}
