package exception;

public class ExcepEx {

	public static void main(String[] args) throws TestException {
		// TODO Auto-generated method stub
		try {
		throw new TestException("test");

	}
		catch(TestException t) {
			System.out.println(t.getMessage());
		}

}
}




