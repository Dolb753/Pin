
import edu.epromero.util.Lienzo;



/**
 *
 * @author Alumno
 */
public class Juego {
    Lienzo canvas;  //el nombre del lienzo es: canvas
    Bola bola; //creo la referencia de la Bola que se llama bola
    RaquetaIA master;
    RaquetaSinIA yo; // creo la referencia de la Raqueta
    ElementoGrafico [] elemento; //referencia del arreglo de ElementoGrafico
    public Juego(){ //constructor publico
        
        
        elemento = new ElementoGrafico[3]; //arreglo de ElemntoGrafico ""numero de obketos mostrados enpantalla""
        bola = new Bola(); //bola pide memoria en su constructor
        yo = new RaquetaSinIA();
        master = new RaquetaIA();
        
        elemento[0] = bola; //el elemento contendra a bola
        elemento[1] = yo;  
        elemento[2] = master; //se agrega al elemento polimorfico. osea a mi arreglo
        
        canvas = new Lienzo(); //se cre el canvas 
        
        
    canvas.ponTamanioLienzo(1200, 600);
    canvas.ponEscalaX(0, 1200);
    canvas.ponEscalaY(0, 600);
    inicia(); //el contructor llamamos a inicia
}
    public void inicia(){ //contructor
        int i; //declaro a variable contador
        
        for (i=0; i < elemento.length; i++){ //for polimorfico
            
            elemento[i].pinta(canvas);  //pedimos que a cada elemto se pinte
        }
    }
    
    public void pinta(){ //creamos el metodo pinta 
        int i; //declaro a variable contador
        
        for (i=0; i < elemento.length; i++){ //for polimorfico
            
            elemento[i].pinta(canvas);  //pedimos que a cada elemto se pinte
        }
        canvas.mostrar(0); //para que se refresque todo lo que hacemos en pantalla
    }
    
    public void mover(){
        Entrada e;
        int i;
        e = new Entrada();
        e.setMiCanvas(canvas);
        e.setMiPelota(bola); //le pasamos mi pelota para que quede encapsulada
        
        for (i=0; i < elemento.length; i++){ //for polimorfico
            
            elemento[i].mover(e);  //pedimos que a cada elemto se pinte
            System.out.println("moviendo"+i);
        }
    }
    public void Limpia(){
        canvas.limpia();
    }
    
}
