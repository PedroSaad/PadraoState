public class Teste {
	
	public static void main(String[] args) {
		
		Agente agente = new Agente();
		
		System.out.println("Agente come�a a partida!");
		agente.pegarBlindagem(); //agente pega blindagem
		agente.pegarBlindagem(); //maximo de blindagem
		agente.levarTiro(); // perde blindagem
		agente.pegarBlindagem(); // pega blindagem
		agente.levarTiro(); //perde blindagem
		agente.levarTiro(); //game over
	}
}
