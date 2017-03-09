package circle;

public class Circleprueba {
	public static void main (String[]args){
		
	
	
	Circle c1 = new Circle();
	System.out.println("El circulo tiene un radio de :"+c1.getRadio()+" , area de "+ c1.getArea()+" y de color "+	c1.getColor());
	
	

	Circle c2 = new Circle(2.0);
	System.out.println("El circulo tiene un radio de :"+c2.getRadio()+" , area de "+ c2.getArea()+" y de color "+	c2.getColor2());
	

	Circle c3 = new Circle(1.0);
	System.out.println("El circulo tiene un radio de :"+c3.getRadio()+" , area de "+ c3.getArea()+" y de color "+	c3.getColor3());

	
}
}
