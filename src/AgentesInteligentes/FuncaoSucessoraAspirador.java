package AgentesInteligentes;

public class FuncaoSucessoraAspirador extends FuncaoSucessoraAbstrata {
	
	//para um problema futuro basta criar uma outra funcao sucessora especifica
	
	public FuncaoSucessoraAspirador() {
		adicionar(Estado.ESS, new EstadoComAcao(Estado.ELS, Acao.ASPIRAR, 1));
		adicionar(Estado.ESS, new EstadoComAcao(Estado.ESS, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.ESS, new EstadoComAcao(Estado.DSS, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.DSS, new EstadoComAcao(Estado.DSL, Acao.ASPIRAR, 1));
		adicionar(Estado.DSS, new EstadoComAcao(Estado.ESS, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.DSS, new EstadoComAcao(Estado.DSS, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.ELS, new EstadoComAcao(Estado.ELS, Acao.ASPIRAR, 1));
		adicionar(Estado.ELS, new EstadoComAcao(Estado.ELS, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.ELS, new EstadoComAcao(Estado.DLS, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.DLS, new EstadoComAcao(Estado.DLL, Acao.ASPIRAR, 1));
		adicionar(Estado.DLS, new EstadoComAcao(Estado.ELS, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.DLS, new EstadoComAcao(Estado.DLS, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.ESL, new EstadoComAcao(Estado.ELL, Acao.ASPIRAR, 1));
		adicionar(Estado.ESL, new EstadoComAcao(Estado.ESL, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.ESL, new EstadoComAcao(Estado.DSL, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.DSL, new EstadoComAcao(Estado.DSL, Acao.ASPIRAR, 1));
		adicionar(Estado.DSL, new EstadoComAcao(Estado.ESL, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.DSL, new EstadoComAcao(Estado.DSL, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.ELL, new EstadoComAcao(Estado.ELL, Acao.ASPIRAR, 1));
		adicionar(Estado.ELL, new EstadoComAcao(Estado.ELL, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.ELL, new EstadoComAcao(Estado.DLL, Acao.IR_PARA_DIREITA, 1));
		
		adicionar(Estado.DLL, new EstadoComAcao(Estado.DLL, Acao.ASPIRAR, 1));
		adicionar(Estado.DLL, new EstadoComAcao(Estado.ESL, Acao.IR_PARA_ESQUERDA, 1));
		adicionar(Estado.DLL, new EstadoComAcao(Estado.DLL, Acao.IR_PARA_DIREITA, 1));
	}
}