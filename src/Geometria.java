import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList <Figura2D> figura = new ArrayList<>();
		figura.add(new Quadrado(5));
		figura.add(new Triangulo(4, 3));
		figura.add(new Losango(4, 8));
		figura.add(new Retangulo(7, 2));
		figura.add(new Circulo(4));
		
		
		System.out.println("Valor das Figuras 2D");
		for (Figura2D fig:figura) {
			System.out.println("Área da figura: "  + fig.area() + "cm²");
			
			if (fig instanceof Diagonal) {
				System.out.println("Valor da Diagonal: " + ((Diagonal)fig).calcDiag());
				
			} 
		}	
	}
}
