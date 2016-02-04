
import java.util.ArrayList;


public class Pareja
{
	private String id;
	private ArrayList<String> miembros;
	
	/**
	 * Constructor de la clase Pareja
	 */
	public Pareja(String id)
	{
		this.id = id;
		miembros = new ArrayList<>();
	}
	
	/**
	 * Imprime por pantalla los detalles de la pareja
	 **/
	public void imprimePareja()
	{
		System.out.println("Pareja numero: " + id);
		for(String nombre: miembros){
			System.out.println(nombre);
		}
	}
	
	/**
	 * Añade a la pareja el miembro dado como parametro 
	 */
	public void addMiembro(String nombre)
	{
		miembros.add(nombre);
	}
	
	public String getId(){
	   return id;
	   }
}
