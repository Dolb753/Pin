/**
 *
 * @author Gonzalez Palacios Santiago Yahel
 */
public class FesaPonga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego torneo = new Juego();
        
        while(true){
            torneo.Limpia();
            torneo.pinta();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.getLogger(FesaPonga.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
             torneo.mover();
        }
       
    }
    
}
