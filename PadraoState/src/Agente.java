public class Agente {
	
	protected AgenteState estado;
	
	public Agente() {
		
		estado = new AgenteBase();
		
	}
	
	public void pegarBlindagem() {
		estado = estado.pegarColete();
	}
	
	public void levarTiro() {
		estado = estado.levarTiro();
	}
}
