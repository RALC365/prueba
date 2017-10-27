
package clases;

import java.awt.Color;

public class Rectangulo {
    private int largo;
    protected int ancho;
    public Color color;
    //int v;//el tipo que viene por defecto cuando no se pone el tipo, es package
    
    public Rectangulo(){//Es public porque no sabemos si el main está en el mismo paquete
    }//Va vacío; porque solo reserva el espacio en memoria
    
    public Rectangulo(int l, int ancho){
        largo = l;
        this.ancho = ancho;
    }
    
    //mutadores
    public void setLargo(int largo){
        this.largo = largo;
    }
    public int getLargo(){
        return largo;
    }
    
    public void setAncho(int ancho){
        this.ancho = ancho;
    }
    public int getAncho(){
        return ancho;
    }
    
    public void setColor(Color r){
        this.color = r;
    }
    
   public Color getColor(){
       return color;
   }
   
   //Obligarotio popner el metodo toString --cuando hacemos sout, lo que imprime es lo que esté en toString
   //Podemos poner como queremos que lo imprime-- si no pongo el toString, lo que me imprime es cosas basuras que me dicen
   //DOnde esta lo que vamos a imprimir
   
   
    @Override//En la clase OBject ya exixte este metodo toString
  public String toString(){
      return "Largo = " + largo + " Ancho = " + ancho;
  }//Este obligatorio siempre
  
  //metodo de administacion
  public int area(){
      return largo*ancho;
  }
    
}
