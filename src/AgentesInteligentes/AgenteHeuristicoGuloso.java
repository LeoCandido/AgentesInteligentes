package AgentesInteligentes;

public class AgenteHeuristicoGuloso extends AgenteAbstratoSimples {

	protected void adicionarNaBorda(No no) {		
		No noCandidato = no.filhos.get(0);
		
		//selecionando o filho com menor heuristica (custoH)
		for (int i = 0; i < no.filhos.size(); i++){
			if (no.filhos.get(i).estado.getHeuristica() < noCandidato.estado.getHeuristica()) {
				noCandidato = no.filhos.remove(i);
			}
		}
		borda.add(noCandidato);

		//impressao de acompanhamento da borda		
		System.out.println("\n__________________>>> Cheguei neste No <<<__________________");
	}
}