package AgentesInteligentes;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class FuncaoSucessoraAbstrata {
	HashMap<Estado, ArrayList<EstadoComAcao>> mapa = new HashMap<Estado, ArrayList<EstadoComAcao>>();	
	ArrayList<EstadoComAcao> estadoComAcao = new ArrayList<EstadoComAcao>();
	
	public void adicionar(Estado estadoChave, EstadoComAcao estadoComAcao){
		this.estadoComAcao = mapa.get(estadoChave);		
			
		/*Se nao existir nada no vetor de estadoComAcao,
		  entao instancia um, adiciona nele estado e acao e guarda mapa*/
		if (this.estadoComAcao == null){
			this.estadoComAcao = new ArrayList<EstadoComAcao>(); //se nao instanciar da "NullPointerException"
			this.estadoComAcao.add(estadoComAcao);
			mapa.put(estadoChave, this.estadoComAcao);
		}else{
			this.estadoComAcao.add(estadoComAcao);
			mapa.put(estadoChave, this.estadoComAcao);
		}		
	}	
}