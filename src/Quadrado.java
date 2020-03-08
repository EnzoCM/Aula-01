

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(int lado) {
		super(lado, lado);
		
	}

	@Override
	public double calcDiag() {
		return super.getBase() * Math.sqrt(2);
	}
}
