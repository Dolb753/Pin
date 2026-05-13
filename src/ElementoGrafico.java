
import edu.epromero.util.Imagen;
import edu.epromero.util.Lienzo;


/**
 *
 * @author Gonzalez PALCIOS Santiago Yahel
 *//// todos las clases de los objetos de¿ben ser hijas de este elemneto grafico
public class ElementoGrafico { //inicializar las variables
    protected double renglon;
    protected double columna;
    protected String sprite;
    protected Imagen imgSprite;
    
     public static final int DERECHA = 1;
     public static final int IZQUIERDA = -1;
     public static final int ARRIBA = 1;
     public static final int ABAJO = -1;
    
    public ElementoGrafico(){ //constructor para darle valores predefinicdos a nuestras variables 
        renglon = 0;
        columna = 0;
        sprite = null;
        imgSprite = null;
        
      
    }
    
    
    
    public void pinta(Lienzo canvas){ //metodo 
        canvas.dibujo(columna, renglon, imgSprite);
    }
    
    public void inicia(Lienzo canvas){ 
        imgSprite = new Imagen(sprite);  // una nueva image esta siendo cargada desde (sprite)
    }

    /**
     * @return the renglon
     */
    public double getRenglon() {
        return renglon;
    }

    /**
     * @param renglon the renglon to set
     */
    public void setRenglon(double renglon) {
        this.renglon = renglon;
    }

    /**
     * @return the columna
     */
    public double getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(double columna) {
        this.columna = columna;
    }

    /**
     * @return the sprite
     */
    public String getSprite() {
        return sprite;
    }

    /**
     * @param sprite the sprite to set
     */
    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    /**
     * @return the imgSprite
     */
    public Imagen getImgSprite() {
        return imgSprite;
    }

    /**
     * @param imgSprite the imgSprite to set
     */
    public void setImgSprite(Imagen imgSprite) {
        this.imgSprite = imgSprite;
    }
    
    public void mover(Entrada e){ //ya hay un metodo moverr en elemento grafico, para que funcione de manera polimorfica, 
        
    }
    
    
}
