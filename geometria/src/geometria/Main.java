package geometria;

public class Main {

	public static void main(String[] args) {

		// Teste da classe Quadrado
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.setLado(6);

		double areaPrimeiroQuadrado = primeiroQuadrado.calculaArea();
		System.out.println("?rea quadrado: " + areaPrimeiroQuadrado);

		System.out.println("Desenho quadrado: ");
		primeiroQuadrado.desenhar();
		
		System.out.println("-------------------------------------------------");

		// Teste da classe Retangulo
		Retangulo primeiroRetangulo = new Retangulo();
		primeiroRetangulo.setBase(12);
		primeiroRetangulo.setAltura(6);

		double areaPrimeiroRetangulo = primeiroRetangulo.calculaArea();
		System.out.println("?rea ret?ngulo: " + areaPrimeiroRetangulo);

		System.out.println("Desenho ret?ngulo: ");
		primeiroRetangulo.desenhar();
		
		System.out.println("-------------------------------------------------");

		// Teste da classe Circulo
		Circulo primeiroCirculo = new Circulo();
		primeiroCirculo.setRaio(4);

		double areaPrimeiroCirculo = primeiroCirculo.calculaArea();
		System.out.println("?rea c?rculo: " + areaPrimeiroCirculo);
		
		System.out.println("Desenho c?rculo: ");
		primeiroCirculo.desenhar();
		
		System.out.println("-------------------------------------------------");

		// Teste da classe Retangulo
		Triangulo primeiroTriangulo = new Triangulo();
		primeiroTriangulo.setBase(12);
		primeiroTriangulo.setAltura(6);

		double areaPrimeiroTriangulo = primeiroTriangulo.calculaArea();
		System.out.println("?rea tri?ngulo: " + areaPrimeiroTriangulo);
		
		System.out.println("Desenho tri?ngulo: ");
		primeiroTriangulo.desenhar();
	}
}
