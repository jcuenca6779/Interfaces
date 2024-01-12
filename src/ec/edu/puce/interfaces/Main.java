package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		r1.setBase(7);
		r1.setAltura(15);
		System.out.println("Área del rectángulo 1: " + r1.calcularArea());
		
		Triangulo triangulo = new Triangulo(5, 8);
	    System.out.println("Área del triángulo: " + triangulo.calcularArea());

	    Circulo circulo = new Circulo(3);
	    System.out.println("Área del círculo: " + circulo.calcularArea());
	}

}
