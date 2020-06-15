
public class AgenteBase implements AgenteState {

	@Override
	public AgenteState pegarColete() {
		System.out.println("Agente com blindagem!");
		return new AgenteBlindado();
	}

	@Override
	public AgenteState levarTiro() {
		System.out.println("Agente morto! Mais sorte na próxima!");
		return new AgenteMorto();
	}

}
