package AgentesInteligentes;

public enum Estado {
	//Estados do Mundo Aspirador de Pó

	ESS(0), //ESQUERDA SUJO SUJO 
	DSS(0), //DIREITA SUJO SUJO
	ELS(0), //ESQUERDA LIMPO SUJO
	DLS(0), //DIREITA LIMPO SUJO
	ESL(0), //ESQUERDA SUJO LIMPO
	DSL(0), //DIREITA SUJO LIMPO
	ELL(0), //ESQUERDA LIMPO LIMPO - ESTADO FINAL
	DLL(0), //DIREITA LIMPO LIMPO - ESTADO FINAL
	
	//Estados para Romenia
	
	ARAD(366),
	BUCHAREST(0), //ESTADO FINAL
	CRAIOVA(160),
	DOBRETA(242),
	EFORIE(161),
	FAGARAS(178),
	GIURGIU(77),
	HIRSOVA(151),
	IASI(226),
	LUGOJ(244),
	MEHADIA(241),
	NEAMT(234),
	ORADEA(380),
	PITEST(100),
	RIMNICU_VILCEA(193),
	SIBIU(253),
	TIMISOARA(329),
	URZICENI(80),
	VASLUI(199),
	ZERIND(374);
	
	public int heuristica;
	
	private Estado(int valorHeuristica) {
		heuristica = valorHeuristica;
	}
	
	public int getHeuristica(){
		return heuristica;
	}

	// verificacao de estado final do objetivo
	public static boolean objetivo(Estado estado){
		if ((ELL == estado) || (DLL == estado) || (BUCHAREST == estado)) {
			return true;
		}else{
			return false;
		}		 
	}

	/*para um problema futuro basta incluir os estados do mundo novo	
	  e no metodo acima, a comparacao com os novos estados finais*/
}