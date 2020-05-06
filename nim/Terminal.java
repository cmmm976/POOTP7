import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Lectures de données au clavier
 */
public class Terminal {

  private BufferedReader input; // tampon de lecture
  
  /**
   * Initialisation d'un terminal de lecture au clavier
   *
   */
  Terminal(){
    input=new BufferedReader(new InputStreamReader(System.in));
  }
  
  /**
   * Lecture d'une chaine de caractères
   * @return la chaine lue
   */
  public  String readString(){
    String ligne_lue=null;
    try{
      ligne_lue=input.readLine();
    }
    catch(IOException ignore){
    }
    return ligne_lue;
  }
  
  /** 
   * Lecture d'un nombre réel
   * @return le nombre lu
   */
  public double readDouble(){
    double x=0; //valeur à lire
    try{
      String ligne_lue=readString();
      x=Double.parseDouble(ligne_lue);
    } catch(NumberFormatException ignore){
    }
    return x;
  }

  /**
   * Lecture d'un entier
   * @return l'entier lu
   */
  public int readInt(){
    int x=0; //valeur à lire
    try{
      String ligne_lue=readString();
      x=Integer.parseInt(ligne_lue);
    } catch(NumberFormatException ignore){
    }
    return x;
  }

}

