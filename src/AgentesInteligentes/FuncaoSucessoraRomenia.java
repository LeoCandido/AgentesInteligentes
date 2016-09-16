package AgentesInteligentes;

public class FuncaoSucessoraRomenia extends FuncaoSucessoraAbstrata {
	
	public FuncaoSucessoraRomenia() {
		
		//adicionando no HashMap as sucessores possiveis, estado, acao e distancia ate o estado
		adicionar(Estado.ARAD, new EstadoComAcao(Estado.SIBIU, Acao.IR_PARA, 140));
		adicionar(Estado.ARAD, new EstadoComAcao(Estado.TIMISOARA, Acao.IR_PARA, 118));
		adicionar(Estado.ARAD, new EstadoComAcao(Estado.ZERIND, Acao.IR_PARA, 75));
		
		adicionar(Estado.BUCHAREST, new EstadoComAcao(Estado.FAGARAS, Acao.IR_PARA, 211));
		adicionar(Estado.BUCHAREST, new EstadoComAcao(Estado.GIURGIU, Acao.IR_PARA, 90));
		adicionar(Estado.BUCHAREST, new EstadoComAcao(Estado.PITEST, Acao.IR_PARA, 101));
		adicionar(Estado.BUCHAREST, new EstadoComAcao(Estado.URZICENI, Acao.IR_PARA, 85));
		
		adicionar(Estado.CRAIOVA, new EstadoComAcao(Estado.DOBRETA, Acao.IR_PARA, 120));
		adicionar(Estado.CRAIOVA, new EstadoComAcao(Estado.PITEST, Acao.IR_PARA, 138));
		adicionar(Estado.CRAIOVA, new EstadoComAcao(Estado.RIMNICU_VILCEA, Acao.IR_PARA, 146));
		
		adicionar(Estado.DOBRETA, new EstadoComAcao(Estado.CRAIOVA, Acao.IR_PARA, 120));
		adicionar(Estado.DOBRETA, new EstadoComAcao(Estado.MEHADIA, Acao.IR_PARA, 75));
		
		adicionar(Estado.EFORIE, new EstadoComAcao(Estado.HIRSOVA, Acao.IR_PARA, 86));
		
		adicionar(Estado.FAGARAS, new EstadoComAcao(Estado.BUCHAREST, Acao.IR_PARA, 211));
		adicionar(Estado.FAGARAS, new EstadoComAcao(Estado.SIBIU, Acao.IR_PARA, 99));
		
		adicionar(Estado.GIURGIU, new EstadoComAcao(Estado.BUCHAREST, Acao.IR_PARA, 90));
		
		adicionar(Estado.HIRSOVA, new EstadoComAcao(Estado.EFORIE, Acao.IR_PARA, 86));
		adicionar(Estado.HIRSOVA, new EstadoComAcao(Estado.URZICENI, Acao.IR_PARA, 98));
		
		adicionar(Estado.IASI, new EstadoComAcao(Estado.NEAMT, Acao.IR_PARA, 87));
		adicionar(Estado.IASI, new EstadoComAcao(Estado.VASLUI, Acao.IR_PARA, 92));
		
		adicionar(Estado.LUGOJ, new EstadoComAcao(Estado.MEHADIA, Acao.IR_PARA, 70));
		adicionar(Estado.LUGOJ, new EstadoComAcao(Estado.TIMISOARA, Acao.IR_PARA, 111));
		
		adicionar(Estado.MEHADIA, new EstadoComAcao(Estado.LUGOJ, Acao.IR_PARA, 70));
		adicionar(Estado.MEHADIA, new EstadoComAcao(Estado.DOBRETA, Acao.IR_PARA, 75));
		
		adicionar(Estado.NEAMT, new EstadoComAcao(Estado.IASI, Acao.IR_PARA, 87));
		
		adicionar(Estado.ORADEA, new EstadoComAcao(Estado.SIBIU, Acao.IR_PARA, 151));
		adicionar(Estado.ORADEA, new EstadoComAcao(Estado.ZERIND, Acao.IR_PARA, 71));
		
		adicionar(Estado.PITEST, new EstadoComAcao(Estado.BUCHAREST, Acao.IR_PARA, 101));
		adicionar(Estado.PITEST, new EstadoComAcao(Estado.CRAIOVA, Acao.IR_PARA, 138));
		adicionar(Estado.PITEST, new EstadoComAcao(Estado.RIMNICU_VILCEA, Acao.IR_PARA, 97));
		
		adicionar(Estado.RIMNICU_VILCEA, new EstadoComAcao(Estado.CRAIOVA, Acao.IR_PARA, 146));
		adicionar(Estado.RIMNICU_VILCEA, new EstadoComAcao(Estado.PITEST, Acao.IR_PARA, 97));
		adicionar(Estado.RIMNICU_VILCEA, new EstadoComAcao(Estado.SIBIU, Acao.IR_PARA, 80));
		
		adicionar(Estado.SIBIU, new EstadoComAcao(Estado.ARAD, Acao.IR_PARA, 140));
		adicionar(Estado.SIBIU, new EstadoComAcao(Estado.FAGARAS, Acao.IR_PARA, 99));
		adicionar(Estado.SIBIU, new EstadoComAcao(Estado.ORADEA, Acao.IR_PARA, 151));
		adicionar(Estado.SIBIU, new EstadoComAcao(Estado.RIMNICU_VILCEA, Acao.IR_PARA, 80));
		
		adicionar(Estado.TIMISOARA, new EstadoComAcao(Estado.ARAD, Acao.IR_PARA, 118));
		adicionar(Estado.TIMISOARA, new EstadoComAcao(Estado.LUGOJ, Acao.IR_PARA, 111));
		
		adicionar(Estado.URZICENI, new EstadoComAcao(Estado.BUCHAREST, Acao.IR_PARA, 85));
		adicionar(Estado.URZICENI, new EstadoComAcao(Estado.HIRSOVA, Acao.IR_PARA, 98));
		adicionar(Estado.URZICENI, new EstadoComAcao(Estado.VASLUI, Acao.IR_PARA, 142));
		
		adicionar(Estado.VASLUI, new EstadoComAcao(Estado.IASI, Acao.IR_PARA, 92));
		adicionar(Estado.VASLUI, new EstadoComAcao(Estado.URZICENI, Acao.IR_PARA, 142));
		
		adicionar(Estado.ZERIND, new EstadoComAcao(Estado.ARAD, Acao.IR_PARA, 75));
		adicionar(Estado.ZERIND, new EstadoComAcao(Estado.ORADEA, Acao.IR_PARA, 71));
	}

}
