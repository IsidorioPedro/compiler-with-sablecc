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
	    }

	@Override
	public void outABlocoBloco(ABlocoBloco node) 
	    {
	        pilhaTabelaSimbolos.pop();
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
					System.out.println("Var " + parametro);
					Parametro.put(var, parametro);
				}else {
					String var = p.toString().split(" ")[1];
					String parametro = p.toString().split(" ")[0];
					System.out.println("Var "+ parametro);
					Parametro.put(var, parametro);
				}
			}
			System.out.println("Key " + node.getId().toString());
			System.out.println("Tipo " + node.getTipoRetorno().toString());
			String key = node.getId().toString();
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
	
	@Override
    public void outAAtribAtrib(AAtribAtrib node) {
        HashMap<String, Simbolo> tabelaDeSimbolos = pilhaTabelaSimbolos.peek();
        String key = node.getVar().toString().split(" ")[0];

        Optional<Simbolo> simboloOpt = Optional.ofNullable(tabelaDeSimbolos.get(key));
        if (simboloOpt.isPresent()) {
            Simbolo simbolo = simboloOpt.get();
            simbolo.valor_atribuido();
        } else {
            System.out.println("ERRO: " + node.getVar().toString() + " não foi declarado.");
        }
    }
}
