import java.util.ArrayList;
import java.util.Random;
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
    private ArrayList<Alumno> alumnos;
    private ArrayList<Alumno> pareja;

    public Emparejamiento(){
        alumnos = new ArrayList<Alumno>();
        pareja =  new ArrayList<Alumno>();

    }

    public void añadirAlumnos(Alumno alumno){
        int numeroAlum = 0;
        while(numeroAlum < alumnos.size()){
            if(numeroAlum >= 2 ){
                alumnos.add(alumno);

            }

        }

    }

    public void mostrarAlumnos(Alumno alumno){
        for(Alumno dentro : alumnos){
            dentro.getDatos();
        }
        System.out.println(alumno.getNombre()+alumno.getApellido1()+ alumno.getApellido2()); 
    }

    public void seleccionarGrupo(){

        boolean impar = false;
        Collections.shuffle(pareja);
        for(Alumno grupo : pareja){
            if(impar){
                pareja.add(grupo);
            }
            else{
                System.out.println("El numero de alumnos es impar, asi que habra una pareja de tres");
            }
            grupo.getDatos();

        }
        
    }

}
