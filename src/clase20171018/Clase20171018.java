package clase20171018;
//Agregue un comentario arriba, ve este era el commit que iba a poner jajajajaja
import clases.Rectangulo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Clase20171018 {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        //ArrayList<Rectangulo> lista2 = new ArrayList();
        String opcion = "";
        while(!opcion.equals("e")){
            opcion = JOptionPane.showInputDialog(""
                    + "a-agregar\n"
                    + "b-listar\n"
                    + "c-modificar\n"
                    + "d-eliminar\n"
                    + "e-salir"
                    + "");
            
            if (opcion.equals("a")) {
                int l;
                int a;//al pedir un colo, solo lo ponemos endur
                l =Integer.parseInt(JOptionPane.showInputDialog("largo"));
                a =Integer.parseInt(JOptionPane.showInputDialog("ancho"));
                
                //Rectangulo r = new Rectangulo(l,a);
                //lista.add(r); --manera larga
                
                lista.add(new Rectangulo(l,a));
            }
            if (opcion.equals("b")) {
                String s = "";
                for (Object t : lista) {
                    if (t instanceof Rectangulo) {
                        s+=""+lista.indexOf(t)+"- "+t+"\n";
                    }//asi vamos a imprimir un solo tipo
                }
                JOptionPane.showMessageDialog(null, s);
            }
            if (opcion.equals("c")) {
                //modificacion parcial
                int p,a;//poscicion,ancho
                p =Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Posición a modificar"));
                a =Integer.parseInt(JOptionPane.showInputDialog(""
                        + " Nuevo ancho"));
                ((Rectangulo)lista.get(p)).setAncho(a);//pido posicó y valores a ccambiar
                //HAcemos esto; porque en un solo elemento está todo el rectangulo
                //y solo queremos cambiar el ancho; por eso hacemos un casteo; para hacer un modificacion parcial 
            }
            if (opcion.equals("d")) {
                 int p;//poscicion,ancho
                    p =Integer.parseInt(JOptionPane.showInputDialog(""
                        + "Posición a eliminar"));
                    lista.remove(p);
            }
            
        }
        
        //Rectangulo r = new Rectangulo();
       //r.color; solo nos aparace color; porque solo este atributo es public
        
    }
    
}
