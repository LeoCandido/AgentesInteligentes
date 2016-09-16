package AgentesInteligentes;
import java.util.ArrayList;

public class No {	
	No pai;
	Estado estado;
	Acao acao;	
	ArrayList<No> filhos;
	int custoG;
	int custoH;
	int profundidade;
	
	public No() {
		
	}

	public No (Estado inicial){
		pai = null;
		filhos = null;
		estado = inicial;
		custoG = 0;
		profundidade = 0;		
	}
	
	public String toString() {
		return "[Chegou no estado "+this.estado+" com a acao "+this.acao+", com profundidade "+this.profundidade+" e custoG "+this.custoG+"]";
	}
}