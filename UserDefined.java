class WrongInputException extends Exception {
	WrongInputException(String s) {
		super(s);
	}
}
class Input {
	void method(int i) throws WrongInputException {
	if(i<0||i>9)
		throw new WrongInputException("Wrong input");
	}
}
public class UserDefined{
	public static void main(String[] args) {
		try {
			new Input().method(34);
		} catch (WrongInputException wie) {
			System.out.println(wie.getMessage());
		}
	}
}