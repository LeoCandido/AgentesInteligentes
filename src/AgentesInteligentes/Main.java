package AgentesInteligentes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {
	public static void main(String[] args) {
		FuncaoSucessoraAspirador funcaoAspirador = new FuncaoSucessoraAspirador();
		FuncaoSucessoraRomenia funcaoRomenia = new FuncaoSucessoraRomenia();
		ArrayList<EstadoComAcao> solucao = null;
		Estado estadoInicial = null;
		int selecaoProblema;
		int numeroDoAlgoritmo;
		int custo = 0;
		long tempoInicial = 0;
		long tempoFinal = 0;
		long tempoDeExecucao = 0;
		ArrayList<Long> temposDeExecucoes = new ArrayList<Long>();
		int passo = 1;
		int limiteProfundidade = 0;
		String algoritmoEscolhido = "";

		// Interface grafica - Inicio
		String s = "";
		JTextArea areaSaida = new JTextArea(20, 45);
		JScrollPane painelScroll = new JScrollPane(areaSaida);
		painelScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		painelScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		selecaoProblema = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Problema que ira aplicar os Agentes Inteligentes"
								+ "\n1 >>> Mundo do Aspirador de Po \n2 >>> Mapa da Romenia"));
		switch (selecaoProblema) {
		
		//MUNDO DO ASPIRADOR DE PO
		case 1:
			// Selecao do estado inicial
			try {
				// Tentar converter a string informada em um "enum" aceitavel
				String temp = JOptionPane.showInputDialog("Informe um Estado Inicial: \nESS, DSS, ELS, DLS, ESL, DSL, ELL, DLL");
				estadoInicial = Enum.valueOf(Estado.class, temp.toUpperCase());
				if (estadoInicial == Estado.ELL || estadoInicial == Estado.DLL) {
					JOptionPane.showMessageDialog(null,"JA EH UM ESTADO DE ACEITACAO!!!", "FIM",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Estado INVALIDO!!!","ERRO", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}

			numeroDoAlgoritmo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Algoritmo de Busca \n1 BFS \n2 DFS Normal "
																+ "\n3 DFS com Visitas \n4 DFS Limitada \n5 DFS Limitada Iterativa"));
			for (int i = 0; i < 1000; i++){
				switch (numeroDoAlgoritmo) {
				case 1:
					algoritmoEscolhido = "Agente do Mundo do Aspirador de Po - Algoritmo BFS";
					try {
						AgenteBfs agente = new AgenteBfs();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoAspirador);
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 2:
					algoritmoEscolhido = "Agente do Mundo do Aspirador de Po - Algoritmo DFS normal";
					try {
						AgenteDfs agente = new AgenteDfs();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoAspirador);
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 3:
					algoritmoEscolhido = "Agente do Mundo do Aspirador de Po - Algoritmo DFS com Visitas";
					try {
						AgenteDfsVisitas agente = new AgenteDfsVisitas();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoAspirador);
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 4:
					algoritmoEscolhido = "Agente do Mundo do Aspirador de Po - Algoritmo DFS Limitada";
					try {
						//limiteProfundidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Limite da Profundidade"));
						AgenteDfsLimitada agente = new AgenteDfsLimitada(4);
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoAspirador);
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 5:
					algoritmoEscolhido = "Agente do Mundo do Aspirador de Po - Algoritmo DFS Limitada Iterativa";
					try {
						tempoInicial = System.currentTimeMillis();
						while (solucao == null) {
							AgenteDfsLimitada agente = new AgenteDfsLimitada(limiteProfundidade);						
							solucao = agente.resolver(estadoInicial,funcaoAspirador);						
							limiteProfundidade++;
						}					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!","ERRO", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				limiteProfundidade = 0;				
				temposDeExecucoes.add(tempoDeExecucao);
			}
			break;
		
		//MAPA DA ROMENIA
		case 2:
			// Selecao do estado inicial
			try {
				// Tentar converter a string informada em um "enum" aceitavel
				String temp = JOptionPane.showInputDialog("Informe um Estado Inicial: \nARAD, BUCHAREST, CRAIOVA, DOBRETA, EFORIE, FAGARASL, GIURGIU, HIRSOVA,"
								+ "\nIASI, LUGOJ, MEHADIA, NEAMT, ORADEA, PITEST, RIMNICU_VILCEA, SIBIU,"
								+ "\nTIMISOARA, URZICENI, VASLUI, ZERIND");
				estadoInicial = Enum.valueOf(Estado.class, temp.toUpperCase());
				if (estadoInicial == Estado.BUCHAREST) {
					JOptionPane.showMessageDialog(null,"JA EH UM ESTADO DE ACEITACAO!!!", "FIM",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Estado INVALIDO!!!","ERRO", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}

			numeroDoAlgoritmo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Algoritmo de Busca"+ "\n1 BFS \n2 DFS Normal \n3 DFS com Visitas "
							+ "\n4 DFS Limitada \n5 DFS Limitada Iterativa "
							+ "\n6 Guloso \n7 A Estrela"));
			
			for (int i = 0; i < 1000; i++){
				switch (numeroDoAlgoritmo) {			
				case 1:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo BFS";
					try {
						AgenteBfs agente = new AgenteBfs();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoRomenia);					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;					
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 2:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo DFS normal";
					try {
						AgenteDfs agente = new AgenteDfs();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoRomenia);					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 3:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo DFS com Visitas";
					try {
						AgenteDfsVisitas agente = new AgenteDfsVisitas();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoRomenia);					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 4:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo DFS Limitada";
					try {
						//limiteProfundidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Limite da Profundidade"));
						AgenteDfsLimitada agente = new AgenteDfsLimitada(4);
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoRomenia);					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 5:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo DFS Limitada Iterativa";
					try {
						tempoInicial = System.currentTimeMillis();
						while (solucao == null) {
							AgenteDfsLimitada agente = new AgenteDfsLimitada(limiteProfundidade);						
							solucao = agente.resolver(estadoInicial,funcaoRomenia);						
							limiteProfundidade++;
						}										
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 6:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo Guloso";
					try {
						AgenteHeuristicoGuloso agente = new AgenteHeuristicoGuloso();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoRomenia);					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				case 7:
					algoritmoEscolhido = "Agente para Romenia - Algoritmo A Estrela";
					try {
						AgenteHeuristicoAEstrela agente = new AgenteHeuristicoAEstrela();
						tempoInicial = System.currentTimeMillis();
						solucao = agente.resolver(estadoInicial,funcaoRomenia);					
						tempoFinal = System.currentTimeMillis();					
						tempoDeExecucao = tempoFinal - tempoInicial;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,"IMPOSSIVEL MONTAR CAMINHO SOLUCAO!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!","ERRO", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				limiteProfundidade = 0;
				temposDeExecucoes.add(tempoDeExecucao);
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "OPCAO INVALIDA!!!", "ERRO",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}		
		
		//Impressao do tempo de execucao medio para 1000 execucoes
		double tempoMedio = 0;
		for (int i = 0; i < temposDeExecucoes.size(); i++){
			tempoMedio = tempoMedio + temposDeExecucoes.get(i);
		}
		tempoMedio = tempoMedio / 1000;
		System.out.printf("Tempo Medio de Execucao: %.3f milisegundos",tempoMedio);		
		
		//Impressao da solucao e custo
		if (solucao != null) {
			s += ("Estado Inicial Desejado: " + estadoInicial + "\n\n");
			s += (passo + " - De " + estadoInicial);
			for (int i = 0; i < solucao.size(); i++) {
				if (i == 0) {
					s += (" chegou em " + solucao.get(i).getEstado()
							+ " com a acao " + solucao.get(i).getAcao()
							+ " e custoG " + solucao.get(i).getCusto());
				} else {
					s += ("\n" + (passo = passo + 1) + " - De "
							+ solucao.get(i - 1).getEstado() + " chegou em "
							+ solucao.get(i).getEstado() + " com a acao "
							+ solucao.get(i).getAcao() + " e custoG " + solucao.get(i).getCusto());
					custo = solucao.get(i).getCusto();
				}
			}
			s += ("\n\nCusto Total da Busca: " + custo);			
		} else {
			s += ("Estado de Aceitacao nao encontrado!");
		}
		s += ("\n----------------------------------------");

		// Interface grafica - Fim
		areaSaida.setText(s);
		areaSaida.setEditable(false);
		JOptionPane.showMessageDialog(null, painelScroll, algoritmoEscolhido,JOptionPane.INFORMATION_MESSAGE);
	}
}