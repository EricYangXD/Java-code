public class MySecondException extends Throwable {
	public MySecondException() {
		super();
	}

	public MySecondException(String msg) {
		super(msg);
	}

	public MySecondException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public MySecondException(Throwable cause) {
		super(cause);
	}
}