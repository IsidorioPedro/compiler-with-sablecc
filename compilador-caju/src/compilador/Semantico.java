package compilador;

import java.util.HashMap;
import java.util.Map;
import java.util.Deque;

import java.util.Optional;

import java.util.ArrayDeque;
import java.util.ArrayList;

import java.util.List;

import compilador.analysis.*;
import compilador.node.*;

public class Semantico extends DepthFirstAdapter {

	private Deque<HashMap<String, Simbolo>> pilhaTabelaSimbolos = new ArrayDeque<>();
	
	public boolean isNumero(String str) {
	    try {
	        Integer.parseInt(str);
	        return true; // Se não lançar exceção, é um número inteiro.
	    } catch (NumberFormatException e) {
	        return false; // Se lançar exceção, não é um número inteiro.
	    }
	}
	
	
	@Override
	public void inStart(Start node)
	    {
		   System.out.println("-------------------------------------------------");
		   System.out.println("Iniciando análise semântica...");
		   HashMap<String, Simbolo> tabelaDeSimbolos =  new HashMap<String, Simbolo>();
		   pilhaTabelaSimbolos.push(tabelaDeSimbolos);
	    }
	
	@Override
	public void outStart(Start node)
	    {
		    System.out.println("-------------------------------------------------");
	        System.out.println("Fim da análise semântica");
	        System.out.println("-------------------------------------------------");  
	    }
	 
	@Override
	public void inABlocoBloco(ABlocoBloco node) 
	    {
		    HashMap<String, Simbolo> tabelaDeSimbolosTopo = pilhaTabelaSimbolos.peek();   
		  
		    pilhaTabelaSimbolos.push(new HashMap<>(tabelaDeSimbolosTopo));
		    /*
		    System.out.println("Tabela de Símbolos IN:");
		    for (Map.Entry<String, Simbolo> entry : tabelaDeSimbolosTopo.entrySet()) {
		        String key = entry.getKey();
		        Simbolo simbolo = entry.getValue();
		        System.out.println("Chave: " + key + " | Valor: " + simbolo);
		    }
		    */
	    }

	@Override
	public void outABlocoBloco(ABlocoBloco node) 
	    {
	        pilhaTabelaSimbolos.pop();
	        /*
	        HashMap<String, Simbolo> tabelaDeSimbolosTopo = pilhaTabelaSimbolos.peek();
	        System.out.println("Tabela de Símbolos OUT:");
		    for (Map.Entry<String, Simbolo> entry : tabelaDeSimbolosTopo.entrySet()) {
		        String key = entry.getKey();
		        Simbolo simbolo = entry.getValue();
		        System.out.println("Chave: " + key + " | Valor: " + simbolo);
		    }
		    */
	    }
	
	@Override
	public void outAParametroParametro(AParametroParametro node) {
		HashMap<String, Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		String key = node.getId().toString().split(" ")[0];
		Simbolo simbolo = new Simbolo(node.getTipo().toString(), false);
		System.out.println(key + " de tipo " + node.getTipo().toString() + " adicionado na tabela de símbolos.");
		tabelaDeSimbolos.put(key, simbolo);
	}
	
	@Override
	public void outAComumDecFuncao(AComumDecFuncao node) 
		{
			HashMap<String, Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
			List<PParametro> listaParametro = new ArrayList<>(node.getParametros());
			Map<String, String> Parametro = new HashMap<>();
			for (PParametro p : listaParametro) {
				String tipo = p.toString().split(" ")[0];
				if (tipo.equals("vetor")) {
					String var = p.toString().split(" ")[3];
					String parametro = String.join(" ", p.toString().split(" ")[0], p.toString().split(" ")[1], p.toString().split(" ")[2]);
					if (tabelaDeSimbolos.containsKey(var)) {
				        tabelaDeSimbolos.remove(var);
				        System.out.println("Removendo parametro da tabela de simbolos: " + var);
				    } else {
				        System.out.println("ERRO: Símbolo com chave " + var + " não encontrado na tabela de símbolos.");
				    }
					Parametro.put(var, parametro);
				}else {
					String var = p.toString().split(" ")[1];
					String parametro = p.toString().split(" ")[0];
					if (tabelaDeSimbolos.containsKey(var)) {
				        tabelaDeSimbolos.remove(var);
				        System.out.println("Removendo parametro da tabela de simbolos: " + var);
				    } else {
				        System.out.println("ERRO: Símbolo com chave " + var + " não encontrado na tabela de símbolos.");
				    }
					Parametro.put(var, parametro);
				}
			}
			System.out.println("Key " + node.getId().toString());
			// System.out.println("Tipo " + node.getTipoRetorno().toString());
			String key = node.getId().toString().split(" ")[0];
			Simbolo simbolo = new Simbolo(node.getTipoRetorno().toString(), false);
			simbolo.set_Map(Parametro);
			tabelaDeSimbolos.put(key, simbolo);
		}
	  
	@Override
	public void outADecVariavelDecVariavel(ADecVariavelDecVariavel node) 
	    {
	        HashMap<String, Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
	        List<PVar> listaVariaveis = new ArrayList<>(node.getListaNomes());

	        for (PVar v : listaVariaveis) {
	            String key = v.toString().split(" ")[0];
	            Simbolo simbolo = new Simbolo(node.getTipo().toString(), false);
	            tabelaDeSimbolos.put(key, simbolo);
	            System.out.println(key + " de tipo " + node.getTipo().toString() + " adicionado na tabela de símbolos.");
	        }
	    }
	
	public boolean verificaTipagem(HashMap<String,Simbolo> tabelaDeSimbolos, String exp, String tipagem) {
		if(tipagem.equals("numero")) {
			if (isNumero(exp)) {
				// System.out.println("Exp é um numero: " + exp);
				return true;
			}else {
				Optional<Simbolo> veriSimbolo = Optional.ofNullable(tabelaDeSimbolos.get(exp));
				if(veriSimbolo.isPresent()) {
					Simbolo sim = veriSimbolo.get();
					if (sim.get_tipo().equals("numero ")) {
						// System.out.println("A variavel: " + exp + " é numero");
						return true;
					}else {
						if (sim.get_tipo().toString().split(" ")[0].equals("vetor")) {
							// System.out.println("A variavel: " + exp + " é vetor numero");
							return true;
						}
					}
				}else {
					return false;
				}
			}
		}
		if(tipagem.equals("caractere")) {
			if ( !isNumero(exp) ) {
				// System.out.println("Exp é um caractere: " + exp);
				return true;
			}else {
				Optional<Simbolo> veriSimbolo = Optional.ofNullable(tabelaDeSimbolos.get(exp));
				if(veriSimbolo.isPresent()) {
					Simbolo sim = veriSimbolo.get();
					if (sim.get_tipo().equals("caractere ")) {
						// System.out.println("A variavel: " + exp + " é caractere");
						return true;
					}else {
						if (sim.get_tipo().toString().split(" ")[0].equals("vetor")) {
							// System.out.println("A variavel: " + exp + " é vetor caractere");
							return true;
						}else {
							// System.out.println("A variavel: " + exp + " não é caractere");
							return false;
						}
					}
				}else {
					// System.out.println("A atribuição para a variavel: " + key + " . Não é caractere");
					return false;
				}
			}
		}
		if (tipagem.equals("booleano")) {
			if ( isNumero(exp) ) {
				// System.out.println("Exp é um numero: " + exp);
				return true;
			}else {
				if ( !isNumero(exp)) {
					// System.out.println("Exp é um caractere: " + exp);
					return true;
				}else {
					Optional<Simbolo> veriSimbolo = Optional.ofNullable(tabelaDeSimbolos.get(exp));
    				if(veriSimbolo.isPresent()) {
    					Simbolo sim = veriSimbolo.get();
    					if (sim.get_tipo().equals("caractere ") || sim.get_tipo().equals("numero ")) {
    						// System.out.println("A variavel: " + exp + " é caractere ou numero");
    						return true;
    					}else {
    						if (sim.get_tipo().toString().split(" ")[0].equals("vetor")) {
    							// System.out.println("A variavel: " + exp + " é vetor caractere");
    							return true;
    						}
    					}
    				}else {
    					//System.out.println("A atribuição para a variavel: " + key + " . Não é caractere ou numero");
    					return false;
    				}
				}
			}
		}
		
		return false;
	}
	
	public void auxAtrib(HashMap<String,Simbolo> tabelaDeSimbolos, String key, AAtribAtrib node) {
		Optional<Simbolo> simboloOpt = Optional.ofNullable(tabelaDeSimbolos.get(key));
        if (simboloOpt.isPresent()) {
            Simbolo simbolo = simboloOpt.get();
            // Caso se a variavel for um numero
            if (simbolo.get_tipo().equals("numero ") || simbolo.get_tipo().toString().contains("vetor numero") ) {
            	String[] exps = node.getExp().toString().trim().split(" ");
            	String nomeDaExpressao = node.getExp().getClass().getSimpleName().toString();
            	if ( nomeDaExpressao.contains("ALogica") || nomeDaExpressao.contains("ARelacional")) {
            		System.out.println("A atribuição para a variavel: " + key + " . Não é expressão aritmetica");
            	}
            }
            // Caso a variavel for um caractere
            if (simbolo.get_tipo().equals("caractere ") || simbolo.get_tipo().toString().contains("vetor caractere") ) {
            	String[] exps = node.getExp().toString().trim().split(" ");
            	String nomeDaExpressao = node.getExp().getClass().getSimpleName().toString();
            	if ( nomeDaExpressao.contains("ALogica") || nomeDaExpressao.contains("ARelacional")) {
            		System.out.println("A atribuição para a variavel: " + key + " . Não é expressao aritmetica");
            	}else {
            		if ( !nomeDaExpressao.contains("AAritmeticaSomaExp") && !nomeDaExpressao.contains("ACaractere")) {
            			System.out.println("A atribuição para a variavel: " + key + " .Não é operação de concatenação ou expressão de caractere");
            		}
            	}
            }
            // Caso a variavel for um booleano
            if (simbolo.get_tipo().equals("booleano ") || simbolo.get_tipo().toString().contains("vetor booleano")) {
            	String[] exps = node.getExp().toString().trim().split(" ");
            	String nomeDaExpressao = node.getExp().getClass().getSimpleName().toString();
            	if ( !nomeDaExpressao.contains("AAritmetica") ) {
            		System.out.println("A atribuição para a variavel: " + key + " . Nem é expressão logica ou relacional");
            	}
            }
            simbolo.valor_atribuido();
        }else {
            System.out.println("ERRO: " + key + " não foi declarado.");
        }
	}
	
	@Override
    public void outAAtribAtrib(AAtribAtrib node) {
        HashMap<String, Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
        String[] key = node.getVar().toString().split(" ");
        // System.out.println("Key: " + key[0]);
        /*
         * Não consigo sabe se dentro do colchete é uma expressão aritmetica ou não...
        */
        if (key.length > 1) {
        	for (int i = 1; i < key.length; i++) {
        		if(!verificaTipagem(tabelaDeSimbolos, key[i], "numero")) {
        			System.out.println("A variavel vetor: " + key[0] + " .O valor " + key[i] + " não é numero");
        		}
        	}
        }
        auxAtrib(tabelaDeSimbolos, key[0], node);
    }
	
	@Override
	public void outAChamadaChamada(AChamadaChamada node) {
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		String key = node.getId().toString().split(" ")[0];
		String[] vars = node.getListaExp().toString().split(" ");
		if (tabelaDeSimbolos.containsKey(key)) {
			Simbolo simbolo = tabelaDeSimbolos.get(key);
			Map<String,String> map = new HashMap<>(simbolo.get_Map());
			
			List<String> keys = new ArrayList<>(map.keySet());
	        List<String> values = new ArrayList<>(map.values());

	        // Iterando usando um loop for com índice
	        for (int i = 0; i < keys.size(); i++) {
	            String chave = keys.get(i);
	            String valor = values.get(i);
	            if (tabelaDeSimbolos.containsKey(vars[i])) {
	            	Simbolo simInfo = tabelaDeSimbolos.get(vars[i]);
	            	String tipo = simInfo.get_tipo();
	            	if (!tipo.equals(valor + " ")) {
	            		System.out.println("Na chamada de função: " + key + " .A variavel " + vars[i] + " não é do tipo: " + tipo);
	            	}
	            }else {
	            	System.out.println("A variavel: " + vars[i] + " não foi declarada");
	            }
	        }
		}else {
			System.out.println("A função: " + key + " não foi encontrado");
		}
	}
	
	
	@Override
	public void outAAritmeticaSomaExp(AAritmeticaSomaExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outAAritmeticaSubtracaoExp(AAritmeticaSubtracaoExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outAAritmeticaMultiplicacaoExp(AAritmeticaMultiplicacaoExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outAAritmeticaDivisaoExp(AAritmeticaDivisaoExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outARelacionalMenorIgualExp(ARelacionalMenorIgualExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outARelacionalMenorExp(ARelacionalMenorExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outARelacionalMaiorIgualExp(ARelacionalMaiorIgualExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void outARelacionalMaiorExp(ARelacionalMaiorExp node) {
		System.out.println("Key: " + node.getDireita() + " " + node.getEsquerda());
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
			System.out.println(node.getDireita() + " não é do tipo numero");
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
				System.out.println(node.getEsquerda() + " não é do tipo numero");
			}
		}
	}
	
	@Override
	public void inARelacionalIgualExp(ARelacionalIgualExp node) {
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		String exp = node.getDireita().toString().split(" ")[0];
		if (isNumero(exp)) {
			if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "numero")) {
				System.out.println(node.getDireita() + " não é do tipo numero");
			}else {
				if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "numero")) {
					System.out.println(node.getEsquerda() + " não é do tipo numero");
				}
			}
		}else {
			if (!verificaTipagem(tabelaDeSimbolos, node.getDireita().toString().split(" ")[0], "caractere")) {
				System.out.println(node.getDireita() + " não é do tipo numero");
			}else {
				if (!verificaTipagem(tabelaDeSimbolos, node.getEsquerda().toString().split(" ")[0], "caractere")) {
					System.out.println(node.getEsquerda() + " não é do tipo numero");
				}
			}
		}
	}
	
	@Override
	// Imcompleta
	public void inALogicaNaoExp(ALogicaNaoExp node) {
		HashMap<String,Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
		String[] exps = node.getExp().toString().split(" ");
		if (exps.length == 1) {
			if ( !exps.equals("verdadeiro")) {
				System.out.println("A expressão não é booleana");
			}else {
				if( !exps.equals("falso")) {
					System.out.println("A expressão não é booleana");
				}
			}
		}else {
			if (exps.length > 1) {
				String classeDaExp = node.getClass().getSimpleName().toString();
				if (classeDaExp.contains("ALogica") || classeDaExp.contains("ARelacional")) {
					if (exps.length <= 2) {
						for (String exp : exps) {
							if (!exp.equals("verdadeiro") || !exp.equals("falso")) {
								System.out.print("A expressao não é booleana");
							}
						}
					}else {
						for (String exp : exps) {
							if (!exp.equals("verdadeiro") || !exp.equals("falso")) {
								System.out.print("A expressao não é booleana");
							}
						}
					}
				}
			}
		}
	}
}
