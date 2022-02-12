package prog12_2.employeeinfo;

public class OverdrawnAccountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OverdrawnAccountException() {
		super();
	}

	public OverdrawnAccountException(String messsge) {
		super(messsge);
	}

	public OverdrawnAccountException(Throwable throwable) {
		super(throwable);
	}

}
