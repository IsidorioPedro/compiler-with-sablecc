package compilador;

import java.util.Map;
import java.util.HashMap;

public class Simbolo {
	    String tipo;
	    Boolean atribuido;
	    Map<String,String> parametro;

	    public Simbolo(String tipo, Boolean atribuido) {
	        this.tipo = tipo;
	        this.atribuido = atribuido;
	        this.parametro = new HashMap<>();
	    }
	    
	    public void set_Map(Map<String, String> lista) {
	        // Copia todos os elementos do map 'lista' para o map 'parametro'.
	        if (lista != null) {
	            this.parametro.putAll(lista);
	        }
	    }

	    public void valor_atribuido() {
	        atribuido = true;
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
