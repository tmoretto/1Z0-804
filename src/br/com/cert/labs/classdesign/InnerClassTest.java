package br.com.cert.labs.classdesign;

import java.util.concurrent.ExecutorService;

public class InnerClassTest {
	
}

class Line {
	class Point { public int x,y; }
	public Point getPoint() { return new Point();}
}

class Circle {
	public Circle() {
		Line.Point p = new Line().new Point();
		Line.Point p1 = (new Line()).getPoint(); //Correct, must declare OuterClassName.InnerClass
		//Point p1 = (new Line()).getPoint(); //Wrong
	}

}

