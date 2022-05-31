package Calculadora;

public class RetanguloMain {

	public static void main(String[] args) {
		RetanguloTeste teste = new RetanguloTeste();
		Retangulo retangulo = new Retangulo(5, 5);
		
		boolean resultado;
		
		resultado = teste.testeCalcularArea();
		System.out.println("Calcular Area: " + resultado);
		
		resultado = teste.testeCalcularPerimetro();
		System.out.println("Calcular Perimetro: " + resultado);
		
		int resultadoPerimetro = retangulo.calcularPerimetro();
		System.out.println("resultado do perimetro: " + resultadoPerimetro);
		
	}

}
