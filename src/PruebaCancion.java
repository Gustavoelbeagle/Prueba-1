/**
 * Clase que identifica el titulo de una cancion el autor de la cancion la cancion mas larga y cual es la siguienye cancion que va a sonar
 * @author Arturo
 * @version 2022
 */
public class PruebaCancion {
/** 
 * Al lanzar el programa lanza el array con el titulo autor y duracion, si esta sonando o no, si esta parada o no, si es la misma cancion que la anterior y despues te imprimes otras canciones
 * @param args -> el array de la cancion
 */
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("Macarena", "Los Monancos", 480, true);
		Cancion quintaCancion = new Cancion("Goteo", "Duki", 520, false);
		
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}
/**
* Te dice cual es el siguiente titulo de canciones que sonara despues
* @param canciones -> el titulo de la cancion
* @param canciones-> el siguiente titulo de la cancion
*/

	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

/**
* Te dice cual es la cancion que mas tiempo dura
* @param canciones -> el titulo de la cancion que dura mas tiempo
*/
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}
/**
 * Te dice cual es el titulo y el autor de  las canciones
 * @param canciones -> el titulo y el autor de  la cancion
 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	
	}

}
