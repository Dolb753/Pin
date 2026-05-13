
import edu.epromero.util.Lienzo;



/**
 *
 * @author Alumno
 */

public class RaquetaIA extends RaquetaSinIA{
    public void inicia(Lienzo canvas){
        super.inicia(canvas); //llamo a mi padre para que se mantenga en y
        columna = canvas.pideLimiteXMax() - 10;  // cambio mi x, para apareceer del otro lado de la pantalla
    }
    
    public void mover(Entrada e){
        renglon = e.getMiPelota().getRenglon(); //esto hace que siga al objeto pelota 
    }
}
