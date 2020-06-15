
public class AgenteBlindado implements AgenteState {

	@Override
	public AgenteState pegarColete() {
		System.out.println("M�ximo de blindagem atingido!");
		return this;
	}

	@Override
	public AgenteState levarTiro() {
		System.out.println("Blindagem Destru�da!");
		return new AgenteBase();
	}

}
