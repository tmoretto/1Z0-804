package br.com.cert.labs.exceptions;

public class AutoCloseTest implements AutoCloseable {

	public static void main(String[] args) {
		try (AutoCloseTest autoCloseTest = new AutoCloseTest()) {
			autoCloseTest.work();
		} catch (MyException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void close() throws Exception {
		System.out.println("close()");
		throw new RuntimeException("Exception in close()");
	}
	
	public void work() throws MyException {
		System.out.println("work()");
		throw new MyException("Exception in work()");
	}

}

class MyException extends Exception {

	public MyException(String string) {
		super(string);
	}
	
	
	
}
