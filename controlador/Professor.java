package controlador;

public class Professor extends Cliente {

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Professor";
	}

	public int verificarDias() {
		return 20;
	}
	public float custoTp() {
		tps=tps+25;
		return tps;
	}
	public float descontoAluno(Publicacao publi) {
		
		return 1;
	}

}
