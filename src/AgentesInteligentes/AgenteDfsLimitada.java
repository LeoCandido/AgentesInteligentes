package AgentesInteligentes;

public class AgenteDfsLimitada extends AgenteDfs {
	int profundidade_Limite;

	public AgenteDfsLimitada(int k) {
		profundidade_Limite = k;
	}

	protected void adicionarNaBorda(No no) {

		if (no.filhos.get(0).profundidade < profundidade_Limite) {
			for (int j = no.filhos.size()-1; j >= 0  ;j--)
				borda.add(0, no.filhos.get(j));
		}
		
		//impressao de acompanhamento da borda
		System.out.println("\n__________________>>> Expandi estes Nos <<<_________________");
		for (int i = 0; i < borda.size(); i++)
			System.out.println(borda.get(i));
		System.out.println("\n__________________>>> Cheguei neste No <<<__________________");
	}	
}