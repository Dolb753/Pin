
import edu.epromero.util.Lienzo;
import static java.awt.event.KeyEvent.VK_UP;
import static java.awt.event.KeyEvent.VK_DOWN;

/**
 *
 * @author Gonzalez Palacios Santiago Yahel
 */
public class RaquetaSinIA extends ElementoGrafico{
    public RaquetaSinIA(){ //constructor
        
        setSprite(".\\resources\\raqueta.png");
    }
    public void inicia(Lienzo canvas){ //metodo para inicializar (para pintarlo en la pantalla)
        super.inicia(canvas); //para invocar al padre y que la imagen donde se inicia se cargue desde el mapa de nits
        renglon = (canvas.pideLimiteYMax() -        //{
               canvas.pideLimiteYMin())/2;          //El posicionamiento de la raqueta
        columna = canvas.pideLimiteXMax() + 10;     //{
                
    }
    public void mover(Entrada e){
        if (e.getMiCanvas().fuePulsadaTecla(VK_UP) == true)
            renglon = renglon +10;
        if (e.getMiCanvas().fuePulsadaTecla(VK_DOWN) == true)
            renglon = renglon -10;
    }
}
