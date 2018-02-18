package br.com.cert.labs.classdesign;

class LivingBeing {}
class Man extends LivingBeing {}
class Snake extends LivingBeing {}
class Tree {}

public class CastTest {

	public static void main(String[] args) {
			LivingBeing livingBeing = new Man();
			Snake snake = (Snake) livingBeing;
			//Tree tree = (Tree) livingBeing; //COMPILE ERROR
	}

}
