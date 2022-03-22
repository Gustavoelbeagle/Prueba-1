/**
 * clase para el objeto Cancion con sus metodos y atributos 
 * @author Arturo
 * @version 2022
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
/**
 * Este es el contructor con los parametros a 0, false o vacio dependiendo del tipo de variable 
 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
/**
 * Constructor 1 con titulo y duracion
 * @param titulo -> el titulo de la cancion
 * @param duracion -> la duracion de la cancion
 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
/**
 * Constructor  con titulo , grupo , duracion y sonando
 * @param titulo -> el titulo de la cancion
 * @param grupo -> el grupo de la cancion
 * @param duracion -> la duracion de la cancion
 * @param sonando -> indica si suena la cancion
 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
/**
 *  Este metodo indica si la cancion esta sonando o no, partiendo del 
 *  objeto cancion desde que se invoca este metodo. Si el atributo sonando es verdadero 
 *  devuelve falso y si el atributo sonando es falso devuelve verdadero 
 * @return  True =  la cancion esta sonando; False =  la cancion no esta sonando;
 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
/**
 *  Este metodo indica si la cancion esta sonando o esta parada, partiendo del 
 *  objeto cancion desde que se invoca este metodo. Si el atributo sonando es verdadero 
 *  devuelve falso y si el atributo sonando es falso devuelve falso 
 * @return  True =  la cancion esta sonando; False =  la cancion esta parada;
 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
/**
 * Compara el titulo y el grupo de la cancion con el siguiente titulo y grupo de la cancion 
 * y si es el mismo no  presenta
 * @param cancion -> el titulo de la cancion y el grupo de la cancion
 * @return mira si es la misma cancion
 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
/**
 * Compara la duracion de todas la canciones entre si y te dice cual es la que mas tiempo dura
 * @param canciones -> la duracion de la cancion
 * @return -> el titulo de la cancion que dura mas tiempo
 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
/**
 * Compara la primera posicion de la primera cancion y
 *  va asignando una posicion mas a la siguientes canciones
 * @param canciones -> la posicion de la cancion
 * @param titulo-> la siguiente posicion de la cancion
 * @return te mira las canciones la posicion y el titulo
 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}
