package calculadora;

public class Datos {

	// Clase donde se declaran las variables: numeros a ingresar, el resultado  y el simbolo de operación. 
	
	private float nro1;
	private float nro2;
	private float resultado;
	private String operacion;
	
	// Generación de Get y Set, para usar las variables en la clase main "Calculadora"
	
	public float getNro1() {
		return nro1;
	}
	public void setNro1(float nro1) {
		this.nro1 = nro1;
	}
	public float getNro2() {
		return nro2;
	}
	public void setNro2(float nro2) {
		this.nro2 = nro2;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	
}
