package AgentesInteligentes;

import java.util.ArrayList;

public class AgenteDfsVisitas extends AgenteDfs {	
	ArrayList<Estado> visitados = new ArrayList<Estado>();

	protected void adicionarNaBorda(No no) {		
		//colocando n array visitados o estado ja visitado
		visitados.add(no.estado);		
		
		for (int j = no.filhos.size()-1; j >= 0  ;j--){
			//Nao colocar na borda se ja existir o estado no array de visitados
			if (!visitados.contains(no.filhos.get(j).estado)){
				borda.add(0, no.filhos.get(j));
			}			
		}
		
		//impressao de acompanhamento da borda
		System.out.println("\n__________________>>> Expandi estes Nos <<<_________________");
		for (int i = 0; i < borda.size(); i++)
			System.out.println(borda.get(i));
		System.out.println("\n__________________>>> Cheguei neste No <<<__________________");
	}
}