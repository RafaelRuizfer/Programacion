package Pokemon;

public class MainPokemon {

	public static void main(String[] args) {
		/*Cree un programa que te deje consultar la informaciñn de un Pokemon. La
		informacion de un Pokemon consistiran en la siguiente: Numero en la pokedex, tipo
		del pokemon y descripcion del pokemon. El programa debe permitir consultar la
		informacion de 5 pokemongos a vuestra eleccion(tanto la informacion completa
		Como una en especifico). Utilice unicamente ArrayList unidimensional*/
		
		//EJERCICIO 1
		
		Pokemon bulbasaur = new Pokemon("Bulbasaur",1,"Es un Bulbasaur","Planta");
		Pokemon ivysaur = new Pokemon("Ivysaur",2,"Es un Ivysaur","Planta y Veneno");
		Pokemon venusaur = new Pokemon("Venusaur",3,"Es un Venusaur","Planta y Veneno");
		Pokemon charmander = new Pokemon("Charmander",7,"Es un Charmander","Fuego");
		Pokemon squirtle = new Pokemon("Squirtle", 4, "Es un Squirtle", "Agua");
		Pokemon wartortle = new Pokemon("Wartortle", 5, "Es un Wartortle", "Agua");
		Pokemon blastoise = new Pokemon("Blastoise", 6, "Es un Blastoise", "Agua");
		Pokemon pikachu = new Pokemon("Pikachu", 25, "Es un Pikachu", "Eléctrico");
		Pokemon raichu = new Pokemon("Raichu", 26, "Es un Raichu", "Eléctrico");
		
		ArrayPokemon arra= new ArrayPokemon();
		arra.añadirPokemon(bulbasaur);
		arra.añadirPokemon(ivysaur);
		arra.añadirPokemon(venusaur);
		arra.añadirPokemon(charmander);
		arra.añadirPokemon(squirtle);
		arra.añadirPokemon(wartortle);
		arra.añadirPokemon(blastoise);
		arra.añadirPokemon(pikachu);
		arra.añadirPokemon(raichu);
		
		/*Cree un programa que simule una “Ruta” del juego de Pokemon. Este programa
		utilizará una estructura de datos (ArrayList) para almacenar distintos pokemongogos
		que se puedan encontrar en esta ruta. Se deberá almacenar al menos 4
		pokemungus distintos en cada ruta, y se debe dar al usuario la opción de añadir
		más. Y sí, por si te lo estás preguntando, estamos hablando de ArrayList
		multidimensionales.*/
		
		//EJERCICIO 2
		
		Ruta ruta1 = new Ruta(1,"pueblo knekro");
		ruta1.agregarPokimones(charmander);
		System.out.println(ruta1);
		
		Ruta ruta2 = new Ruta(2,"pueblo lavanda");
		ruta2.agregarPokimones(bulbasaur);
		ruta2.agregarPokimones(ivysaur);
		System.out.println(ruta2);
		
		/*Cree un programa que simule una Pokédex. En esta Pokédex se podrá introducir el
		nombre de un pokemon y recibir toda la información del mismo. La pokédex deberá
		tener los 3 pokemon iniciales de la región de Kanto hardcodeados y debe permitir
		añadir nuevos pokes. Utilice HashMap.*/
		
		//EJERCICIO 3
		
		Pokedex poke = new Pokedex();
		poke.añadirPokePokedex(pikachu);
		poke.añadirPokePokedex(raichu);
		System.out.println(poke);
		
		
		
		/*Vamos a combinar todo lo anterior. Cree un programa que permita al
		entrenador pokemon elegir entre las siguientes opciones:
		a. Cambiar de ruta: El entrenador deberá elegir en qué ruta quiere capturar
		pokes.
		b. Consultar Pokedex: El entrenador podrá realizar consultas de la información
		de los pokemon que se encuentran en la pokedex.
		c. Capturar Pokemon: El usuario se encontrará con un pokemon aleatorio de
		los disponibles en la ruta en la que se encuentra, puede elegir entre
		capturarlo o huir. Esto genera dos resultados:
		i. Si huye, se almacena la información siguiente del pokemon en la
		pokedex: numero y tipo.
		ii. En caso de que se capture, se almacena también la descripción del
		Pokemon..*/
		
		//EJERCICIO 4
		
		
		
		ArrayRuta rutas = new ArrayRuta();
		System.out.println(rutas.toString());
		
	}

}
