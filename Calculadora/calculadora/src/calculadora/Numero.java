package calculadora;

public class Numero {
protected double numero1;
protected double numero2;
protected String operacao;
protected double resultado;


public double getNumero1() {
	return numero1;
}
public void setNumero1(double numero1) {
	this.numero1 = numero1;
}
public double getNumero2() {
	return numero2;
}
public void setNumero2(double numero2) {
	this.numero2 = numero2;
}
public String getOperacao() {
	return operacao;
}
public void setOperacao(String operacao) {
	this.operacao=operacao;
}
public double getResultado() {
	return resultado;
}
public void setResultado(double resultado) {
	this.resultado=resultado;
}


public void executandoOperacao(){
	
	switch (this.getOperacao()){
		case "+":
		double resultadoSoma=this.getNumero1()+this.getNumero2();
		this.setResultado(resultadoSoma);	

		break;
		case "-":
		
	}
}



}
