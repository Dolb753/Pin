
import edu.epromero.util.Lienzo;



/**
 *
 * @author Alumno
 */
public class Bola extends ElementoGrafico {  //se extiende desde el elem
    protected double componenteY;
    protected double componenteX;
    public Bola(){
        componenteX = DERECHA;
        componenteY = IZQUIERDA;
        
        setSprite(".\\resources\\pelota.png"); //como esta heredando de elemto grafico, donde Sprite es nullo. Entonces especificamos (setSprite) cual sera el pritte de Bola o tambien llamado mpa de bitas
        
    
    }
    public void inicia(Lienzo canvas){  //este pide un lienzo, pero mi papa no lo hace ====Hacemos que en la clase jeugo cuando inica la bola, pida un canvas====
        super.inicia(canvas); //para que inicialice la image 
        renglon = (int)(canvas.pideLimiteYMax() -
               canvas.pideLimiteYMin())/2;
        columna = (int)(canvas.pideLimiteXMax() -
                canvas.pideLimiteXMin())/2;
        
    }
    
    public void mover(Entrada e){ //el constructor para hacer el movimeinto //Entrada e.... es para estandarizar toda mi basura, y hacerlo polimorfico
        
        if(columna > e.getMiCanvas().pideLimiteXMax())
            setComponenteX(IZQUIERDA);
        if(columna < e.getMiCanvas().pideLimiteXMin())
            setComponenteX(DERECHA);
        if(renglon > e.getMiCanvas().pideLimiteYMax())
            setComponenteY(ABAJO);
        if(renglon < e.getMiCanvas().pideLimiteYMin())
            setComponenteY(ARRIBA);
        
        columna = columna + componenteX*25;
        renglon = renglon + componenteY*25;
    } 
    public void rebota(){  //constructor o metodo para rebotar
        componenteX = -componenteX;
    }

    /**
     * @return the componenteY
     */
    private double getComponenteY() {
        return componenteY;
    }

    /**
     * @param componenteY the componenteY to set
     */
    private void setComponenteY(double componenteY) {
        this.componenteY = componenteY;
    }

    /**
     * @return the componenteX
     */
    private double getComponenteX() {
        return componenteX;
    }

    /**
     * @param componenteX the componenteX to set
     */
    private void setComponenteX(double componenteX) {
        this.componenteX = componenteX;
    }

    
}
