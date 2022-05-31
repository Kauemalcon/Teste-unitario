package Calculadora;

public class RetanguloTeste {

	Retangulo retangulo;
	
	public boolean testeCalcularArea() {
		retangulo = new Retangulo(10, 2);
		
		int resultadoEsperado = 20;
		
		int resultado = retangulo.calcularArea();
		
		if(resultado == resultadoEsperado) {
			return true;
		}
		else {
			return false;
		}
				
	}
	
	public boolean testeCalcularPerimetro() {
		retangulo = new Retangulo(5, 5);
		
		int resultadoEsperado = 20;
		
		int resultado = retangulo.calcularPerimetro();
		
		if(resultado == resultadoEsperado) {
			return true;	
		}
		else {
			return false;
		}
	}
}
