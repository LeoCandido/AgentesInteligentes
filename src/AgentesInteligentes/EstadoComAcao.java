package AgentesInteligentes;

public class EstadoComAcao {
	private Estado estado;
	private Acao acao;
	private int custo;
	
	public EstadoComAcao(Estado estado, Acao acao, int custo) {
		this.estado = estado;
		this.acao = acao;
		this.custo = custo;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public Acao getAcao() {
		return acao;
	}

	public int getCusto() {
		return custo;
	}	
}