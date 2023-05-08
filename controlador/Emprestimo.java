package controlador;

public class Emprestimo {

	private Cliente cliente;
	private Publicacao publicacao;

	public Emprestimo(Cliente cliente, Publicacao publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
	}
	public float retornartps() {
		cliente.tps=cliente.custoTp()*cliente.descontoAluno(publicacao);
		return cliente.tps;
	}
	public String retornarDadosEmprestimo() {

		String saida = "";
		saida = this.cliente.tipo+":" + this.cliente.nome + " - " + publicacao.tipo + ": " + this.publicacao.titulo
				+ " - Dias de emprestimo:" + cliente.verificarDias()+" Custo de tp: "+ retornartps();
		return saida;
	}
}
