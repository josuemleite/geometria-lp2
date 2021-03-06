package geometria;

public class Triangulo {

	// Atributos
	private double base;
	private double altura;

	// M?todos
	public void setBase(double base) {
		if (base > 0) {
			this.base = base;
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}

	public double calculaArea() {
		double area = (base * altura) / 2;

		return area;
	}
	
	// Esta fun??o desenha um tri?ngulo (pir?mide)
	// Para isso, devemos saber o n?mero de pontos a ser utilizado na base,
	// multiplicar por dois (porque o tri?ngulo est? centralizado,
	// formando dois tri?ngulos, um de cada lado, que ser? preenchido por espa?os vazios) e subtra?do 2
	// (os pontos da base que fazem parte dos tri?ngulos laterais)
	// Para preencher os espa?os vazios, ap?s cada linha o valor total de espa?os deve ser subtra?do em uma unidade,
	// pois, a cada linha, o tri?ngulo aumenta (preenche)
	// Ap?s os espa?os ? esquerda, o tri?ngulo ? preenchido horizontalmente, de acordo com o valor de i (que aumenta a cada loop)
	// Obs.: neste caso, n?o ? necess?rio multiplicar a base por 2 e subtrair 2 pois foi colocado um ponto seguido de espa?o (. )
	// e isso corresponde a dois caracteres
	public void desenhar() {
		double espacos = base - 1;
		
		for (double i = 0; i < base; i++) {
			for (double j = 0; j < espacos; j++) {
				System.out.print(" ");
			}
			espacos = espacos - 1;
			for (double j = 0; j <= i; j++) {
				System.out.print(". ");
			}
			System.out.println();
		}
	}
}
