package circle;

public class Circle {
	private double radio;
	private String color;
	private String color2;
	private String color3;
	
	public Circle (){
radio =2;
color = "azul";
color2 = "rojo";
color3 = "rojo";
	}

public Circle (double r){
	radio=r;
	color = "azul";
	color2= "rojo";
	color3 = "rojo";
}
public double getRadio(){
	return radio;
	
}
public String getColor(){
	return color;
}
public String getColor2(){
	return color2;
}
public String getColor3(){
	return color3;
}
public double getArea(){
	return radio*radio*Math.PI;

}

}
