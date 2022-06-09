package calculadora;

public class Numero {
protected double numero;

public double getNumero() {
	return numero;
}
public void setNumero(double numero) {
	this.numero = numero;
}


public void numeroDigitado(String botaoPrecionado) {
	double numeroPrecionado=0;
	String botaoPrecionadoAtribuido="0";
	
	if(this.getNumero()==0) {
		
		botaoPrecionadoAtribuido= botaoPrecionado;
		
	}else {
		
		botaoPrecionadoAtribuido= botaoPrecionadoAtribuido + botaoPrecionado;
	}
	
	numeroPrecionado= Double.parseDouble(botaoPrecionadoAtribuido);
	this.setNumero(numeroPrecionado);
}



}
