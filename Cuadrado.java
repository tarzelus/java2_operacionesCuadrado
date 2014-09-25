
public class Cuadrado {

	static final double NUM_PI = 3.1416;

	private double alto1 = 0;
	private double ancho1 = 0;
	private double result;	  
	private double area;
	private double perimetro;

//metodo para calcular el perimetro del cuadrado
	public double perimetro() {

		double resultadoPerimetro;

		resultadoPerimetro = 2*this.getAlto()+ 2* this.getAncho();
		return resultadoPerimetro;
	}

// Metrodo para calcular erl area del cuadrado
	public double area() {

		double resultadoArea;

		resultadoArea =this.getAlto()*this.getAncho();

		return resultadoArea;
	}
//definiendo los get y set

	public double getAlto() {

		return alto1;
	}	

	public void setAlto(double alto) {

		alto1 = alto;
	} 

        public double getAncho() {

		return ancho1;
	}	

	public void setAncho(double ancho) {

		ancho1 = ancho;
	} 
}
























