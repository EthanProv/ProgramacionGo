import java.util.ArrayList;

import javax.print.attribute.standard.MediaSize.NA;

public class Nodo {
    String Name;

    ArrayList<Nodo> vecinos;

    Nodo(String nombre){
        Name = nombre;  
        this.vecinos = new ArrayList<>();

    }



    void connectar(Nodo otro){
        if(!vecinos.contains((otro))){
            vecinos.add(otro);
        }

    }

    public String getNombre(){
        return Name;
    }
    
    public String getVecinos(){
        String tmp = "";

        for(Nodo v: vecinos){
            tmp += "["+ v.getNombre() + "] -";
        }

        return tmp;
    }
}

