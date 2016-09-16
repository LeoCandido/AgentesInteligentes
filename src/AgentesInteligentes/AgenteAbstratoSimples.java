package AgentesInteligentes;
import java.util.ArrayList;
import java.util.Collections;

public abstract class AgenteAbstratoSimples {

	ArrayList<No> borda = new ArrayList<No>();	

	protected ArrayList<EstadoComAcao> resolver(Estado estadoInicial, FuncaoSucessoraAbstrata funcaoSucessora){
		borda.add(new No(estadoInicial));		

		while (true){
			if (borda.isEmpty()){
				return null;
			}else{
				No no = borda.remove(0);
				//impressao para acompanhamento
				System.out.println(no);				
				// compara se o estado atual eh um estado final do mundo
				// "confirmacao de objetivo"				
				if (Estado.objetivo(no.estado)){
					ArrayList<EstadoComAcao> solucao = new ArrayList<EstadoComAcao>();
					//quando objetivo encontrado, constroi caminho de solucao
					while(no.pai != null){
						solucao.add(new EstadoComAcao(no.estado, no.acao, no.custoG));
						no = no.pai;						
					}
					//como foi construido de baixo para cima, agora ira inverter
					Collections.reverse(solucao);					
					return solucao;
				}else{
					prepararParaAdicionarNaBorda(no, funcaoSucessora);
				}
			}
		}	
	}

	protected ArrayList<No> expandir(No no, FuncaoSucessoraAbstrata funcaoSucessora){
		ArrayList<No> sucessores = new ArrayList<No>();		
		for (int i = 0; i < funcaoSucessora.mapa.get(no.estado).size(); i++){
			//ira criar filhos deste no, para cada acao da funcao sucessora
			No noFilho = new No();
			noFilho.pai = no;			
			noFilho.estado = funcaoSucessora.mapa.get(no.estado).get(i).getEstado();
			noFilho.acao = funcaoSucessora.mapa.get(no.estado).get(i).getAcao();
			noFilho.custoG = (funcaoSucessora.mapa.get(no.estado).get(i).getCusto() + no.custoG); //custo da raiz ate o no
			noFilho.profundidade = no.profundidade+1;					
			sucessores.add(noFilho);			
		}		
		return sucessores;
	}
	
	protected void prepararParaAdicionarNaBorda(No no, FuncaoSucessoraAbstrata funcaoSucessora) {		
		no.filhos = expandir(no, funcaoSucessora);
		adicionarNaBorda(no);		
	}

	abstract protected void adicionarNaBorda(No no);	
}