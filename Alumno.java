
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    
    public Alumno(String nombreIntro, String apellido1Intro, String apellido2Intro){
        nombre = nombreIntro;
        apellido1 = apellido1Intro;
        apellido2= apellido2Intro;
    
    }
    public String getNombre(){
        return nombre;
    }

     public String getApellido1(){
        return apellido1;
    }
     public String getApellido2(){
        return apellido2;
    }

    public void getDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellido1+" "+apellido2);
    
    }

}
