package compilador;

import java.util.Map;
import java.util.HashMap;

public class Simbolo {
	    String tipo;
	    Boolean atribuido;
	    Boolean inicial;
	    Map<String,String> parametro;

	    public Simbolo(String tipo, Boolean atribuido, Boolean inicial) {
	        this.tipo = tipo;
	        this.atribuido = atribuido;
	        this.inicial = inicial;
	        this.parametro = new HashMap<>();
	    }
	    
	    public void set_Map(Map<String, String> lista) {
	        // Copia todos os elementos do map 'lista' para o map 'parametro'.
	        if (lista != null) {
	            this.parametro.putAll(lista);
	        }
	    }
	    
	    public Map<String,String> get_Map(){
	    	return this.parametro;
	    }

	    public void valor_atribuido() {
	        atribuido = true;
	    }
	    
	    public Boolean get_valor_atribuido() {
	    	return this.atribuido;
	    }
	    
	    public Boolean get_inicial() {
	    	return this.inicial;
	    }
	    
	    public String get_tipo() {
	    	return this.tipo;
	    }
	    
	    @Override
	    public String toString() {
	        return "Simbolo{" +
	                "tipo='" + tipo + '\'' +
	                ", atribuido=" + atribuido +
	                ", parametro=" + parametro +
	                '}';
	    }
}
