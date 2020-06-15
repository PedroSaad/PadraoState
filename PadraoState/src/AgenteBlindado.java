
public class AgenteBlindado implements AgenteState {

	@Override
	public AgenteState pegarColete() {
		System.out.println("Máximo de blindagem atingido!");
		return this;
	}

	@Override
	public AgenteState levarTiro() {
		System.out.println("Blindagem Destruída!");
		return new AgenteBase();
	}

}
