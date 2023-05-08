package controlador;

public class Servidor extends Cliente {

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Servidor";
		
	}

	public int verificarDias() {
		return 15;
	}
	public float custoTp() {
		tps=tps+15;
		return tps;
	}
	public float descontoAluno(Publicacao publi) {
		
		return 1;
	}

}
