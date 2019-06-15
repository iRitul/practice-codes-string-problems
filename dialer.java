class WrongInputException extends Exception {
	WrongInputException(String s) {
		super(s);
	}
}
class Input {
	void method(int i) throws WrongInputException {
		if(i>9||i<0)throw new WrongInputException("Wrong input");
	}
}
public class dialer {
	public static void main(String[] args) {
		try {
			new Input().method(34);
		} catch (WrongInputException wie) {
			System.out.println(wie.getMessage());
		}
	}
}