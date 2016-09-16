package AgentesInteligentes;

public class AgenteBfs extends AgenteAbstratoSimples {
	
	protected void adicionarNaBorda(No no) {
		
		for (int i = 0; i < no.filhos.size(); i++)
			//inserindo no fim da borda
			borda.add(no.filhos.get(i));
	
		//impressao de acompanhamento da borda
		System.out.println("\n__________________>>> Expandi estes Nos <<<_________________");
		for (int i = 0; i < borda.size(); i++)
			System.out.println(borda.get(i));
		System.out.println("\n__________________>>> Cheguei neste No <<<__________________");	
	}	
}