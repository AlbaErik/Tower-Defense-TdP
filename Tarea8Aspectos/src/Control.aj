
//En ReposoEnemigo.java controlar cuando se mata un personaje matarPersonaje(Personaje)
public aspect Control {
	after():
		call( * *.start() ) {
		System.out.println("Se inicio el juego");
	}
		
	after():
		call( * *.dineroDropeado() ) {
		System.out.println("Se dropeo un premio");
	}
	
	before():
		call( * *.matarPersonaje(*) ) {
		System.out.println("Se mato un personaje");
	}
	
}


