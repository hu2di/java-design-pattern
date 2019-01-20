package io.github.hu2di.factory.abstractfactory;

public class Run {

	public static void main(String[] args) {
		//get ColorFactory
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
		Color color2 = colorFactory.getColor("green");
		color2.fill();
		Color color3 = colorFactory.getColor("blue");
		color3.fill();
		
		//get ShapeFactory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape shape1 = shapeFactory.getShape("rectangle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("square");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("circle");
		shape3.draw();
	}
}
