package compilador;

public class Simbolo {
	    String tipo;
	    Boolean atribuido;

	    public Simbolo(String tipo, Boolean atribuido) {
	        this.tipo = tipo;
	        this.atribuido = atribuido;
	    }

	    public void valor_atribuido() {
	        atribuido = true;
	    }
}
