package AgentesInteligentes;

import java.util.Collections;

public class AgenteDfs extends AgenteAbstratoSimples {
	
	protected void adicionarNaBorda(No no) {
		
		for (int j = no.filhos.size()-1; j >= 0  ;j--)
			//inserindo no inicio da borda
			borda.add(0, no.filhos.get(j));	
		
		//embaralhando filhos na borda
		Collections.shuffle(borda);
		
		//impressao de acompanhamento da borda
		System.out.println("\n__________________>>> Expandi estes Nos <<<_________________");
		for (int i = 0; i < borda.size(); i++)
			System.out.println(borda.get(i));
		System.out.println("\n__________________>>> Cheguei neste No <<<__________________");
	}	
}