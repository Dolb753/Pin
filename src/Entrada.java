
import edu.epromero.util.Lienzo;



/**
 *
 * @author Alumno
 */
//Contenedpr estandar´para  
public class Entrada {
    
    protected Lienzo miCanvas;
    protected int tecla;
    protected Bola miPelota;

    /**
     * @return the miCanvas
     */
    protected Lienzo getMiCanvas() {
        return miCanvas;
    }

    /**
     * @param miCanvas the miCanvas to set
     */
    protected void setMiCanvas(Lienzo miCanvas) {
        this.miCanvas = miCanvas;
    }

    /**
     * @return the tecla
     */
    protected int getTecla() {
        return tecla;
    }

    /**
     * @param tecla the tecla to set
     */
    protected void setTecla(int tecla) {
        this.tecla = tecla;
    }

    /**
     * @return the miPelota
     */
    protected Bola getMiPelota() {
        return miPelota;
    }

    /**
     * @param miPelota the miPelota to set
     */
    protected void setMiPelota(Bola miPelota) {
        this.miPelota = miPelota;
    }
   
    
}
