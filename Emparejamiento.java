import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * Write a description of class Emparejamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Emparejamiento
{
    // instance variables - replace the example below with your own
    private ArrayList<String> alumnos;
    private ArrayList<Pareja> parejas;

    public Emparejamiento()
    {
        alumnos = new ArrayList<>(Arrays.asList(
            "Adeva Tranche, Adrián", "Aller González Francisco Javier", 
            "Álvarez Prieto, Noelia"
        ));
        parejas = new ArrayList<>();
    }
    
    
    /**
     * Método que empareja a los alumnos de 2 en 2; si son
     * impares la ultima pareja tiene 3 miembros
     */
    public void emparejar()
    {
        Collections.shuffle(alumnos);
        int index = 0;
        //Damos tantas vueltas como parejas vaya a haber
        //creando pareja, metiendole sus miembros y guardandola 
        while (index < (alumnos.size() / 2)) {
            Pareja pareja = new Pareja((index + 1000) + "");
            pareja.addMiembro(alumnos.get(index * 2));
            pareja.addMiembro(alumnos.get((index * 2) + 1));
            parejas.add(pareja);
            index = index + 1;
        }
        //Si el numero de alumnos es impar tenemos uno colgado;
        //Lo metemos dentro de la primera pareja
        if (alumnos.size() % 2 != 0) {
            parejas.get(0).addMiembro(alumnos.get(alumnos.size() - 1));
        }
        
        for (Pareja pareja : parejas) {
            pareja.imprimePareja();
        }

    }


}