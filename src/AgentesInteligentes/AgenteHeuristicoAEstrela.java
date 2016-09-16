package AgentesInteligentes;

import java.util.Collections;
import java.util.Comparator;

public class AgenteHeuristicoAEstrela extends AgenteAbstratoSimples {
	
	protected void adicionarNaBorda(No no) {		
		no.custoH = no.estado.getHeuristica();
		
		for (int i = 0; i < no.filhos.size(); i++){
			no.filhos.get(i).custoH = no.filhos.get(i).estado.getHeuristica();
			borda.add(no.filhos.get(i));
		}
		
		/*metodo para organizar um arraylist baseado em um atributo
		colocando os de menor >f(n)=custoH< na frente*/
		Collections.sort(borda, new Comparator<No>() {
			public int compare(No no1, No no2) {
				return (no1.custoG + no1.custoH) < (no2.custoG + no2.custoH) ? -1 : ((no1.custoG + no1.custoH) > (no2.custoG + no2.custoH) ? +1 : 0);
			}
		});
		
		//impressao de acompanhamento da borda
		System.out.println("\n____________>>> Expandi e Ordenei estes Nos <<<_____________");
		for (int i = 0; i < borda.size(); i++)
			System.out.println(borda.get(i));
		System.out.println("\n__________________>>> Cheguei neste No <<<__________________");
	}
}