package controlador;

public class Aluno extends Cliente {

	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo="Aluno";
	}

	public int verificarDias() {
		return 10;
	}
	public float custoTp() {
		tps=tps+10;
		return tps;
	}
	
	public float descontoAluno(Publicacao publi) {
		int desconto;
		if(publi.tipo.equals("Livro")) {
			return desconto = 10/100;	
		}
		else if(publi.tipo.equals("Revista")) {
			return desconto = 1/100;
		}
		else if(publi.tipo.equals("Artigo")){
			return desconto = 50/100;
		}
		else {
			return desconto = 1;
		}
	}


}
